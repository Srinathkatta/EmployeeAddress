package com.Srinath.EmployeeAddress.service;




import com.Srinath.EmployeeAddress.model.Address;
import com.Srinath.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added !!";
    }

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long addId) {
        return addressRepo.findByAddressId(addId);
    }

    public String updateAddressById(Long addId, String street) {
        if(addressRepo.existsById(addId)){
            addressRepo.findByAddressId(addId).setAddressStreet(street);
            addressRepo.save(addressRepo.findByAddressId(addId));
            return "Address Street Updated !!";
        }
        return "No such Address exist !!";
    }

    public String deleteById(Long addId) {
        if(addressRepo.existsById(addId)){
            addressRepo.deleteById(addId);
            return "deleted Successfully";
        }
        return "mo such address exist!!";
    }
}

