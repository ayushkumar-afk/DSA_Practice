public class SortingAlgos {
    //Bubble sort




   public static void main(String[] args){
       int[] array = {3,1,5,4,2};
       int[] Sortedarray = SelectionSort(array);

       for(int i = 0;i< Sortedarray.length;i++){
           System.out.println(Sortedarray[i]);
       }
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

}
