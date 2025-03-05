package com.example.Spring_Address_Book.dto;

public class AddressBookDTO {
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;

    public AddressBookDTO(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public AddressBookDTO(String name, Long id, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //getter setter
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
