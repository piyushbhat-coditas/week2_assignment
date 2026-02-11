package oops;

class Car {
    String brand;
    String color;

    void display() {
        System.out.println(brand + " " + color);
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.color = "Black";

        car1.display();
        car2.display();
    }
}
