package com.example;

public class Main {
    public static void main(String[] args) {
    Product product1 = new Product();
    product1.setId("P001");
    product1.setName("Laptop");
    product1.setPrice(1500000);
    product1.setStock(10);

   Product product2 = new Product("P002", "Smartphone", 500000, 20);
     
   product1.setPrice(1400000);
   product1.setStock(8);


    System.out.println("Product 1:");
    System.out.println("ID: " + product1.getId());
    System.out.println("Name: " + product1.getName());
    System.out.println("Price: " + product1.getPrice());
    System.out.println("Stock: " + product1.getStock());

System.out.println("................................");

    System.out.println("Product 2:");
    System.out.println("ID: " + product2.getId());
    System.out.println("Name: " + product2.getName());
    System.out.println("Price: " + product2.getPrice());
    System.out.println("Stock: " + product2.getStock());
    }}




