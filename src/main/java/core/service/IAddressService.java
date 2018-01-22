package core.service;

import core.model.Address;

public interface IAddressService {

	public Address getAddressForAddId(long addid);

	public Address getAddressForEmpId(Long empid);
}
