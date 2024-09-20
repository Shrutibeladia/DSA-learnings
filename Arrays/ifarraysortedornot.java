/* que - Given an array of size n , write a program to check if the given array is sorted in ascending/increasing order or not . Return true if its is sorted else give false.
  input : 5
  arr[] = {1,2,3,4,5}
  output : true; 
 */


// solution


public class ifarraysortedornot {
    static boolean isSorted (int arr[] , int n){
        for(int i=1 ;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){
        // int arr[] = {1,2,3,4,5};
        int arr[] = {2,5,3,1,7,8};
        int n = arr.length;

        System.out.print(isSorted(arr, n));
    }
}
//tc = O(N)