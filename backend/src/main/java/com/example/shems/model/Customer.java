package com.example.shems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer") // Ensure this matches the case of your table name in MySQL
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID") // This should match the exact column name in your database
    private Integer CustomerID;

    @Column(name = "FirstName", length = 100) // Match this with your database column name
    private String FirstName;

    @Column(name = "LastName", length = 100) // Match this with your database column name
    private String LastName;

    @Column(name = "Address", length = 200) // Match this with your database column name
    private String Address;

    @Column(name = "Email", length = 100, unique = true) // Match this with your database column name
    private String Email;

    @Column(name = "Phone", length = 15) // Match this with your database column name
    private String Phone;

    // Getters and setters

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
}
