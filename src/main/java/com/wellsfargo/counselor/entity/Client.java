package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    Client(long advisorId, String firstName, String lastName, String address, String phoneNumber){

        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public long getClientId() {return clientId;}
    public long getAdvisorId() {return advisorId;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAddress(String address) {this.address = address;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setClientId(long clientId) {this.clientId = clientId;}


}
