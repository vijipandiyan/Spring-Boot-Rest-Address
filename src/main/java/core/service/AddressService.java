package core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import core.dao.AddressDao;
import core.model.Address;
@Component
@Service
public class AddressService implements IAddressService {

	AddressDao dao;
	
	@Autowired
	public void setAddressDao(AddressDao dao) {
		this.dao = dao;
	}
	
	public Address getAddressForAddId(long addId) {
		
		return dao.getAddressForAddId(addId);
	}

	@Override
	public Address getAddressForEmpId(Long empId) {
		return dao.getAddressForEmpId(empId);	}
}
