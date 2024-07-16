
//que given an array we have to find the largest element in an array 

//brute force - 1. sort an array Arrays.sort()  2. print last element (size-1)th idx.
//tc - O(n*log n)

//better sol - recursive approach
/*1. take a max variable  as arr[0].
2. now traverse the array and compare with max vareiable 
3. if value at ith index > max the max = ith val
4. at last pribnt max */ 

import java.util.*;

public class largestElement {
    static int findlargestElement(int arr[]){
        int max = arr[0];
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main (String args[]){
        // int arr[] ={ 2, 3,45,6 , 78};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements:");
        for(int i=0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest element in an array " + findlargestElement(arr));
        sc.close();
    }
}

//tc - O(n);