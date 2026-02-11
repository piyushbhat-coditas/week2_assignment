public class constructor {
    String name;
    int id;

    constructor(){
        this.name="kere";
        this.id= 123;
    }

}

class test{
    public static void main(String[] args){
        constructor c=new constructor();
        System.out.println(c.name);
        System.out.println(c.id);
    }
}