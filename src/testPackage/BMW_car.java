package testPackage;

public class BMW_car extends car {
    public void drive(){
        System.out.println("vroommm");
    }
}

class test{
    public static void main(String[] args){
        BMW_car bmcar = new BMW_car();
        car CAR = new car();

        CAR.drive();
        bmcar.drive();
    }
}
