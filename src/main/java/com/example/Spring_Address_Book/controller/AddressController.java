package com.example.Spring_Address_Book.controller;

import com.example.Spring_Address_Book.model.AddressBook;
import com.example.Spring_Address_Book.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class AddressController {
    @Autowired
    private AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService=addressService;
    }
    @PostMapping
    public AddressBook createBook(@RequestBody AddressBook addressBook){
        return addressService.createBook(addressBook);
    }
    @GetMapping("/{id}")
    public AddressBook getById(@PathVariable Long id){
        return addressService.getById(id);
    }
    @GetMapping
    public List<AddressBook> getAll(){
        return addressService.getAll();
    }
    @PutMapping
    public AddressBook update(@PathVariable Long id,@RequestBody AddressBook addressbook){
        return addressService.update(id,addressbook);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        addressService.deleteById(id);
    }
}
