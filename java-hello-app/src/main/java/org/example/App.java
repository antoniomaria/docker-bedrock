package org.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Press ENTER to quit");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
