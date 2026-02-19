package com.example;


public class Main {

    public static void main(String[] args) {

    
        Product product1 = new Product();
        product1.setId("P001");
        product1.setName("Celular");
        product1.setPrice(1500000);
        product1.setStock(40);

    
        Product product2 = new Product("002", "Tv", 24000000, 100);

        
        product2.setPrice(20.0);
        product2.setStock(120);

    
        System.out.println("Nombre producto 1: " + product1.getName());
        System.out.println("Precio producto 1: " + product1.getPrice());

        System.out.println("-------------------------");

        System.out.println("Nombre producto 2: " + product2.getName());
        System.out.println("Stock producto 2: " + product2.getStock());

        System.out.println("-------------------------");

        
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}



