//Encapsulation, private, getter and setter.

package testPackage;

public class car {

        String colour="Black";
        String carName="XUV";
        private int year=2026;
        private String Brand="Mahindra";



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    public void drive(){
        System.out.println("vroom vroom");
    }
}
