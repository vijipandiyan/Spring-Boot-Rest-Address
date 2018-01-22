package core.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import core.model.Address;
import core.repositories.AddressRepository;
@Component
@Transactional
public class AddressDao {

	AddressRepository addRepo;
	
	@Autowired
	public void setAddressRepository(AddressRepository addRepo) {
		this.addRepo= addRepo;
	}
	
	public Address getAddressForAddId(long addId) {
		
		return addRepo.findOne(addId);
		
	}
	
	public Address getAddressForEmpId(long empId) {
		
	
		return addRepo.getAddressByEmpId(empId);
		
	}
	
	 public List<Address> getAllAddresses() {
	        return addRepo.findAll();
	    }
}
