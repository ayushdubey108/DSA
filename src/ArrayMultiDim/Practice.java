package ArrayMultiDim;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0)
            return false;
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        int lo = i + 1, hi = arr.length - 1;
        while (lo < hi) {
            temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);
        long count = 0;
        do {
            if (nums[0] % 2 != 0) continue;
            boolean allPrime = true;
            for (int i = 0; i < n - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (!isPrime(sum)) {
                    allPrime = false;
                    break;
                }
            }
            if (allPrime) count++;
        } while (nextPermutation(nums));
        System.out.println(count);
    }
}
