public class Recurssion {
    public static  void main(String[] args){
        int n = 3;
//        message(n);
        System.out.println(FiboRecusive(n));

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
}


