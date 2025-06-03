import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        Scanner inn = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(12);
//        list.add(5);
//        list.add(142);
//        list.add(126);
//        list.add(124);
//
//        for( int i = 0; i < 5;i++){
//            list.add(in.nextInt());
//        }
//        for( int i = 0;i<10;i++){
//            System.out.println(list.get(i));
//        }

//        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
//        // initialization part it is
//        for ( int i = 0; i < 3 ;i++){
//            lists.add(new ArrayList<>());
//        }
//        // adding the values in it
//        for( int i = 0; i <3;i++){
//            for( int j = 0 ; j < 3;j++){
//                lists.get(i).add(inn.nextInt());
//            }
//        }

//        System.out.println(lists);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 5;
        array[2] = 10;
        array[3] = 2;
        array[4] = 3;

       reverse(array);
       System.out.println(Arrays.toString(array));


    }
   static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;


    }

    static  void reverse(int[] arr){
        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            swap(arr , start,end);
            start++;
            end--;
        }
    }
}