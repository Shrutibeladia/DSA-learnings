/* Que - Given an integer array sorted in non-decreasing order . Remove the duplicates in place such that each unique elements appears only once. The relative order of the elements should be kept same 
 
note : if there are K elements after removing the duplicates then the first K elements of an array should hold the final results . It does not matter what you leave beyond the first K elements.

input : arr[1,1,2,2,2,3,3,3];
output : arr[1,2,3,2,2,3,3,3];
 */

 //brute force solution
 /* We use hashset in brute force sol 
  * 1 declare a new hashset .
  2 run a for loop from start to end in an array
  3 . put every element in an array in set (it will only store unique elements)
  4. store the size of the set in variable K;
  5. now put all the elements of a set in an array from starting of the array 
  6.return K ;
 */


 //I am writing brute force sol as a comment and optimal sol as an actual code 

 /* bruteforce function
 static int removeDuplicates (int[] arr){
   HashSet<Integer> set = new HashSet <>();
   for(int i=0 ;i<arr.length ;i++){
         set.add(arr[i]);
   }

   int K = set.size();
   int j=0 ;
   for(int x:set){
   arr[j] = x;
   j++;
   }
   return K ;
 }
  */

  //optimal solution - we use two pointer patter to solve this question

  /* Approach : 
   1.Take one pointer i = 0 ;
   2. Use for loop by using another pointer j from 1 to the length of the array .
   3. if , arr[j]!= arr[i] then increase the i and update arr[i]==arr[j];
   4.After completion of the loop return i+1 , i.e size of the array of unique elements .
   */



public class removeDuplicates {
    static int removeDuplicate(int arr[]){
        int i=0 ; 
        for (int j=1 ;j<arr.length ;j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main (String args[]){
        int arr[] = {1,1,2,2,2,3,3,3};
        int K = removeDuplicate(arr);
        System.out.print("The array after removing the duplicates:");
        for(int i=0 ;i<K;i++){
            System.out.print(arr[i]+" ");
        }

    }
}


//Tc  - O(N)  
//sc =O(1) we are changing same array not creating array 