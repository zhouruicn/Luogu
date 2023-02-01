package U277261.src;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int m = input.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = input.nextInt();
            }
            int a, b, c;
            for (int i = 1; i < m + 1; i++) {
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                if (a == 1) {
                    operate(arr, b, c);
                } else {
                    inquire(arr, b, c);
                }
            }
        }
    }

    public static void inquire(int[] arr, int l, int r) {
        long ans = 1;
        for (int i = l; i <= r; i++) {
            ans = (arr[i] * ans) % 998244353;
        }
        System.out.println(ans);
    }

    public static void operate(int[] arr, int x, int y) {
        arr[x] = y;
    }

    static long qpow(int a, int b, int c) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % c;
            a = a * a % c;
            b >>= 1;
        }
        return res;
    }

}