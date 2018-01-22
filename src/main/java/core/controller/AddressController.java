package core.controller;
import org.springframework.web.bind.annotation.RestController;

import core.model.Address;
import core.repositories.AddressRepository;
import core.service.IAddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	IAddressService service;
		
	public void setIAddressService(IAddressService service) {
		this.service = service;
	}
	AddressRepository addRepo;
	
	@Autowired
	public void setAddressRepository(AddressRepository addRepo) {
		this.addRepo= addRepo;
	}
	
	@RequestMapping("hello")
	public Address welcome() {
		//return "Hello to address Rest Service";
		return new Address(1,2);
	}
	
    @GetMapping("/list")
    public List<Address> getAllAddresses() {
        return addRepo.findAll();
    }
	
	@GetMapping("/{addId}")
	public  Address getAddress(@PathVariable(value = "addId") Long addId) {
		
				
		return service.getAddressForAddId(addId);
		
	}
	
	@GetMapping("/emp/{empId}")
	public  Address getAddressByEmpId(@PathVariable(value = "empId") Long empId) {
		
				
		return service.getAddressForEmpId(empId);
		
	}
}
