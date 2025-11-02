package com.driver;

public class Main {

    // Task 1: create a class Product inside Main class
    public static class Product {

        // Task 3: create method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Task 2: create object of Product in Main function
        Product p = new Product();

        // Call each overloaded method
        System.out.println("Product of 3 and 4 (int,int): " + p.product(3, 4));
        System.out.println("Product of 2, 3, and 4 (int,int,int): " + p.product(2, 3, 4));
        System.out.println("Product of 2.5 and 4.0 (double,double): " + p.product(2.5, 4.0));
    }
}
