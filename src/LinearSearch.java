import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {00,00,000,0,000};

        // here is the array list to make upon it

        int[][] array = {
                {1,2,3},
                {4},

        };
      //  System.out.println(Arrays.toString(twodarraySearch(array,4)));
      //  System.out.println(LinearSearchh(arr,7));
      //  String name = "Ayush Kumar";
        // here is how to convert the values from the String to arrays
     //   System.out.println(Arrays.toString(name.toCharArray()));
    //    System.out.println(MinumumNo(arr));

    //    System.out.println(returnevennocounter(arr));
      //  System.out.println(returnnoofevennointheok(arr));
        System.out.println(RichestCustomerWealth(array));
    }

    static int LinearSearchh(int[] arr, int value){
        // this will be base for the value zero
        if(arr.length == 0){
            return -1;
        }
        for( int i = 0 ; i < arr.length ;i++){
            if( arr[i] ==  value){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    static int MinumumNo( int[] arr){
        if( arr.length == 0){
            return 0;
        }
        int min_no = Integer.MAX_VALUE;

        for( int i = 0; i< arr.length;i++){
            if( arr[i] < min_no){
                min_no = arr[i];
            }
        }
        return  min_no;
    }

    static int[] twodarraySearch(int[][] array, int targetvalue){

        for( int i = 0; i < array.length; i++){
            for( int j = 0 ; j <array[i].length ; j++){
                if(array[i][j] == targetvalue){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0, 0};
    }

    static int returnevennocounter(int[] array){
            int counter = 0;
        for( int i = 0; i < array.length; i++){
            if( (array[i] & 1) == 0){
                counter++;
            }
        }
        return counter;
    }

    static int returnnoofevennointheok(int[] arr){
        int counter = 0;
        int BigCounter = 0;




        for( int i = 0 ; i < arr.length; i++){
            int num = Math.abs(arr[i]);

            //edge case for the value zero
            if( num == 0){
                counter++;
            }else {
            while(num > 0) {
                int last_digit = num % 10;
                counter++;
                num = num / 10;
            }
            }

            if((counter & 1) == 0){
                BigCounter++;
            }
            counter =0;

        }
        return BigCounter;
    }

    static int RichestCustomerWealth(int[][] accounts){
// this is the edge case
        if( accounts.length == 0 ){
            return 0;
        }
        int semifinal = 0;
        int finalvalue = 0;

        for( int i = 0; i < accounts.length;i++){
            for(int  j = 0; j< accounts[i].length;j++){
             semifinal += accounts[i][j];
            }
            if(semifinal > finalvalue){
                finalvalue = semifinal;
            }
            semifinal = 0;
        }
        return finalvalue;
    }





}



