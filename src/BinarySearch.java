public class BinarySearch {
    public static void main(String[] args ){
        int[] array = {3,1};
        int target = 4;
        char[] arraychar = { 'x', 'x' ,'y','y'};
        char targetletter = 'z';

       // System.out.println(BinarySearch(array,target));
      //  System.out.println(CielingofNo(array,target));
    //    System.out.println(FloorofNo(array,target));
    //    System.out.println(LetterChecking(arraychar,targetletter));
     //   System.out.println(((array, target)));
     //   System.out.println(InfiniteSortedArraySearch(array,target));
    //    System.out.println(MountainArray(array));
    //    System.out.println(SearchPivot(array));
        System.out.println(searchroated(array,target));


    }
    static int BinarySearch(int[] array, int target,int start, int end){
//        int start = 0;
//        int end = array.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if( array[mid]==  target){
                return mid;
            }

            if( target < array[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;

    }
    static int CielingofNo(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        if( target >  array[end] ){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if( array[mid]==  target){
                return array[mid];
            }

            if( target < array[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }

        }


        return array[start];
    }

    static int FloorofNo(int[] array, int target ){
        int start = 0;
        int end = array.length-1;



        while (start <= end){
            int mid = start + (end - start)/2;
            if( array[mid]==  target){
                return array[mid];
            }

            if( target < array[mid]){

                end = mid -1;
            }else{
              //  floorvalue = array[mid];
                start = mid +1;
            }

        }


        return array[end];
    }
    static char LetterChecking(char[] array, int target){
        int start = 0;
        int end = array.length-1;

        if ( target >= array[end]){
            return array[0];
        }
        while (start <= end){
            int mid = start + (end - start)/2;


            if( target < array[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }

        }


        return array[start% array.length];
    }

    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
    int start = ForFirstIndex(nums,target,true);
    int end = ForFirstIndex(nums,target,false);
    ans[0] = start;
    ans[1] = end;

    return ans;
    }

    static int ForFirstIndex(int[] array, int target, boolean firstindexvalue){
        int start = 0;
        int end = array.length-1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;


            if( target < array[mid]){
                end = mid -1;
            }else if(target > array[mid]){
                start = mid +1;
            }else {
                //this will be our possible ans for the value
                ans = mid;

                if(firstindexvalue){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;

    }

    static int InfiniteSortedArraySearch(int[] array , int target){
        int start = 0;
        int end = 1;
        while(target > array[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;

        }
        return BinarySearchInfiniteOne(array,target,start,end);

    }
    static int BinarySearchInfiniteOne(int[] array, int target, int Start , int End){
        int start = Start;
        int end = End;

        while (start <= end){
            int mid = start + (end - start)/2;
            if( array[mid]==  target){
                return mid;
            }

            if( target < array[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;

    }

    static int MountainArray(int[] array){
        return BinaryMountainedone(array);
    }

    static int BinaryMountainedone(int[] array){
        int start = 0;
        int end = array.length-1;
        int value = -1;

        while (start < end){
            int mid = start + (end - start)/2;


            if( array[mid] > array[mid+1]){

               end = mid ;
                value = end;
            }else{
                start = mid +1;
            }
        }
        return value;

    }

    static int HardMountain(int[] array , int target){
            if( array.length < 3){
                return -1;
            }
            int PeakindexValue = BinaryMountainedone(array);
            int firstvalue = orderAgnosticBinarySearch(array,target,0,PeakindexValue);
            if(firstvalue != -1){
                return firstvalue;
            }else{
                return  orderAgnosticBinarySearch(array,target,PeakindexValue+1,array.length-1);
            }





    }
    static int orderAgnosticBinarySearch( int[] arrary, int target,int start, int end){
        if(arrary.length == 0){
            return -1;
        }

        boolean isAssending =  arrary[start] <= arrary[end];
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arrary[mid] == target){
                return  mid;
            }

            if(isAssending){
                if(target<arrary[mid]){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            }else {
                if(target > arrary[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }



        }
        return -1;
    }
    static int searchroated(int[] nums, int target) {
         int pivot  = SearchPivot(nums);
         if(pivot == -1){
             return BinarySearch(nums,target,0,nums.length-1);
         }
        if (target == nums[pivot]) {
            return pivot;
        }
         if(target >= nums[0]){
             return   BinarySearch(nums,target,0,pivot-1);
         } else {
              return  BinarySearch(nums,target,pivot+1, nums.length-1);
         }
    }
    static int SearchPivot( int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
           if( mid > start && nums[mid]< nums[mid-1]){
               return mid-1;
           }
           if(mid < end && nums[mid] > nums[mid+1]){
               return mid;
           }
           if(nums[start] >= nums[mid]){
               end = mid-1;
           }else{
               start = mid+1;
           }

        }
        return -1;
    }



}
