public class StringBufferDemo {
    public static void main(String[] args){
//        StringBuffer sb = new StringBuffer("Piyush");
//        StringBuffer abc = new StringBuffer(500);  //Now we have explicitly given the length of the string buffer object to be 500.
//        System.out.println(sb.capacity());   //22
//        System.out.println(abc.capacity());   //500
//        System.out.println(sb);    //Piyush
//        System.out.println(sb.capacity());    //22, it will print the default capacity of string which is 16 + the length of string which was 6 in this case.
//
//        sb.append("Bhat");


        StringBuffer sb = new StringBuffer("Heloi");
        sb.append("piyush ");
        sb.append("piyush ");
        sb.append("piyush ");
        System.out.println(sb.capacity());
    }
}


