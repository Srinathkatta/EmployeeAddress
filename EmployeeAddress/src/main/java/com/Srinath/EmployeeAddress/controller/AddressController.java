package com.Srinath.EmployeeAddress.controller;




import com.Srinath.EmployeeAddress.model.Address;
import com.Srinath.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping("addresses")
    public Iterable<Address> getAllAddress(){
        return  addressService.getAllAddress();
    }
    @GetMapping("address/{addId}")
    public Address getAddressById(@PathVariable Long addId){
        return addressService.getAddressById(addId);
    }
    @PostMapping("addresses/address/{addId}/addressStreet/{street}")
    public String updateAddressById(@PathVariable Long addId,@PathVariable String street){
        return addressService.updateAddressById(addId,street);
    }
    @DeleteMapping("address/{addId}")
    public String deleteById(@PathVariable Long addId){
        return addressService.deleteById(addId);
    }
}

