package com.mycompany.ordertracking;

public class Main{

    public static void main(String[] args) {
        Product phone = new Product("Iphone 15", 1500);
        Product laptop = new Product("Asus TUF", 2000);
        Product ps = new Product("Play Station 5 Slim", 1800);
        
        Customer c1 = new Customer();
        c1.setName("John Blue");
        c1.setEmail("johnblue@gmail.com");        
        Customer c2 = new Customer("Jane Doe", "jane_doe123@outlook.com");
        
        Order o1 = new Order(123, c1);
        o1.setProduct(phone);
        
        Order o2 = new Order(456, c2);
        o2.setProduct(ps);
        
        o1.displayOrder();
        o2.displayOrder();
        
        o1.applyTax(18);
        o1.displayOrder();
        
    }
}
