import java.io.*;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + i + " ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key : ");
        int key = sc.nextInt();
        Solution g = new Solution();
        for(int i=0;i<n;i++)
        {
            System.out.println("Elements are : "+arr[i]);
        }
        if(g.binarysearch(arr, n, key)==-1)
        {
            System.out.println("\nElement not found");
        }
        else
            System.out.print("\nElement is present at index : "+ g.binarysearch(arr, n, key));

    }
}
class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;
        }

        return -1;
    }
}
