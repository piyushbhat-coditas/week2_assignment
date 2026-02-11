//public class exception {
//    public static void main(String[] args) {
//
//        int[] numerator = {1, 3, 6, 45};
//        int[] denominator = {1, 3, 0, 45};
//
//        try {
//            for (int i = 0; i < numerator.length; i++) {
//                System.out.println(numerator[i] / denominator[i]);
//            }
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        //take two inputs and handle exception division by zero
//        int a=4;
//        int b=0;
//
//
//
//        try{
//            int divide = a/b;
//            System.out.println(divide);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//
//    }
//}



//Exception Handling in Java

public class exception{
    public static void main(String[] args){
        int a=12;
        int b=0;

        try{
            int divide = a/b;
            System.out.println(divide);
        }
        catch(ArithmeticException e){
            e.printStackTrace();   //it will print all three details, Exception name, Description and Stack Trace.
//            System.out.println(e);    //this will only print name and description.
            e.toString();    //this will only print name and description.
        }
    }
}