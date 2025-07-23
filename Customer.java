package com.mycompany.ordertracking;

public class Customer {
    private String name, email;
    public static int count = 0;
    
    Customer(){
        this.count++;
    }
    Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

