package Week2_Assignment.Q3_Assignment2;

/*
Create an abstract class Employee with: -
• An abstract method calculateSalary()
• A concrete method displayDetails()
• Create two subclasses: -
o FullTimeEmployee
o PartTimeEmployee
Override calculateSalary() in both classes and demonstrate runtime polymorphism.
 */

abstract class Employee{
    abstract int calculateSalary();
    public String displayDetails(){
        return "Employee Details";
    }
}

class FullTimeEmployee extends Employee {
    @Override
    int calculateSalary() {
        return 123;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    int calculateSalary() {
        return 12345;
    }
}

class anyClass {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());

    }
}