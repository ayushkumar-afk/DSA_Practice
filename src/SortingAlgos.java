import java.util.ArrayList;
import java.util.List;

public class SortingAlgos {
    //Bubble sort




   public static void main(String[] args){
       int[] array = {7,8,9,11,12};
//       int[] Sortedarray = CyclicSortForHardProblemLeetcode(array);


       System.out.println(firstMissingPositive(array));

//       for(int i = 0;i< Sortedarray.length;i++){
//           System.out.println(Sortedarray[i]);
//       }


//           List<Integer> Values = new ArrayList<>();
//
//           for( int i = 0; i < Sortedarray.length ;i ++){
//               if(Sortedarray[i] != (i+1)){
//                   Values.add(Sortedarray[i]);
//
//               }
//           }
//           System.out.println(Values);

   }
     static int[] BubbleSort(int[] array){
         for(int i = 0;i <array.length-1;i++){
             for(int j = 1;j<(array.length)-i;j++){
                 if(array[j]<array[j-1]){
                     array[j] = array[j]^array[j-1];
                     array[j-1]=array[j]^array[j-1];
                     array[j]=array[j]^array[j-1];
                 }
             }
         }
         return array;
     }

     //Selection Sort Algo
    static int[] SelectionSort(int[] array){

       for( int i = 0 ; i < array.length;i++){
           int max = 0;
           for(int j = 1;j< array.length-i;j++){
               if( array[max] < array[j]){
                   max = j;
               }

           }
           int lastUnsortedindex  = array.length-i-1;

           if(max != lastUnsortedindex){
               array[max] = array[lastUnsortedindex]^ array[max];
               array[lastUnsortedindex]  = array[lastUnsortedindex]^ array[max];
               array[max] =array[lastUnsortedindex]^ array[max];

           }


       }
       return array;
    }
    // Insertion Sort algo

    static int[] InsertionSort (int[] array){
       for( int i =0 ; i < array.length-1;i++){
           for ( int j = i+1;j >=0 ; j--){

               if( j >0 && (array[j]<array[j-1])){
                   array[j] = array[j]^array[j-1];
                   array[j-1]=array[j]^array[j-1];
                   array[j]=array[j]^array[j-1];
               } else if(j >0 && (array[j]>array[j-1])){
                   break;
               }

           }
       }
       return array;
    }

    static int[] CyclicSort(int[] array){
       int i = 0;

       while(i < array.length){
           int CorrectindexValue = array[i]-1;
           if(array[i]!= array[CorrectindexValue]){
               array[i] = array[CorrectindexValue]^array[i];
               array[CorrectindexValue] =  array[CorrectindexValue]^array[i];
               array[i] =  array[CorrectindexValue]^array[i];
           }else {
               i++;
           }
       }
       return array;
    }

// Here the range is from 0 to n and find the value that is missing in it !!
    static int[] Missingno(int[] array){
        int i = 0;

        while(i < array.length){
            int CorrectindexValue = array[i];
            if(CorrectindexValue< array.length && array[i]!= array[CorrectindexValue]){
                array[i] = array[CorrectindexValue]^array[i];
                array[CorrectindexValue] =  array[CorrectindexValue]^array[i];
                array[i] =  array[CorrectindexValue]^array[i];
            }else {
                i++;
            }
        }
        return array;
    }
//448. Find All Numbers Disappeared in an Array
    static int[] NumbersDisappeared(int[] array){
        int i = 0;

        while(i < array.length){
            int CorrectindexValue = array[i]-1;
            if(array[i]!= array[CorrectindexValue]){
                array[i] = array[CorrectindexValue]^array[i];
                array[CorrectindexValue] =  array[CorrectindexValue]^array[i];
                array[i] =  array[CorrectindexValue]^array[i];
            }else {
                i++;
            }
        }
        return array;
    }

    static List<Integer> ansofNumbersDisappered(int[] array){
       List<Integer> Values = new ArrayList<>();

            for( int i = 0; i < array.length ;i ++){
                if(array[i]!=i){
                    Values.add(i);
                    continue;
                }
            }
            return Values;
    }

    // Set mismatch Quesiton

    static int[] SetMismatch(int[] array){
            int[] newarray = CyclicSort(array);
            int[] AnsValues = {1,2};

            for( int i = 0 ; i < newarray.length ;i++){
                if( i+1 != newarray[i]) {

                    AnsValues[0] = i+1;
                    AnsValues[1] = newarray[i];
                }
            }
        return AnsValues;
    }
    //Leetcode Hard First Missing Positive integer
    static int firstMissingPositive(int[] nums) {
            int[] SortedArray = CyclicSortForHardProblemLeetcode(nums);

            for( int i = 0 ; i <SortedArray.length;i++){
                if( SortedArray[i] != i+1){
                    return i+1;
                }
            }
            return SortedArray.length+1;

    }

    static int[] CyclicSortForHardProblemLeetcode(int[] array){
        int i = 0;

        while(i < array.length){
            int CorrectindexValue = array[i]-1;
            if(  array[i]>0 && array[i] <= array.length &&  array[i]!= array[CorrectindexValue]){
                array[i] = array[CorrectindexValue]^array[i];
                array[CorrectindexValue] =  array[CorrectindexValue]^array[i];
                array[i] =  array[CorrectindexValue]^array[i];
            }else {
                i++;
            }
        }
        return array;
    }


}
