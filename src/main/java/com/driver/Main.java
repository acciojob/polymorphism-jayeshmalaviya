package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(2,3);
        int ans1 = p.product(2,3,4);
        int ans2 = p.product(2,3);
        System.out.println(ans + " " + ans1 + " " + ans);
    }

    public static class Product{

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}