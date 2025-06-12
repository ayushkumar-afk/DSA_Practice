public class Recurssion {
    public static  void main(String[] args){
        int n = 130402;
//        message(n);
        int[] array = {1,2,3,4,5,6,7,8};
        int Target = 5;
       // System.out.println(BinarySearchRecurrsive(array,Target,0, array.length-1));
        System.out.println(CountZeros(n));


    }
// simple Recurssive Problem
    static void message(int n){
        if( n == 6){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        message(n+1);

    }

    // Fibonacci Interation Problem to Solve
    static void FiboIteration(int n){
        int Firstno = 0;
        int SecondNo = 1;


        for( int i = 0 ; i<n;i++){
            System.out.println(Firstno );
         int  nextNo =  Firstno+SecondNo;
            Firstno = SecondNo;
           SecondNo = nextNo;



        }
    }

    static int FiboRecusive(int n){
        if(n == 1){
            return 1;
        }
        if( n == 0){
            return 0;
        }
        return FiboRecusive(n-1)+FiboRecusive(n-2);
    }

    //Binary Search Using the Recurssion
    static  int BinarySearchRecurrsive(int[] array ,int Target,int s, int e){

        if(s>e){
            return  -1;
        }
        int mid = s +(e-s)/2;

        if( array[mid]==Target){
            return  mid;
        }
        if( Target  < array[mid]  ){
            return  BinarySearchRecurrsive(array,Target,s,mid-1);
        }
        return BinarySearchRecurrsive(array,Target,mid+1,e);
    }


    //Some Basic Questions For the Recurssion to Work upon :-
    static void PrintnoReverse(int n){

        if( n == 0){
            return;
        }

        PrintnoReverse(n-1);
        System.out.println(n);

    }
    static int PrintnoMutlitle(int n){

        if( n == 1){

            return n;
        }

        return n*PrintnoMutlitle(n-1);


    }

    static int SumOfDigits(int n){
        int d = n%10;
        if(n == 0){
            return n;
        }


        return d+SumOfDigits(n/10);
    }
    static String ReverseNo(int n){
        String d = String.valueOf(n%10);
        if( n < 10){
            return  String.valueOf(n);
        }
        return d+ReverseNo(n/10);
    }

    // Reverse the No using the Helper Function For that to
    static  int ReverseHelperFunction(int n ){

        int digits = (int) Math.log10(n)+1;
        return HelperFucntion(n,digits);
    }

    static int HelperFucntion(int n, int digits){
        if(n<10){
            return  n;
        }
        int Remainder = n%10;
        return (int) (Remainder*Math.pow(10,digits-1)+HelperFucntion(n/10,digits-1));
    }


    //Count the no of Zeros in the No Provided :-

    static int CountZeros(int n){
        int Count = 0;
        while (n > 0){

            int d = n%10;

            if(d == 0 ){
                Count++;
            }
            n= n/10;
        }
        return Count;
    }





}


