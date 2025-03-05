package com.example.Spring_Address_Book.service;

import com.example.Spring_Address_Book.dto.AddressBookDTO;
import com.example.Spring_Address_Book.model.AddressBook;
import com.example.Spring_Address_Book.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressrepository;
    public AddressService(AddressRepository addressrepository){
        this.addressrepository=addressrepository;
    }
    public AddressBook createBook(AddressBook addressBook){
        return addressrepository.save(addressBook);
    }
    public AddressBook getById(Long id){
        return addressrepository.findById(id).orElseThrow(() -> new RuntimeException ("AddressBook Not found:"));
    }
    public List<AddressBook>getAll(){
        return addressrepository.findAll();
    }
    public AddressBook update(Long id,AddressBook addressBook){
        Optional<AddressBook>opt=addressrepository.findById(id);
        if(opt.isPresent()){
            AddressBook addressBook1=opt.get();
            addressBook1.setName(addressBook.getName());
            addressBook1.setEmail(addressBook.getEmail());
            addressBook1.setPhoneNumber(addressBook.getPhoneNumber());
            return addressrepository.save(addressBook1);
        }
        return null;
    }
    public String deleteById(Long id){
        if(addressrepository.existsById(id)){
            addressrepository.deleteById(id);
            return "Delete SuccessFully:";
        }else{
            return "Id not found";
        }
    }
}

