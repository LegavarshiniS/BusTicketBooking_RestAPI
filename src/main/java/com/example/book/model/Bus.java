package com.example.book.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
     @Id
     private int eid;
     public int getEid() {
      return eid;
    }
    public void setEid(int eid) {
      this.eid = eid;
    }
    private String fname;
     private String lname;
     private String email;
     private String source;
     private String destination;
     private int seatno;
     private String state;
     private String country;
     private int pincode;
     private int price;
    public Bus() {
    }
    public Bus(int eid, String fname, String lname, String email, String source, String destination, int seatno,
        String state, String country, int pincode, int price) {
      this.eid = eid;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.source = source;
      this.destination = destination;
      this.seatno = seatno;
      this.state = state;
      this.country = country;
      this.pincode = pincode;
      this.price = price;
    }
    public String getFname() {
      return fname;
    }
    public void setFname(String fname) {
      this.fname = fname;
    }
    public String getLname() {
      return lname;
    }
    public void setLname(String lname) {
      this.lname = lname;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getSource() {
      return source;
    }
    public void setSource(String source) {
      this.source = source;
    }
    public String getDestination() {
      return destination;
    }
    public void setDestination(String destination) {
      this.destination = destination;
    }
    public int getSeatno() {
      return seatno;
    }
    public void setSeatno(int seatno) {
      this.seatno = seatno;
    }
    public String getState() {
      return state;
    }
    public void setState(String state) {
      this.state = state;
    }
    public String getCountry() {
      return country;
    }
    public void setCountry(String country) {
      this.country = country;
    }
    public int getPincode() {
      return pincode;
    }
    public void setPincode(int pincode) {
      this.pincode = pincode;
    }
    public int getPrice() {
      return price;
    }
    public void setPrice(int price) {
      this.price = price;
    }
    
}