package com.mycompany.ordertracking;

public class Order {
    private int orderID;
    private Product product;
    private Customer customer;
    public static int count = 0;

    public Order() {
        this.count++;
    }

    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.count++;
    }
    
    public void displayOrder(){
        System.out.println("-- Order Information --");
        System.out.println("Order ID: "+ this.orderID);
        System.out.println("Customer Name: "+ this.customer.getName());
        System.out.println("Customer Email: "+this.customer.getEmail());
        System.out.println("Product Name: "+this.product.getName());
        System.out.println("Product price: "+this.product.getPrice());
    }
    
    public void applyTax(double taxAmount){
        double newPrice = (this.product.getPrice() * taxAmount / 100) + this.product.getPrice();
        this.product.setPrice(newPrice);
    }
    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
