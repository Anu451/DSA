// Problem statement
// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

// Note :
// Given array/list can contain duplicate elements.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an integer 'X'.
// Output format :
// For each test case, print the total number of triplets present in the array/list.

// Output for every test case will be printed in a separate line.


import java.util.Arrays;

public class TripleSum {

    public static int triplet(int[] arr, int num) {
        Arrays.sort(arr); 
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int currentSum = arr[i] + arr[low] + arr[high];

                if (currentSum == num) {
                    if (arr[low] == arr[high]) {
                        int total = high - low + 1;
                        ans += (total * (total - 1)) / 2;
                        break;
                    } else {
                        int countLow = 1;
                        int countHigh = 1;

                        while (low + 1 < high && arr[low] == arr[low + 1]) {
                            countLow++;
                            low++;
                        }

                        while (high - 1 > low && arr[high] == arr[high - 1]) {
                            countHigh++;
                            high--;
                        }

                        ans += countLow * countHigh;
                        low++;
                        high--;
                    }
                } else if (currentSum > num) {
                    high--; 
                } else {
                    low++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {


        int arr[] = {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
        
        System.out.println(triplet(arr, 5));
    }
}
