//package oops;

abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with button");
    }
}
public void main(String[] args) {

    Vehicle v = new Bike();   // abstraction
    v.start();               // calls Bike's implementation
}





