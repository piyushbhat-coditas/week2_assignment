//public class ReverseArray{
//    public static void main(String[] args){
//        int[] num={1,5,8,0,4};
//        for(int i=num.length-1;i>=0;i--){
//            System.out.println("Reversed array:" + num[i]);
//        }
//    }
//}

//public class ReverseArray{
//    public static void main(String[] args){
//        int[] num={1,5,8,0,4};
//        int sum=0;
//        for(int i=0;i<=num.length-1;i++){
//            sum= sum+num[i];
//        }
//        System.out.println(sum);
//    }
//}


//public class arr{
//    static void main(String[] args){
//        int array[][]={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int i=0;i<array.length;i++){
//            for(int j=0;j<array.length;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class arr{
//    static void main(String[] args){
//        int array[][]={
//                {1,2,},
//                {4,5,6},
//                {7,8,9,8,4}
//        };
//        for (int i=0;i<array.length;i++){
//            for(int j=0;j<array.length;j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}



//Given an integer array, find max, min, average, evenCount and oddCount.

//public class arr{
//    public static void main(String[] args){
//        int array[]={1,2,3,4,5,6,7};
//        int max= Integer.MIN_VALUE;
//        int min= Integer.MAX_VALUE;
//        int average=0;
//        int evenCount=0;
//        int oddCount=0;
//
//        for(int i=0;i<array.length;i++){
//            if(array[i]>max){
//                max=array[i];
//            }
//            if(array[i]<min){
//                min=array[i];
//            }
//            average+=array[i];
//            if(array[i]%2==0){
//                evenCount+=1;
//            }
//            else{
//                oddCount+=1;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(average);
//        System.out.println(evenCount);
//        System.out.println(oddCount);
//    }
//}


public class arr{
    public static void main(String[] args){
        int[][] studentMarks = {
                {23,34,43,55},
                {32,12,54,65},
                {33,23,12,65}
        };

        int sum = 0;
        double percentage;

        for(int i=0;i<studentMarks.length;i++){
            for(int j=0;j<studentMarks[i].length;j++){
                sum += studentMarks[i][j];
            }
            percentage = (double) (sum*100)/250;
            System.out.println("Student "+ (i+1));
            System.out.println("Total sum: "+sum);
            System.out.println("Percentage: "+ percentage);
            sum = 0;
            percentage = 0;
        }
    }
}
