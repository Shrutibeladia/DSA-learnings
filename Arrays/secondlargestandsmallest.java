/*que - you are given an array which also contains duplicates , find a second smallest and second largest element in an array , if it does not contains the second smallest and second largest then print "-1". */

//optimal solution 

/* Approach:
 1 . if n<2 print -1 base case
 2. take small and secondsmall as Integer.MAX_VALUE.
 3.run a for loop in an array , if arr[i] is less than small then small = secsmall and arr[i]=small 
 4.else case that arr[i] is smaller than secsmall and not equal to small then arr[i] = secsmall 
 */

 class secondlargestandsmallest {
    static private int secondSmallest (int[] arr , int n){
             if(n<2)
             return -1;
               
             int secsmall = Integer.MAX_VALUE;
             int small = Integer.MAX_VALUE;

             for(int i=0 ; i<n ;i++){
                if(arr[i] < small){
                    secsmall = small;
                    small = arr[i];
                }else if (arr[i]<secsmall && arr[i] != small){
                    secsmall = arr[i];
                }
             }
             return secsmall;
    }

    static private int secondLargest(int[] arr , int n){
           if(n<2){
            return -1;
           }

           int seclarge = Integer.MIN_VALUE;
           int large = Integer.MIN_VALUE;

           for(int i=0 ; i<n ; i++){
            if(arr[i]>large){
                seclarge = large;
                large = arr[i];
            }else if (arr[i]>seclarge && arr[i]!=large){
                seclarge = arr[i];
            }
           }
           return seclarge;
    }

    public static void main(String args[]){
        int arr[] = {1,12,31,41,54,67,7};
        int n = arr.length;

        System.out.println(secondSmallest(arr, n));
        System.out.println(secondLargest(arr, n));
    }
 }

 //TC - O(N);