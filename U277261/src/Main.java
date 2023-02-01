package U277261.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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

    public static Divide div(int size, int l, int r) {
        Divide divide = new Divide();
        if (r - l < size) {
            divide.l = null;
            divide.ls = null;
            divide.lp = null;
            divide.rp = null;
            divide.rs = l;
            divide.r = r;
        }
        int lm = l % size;
        int rm = r % size;
        // set l
        divide.l = l;
        // set ls
        if (lm == 1) {
            divide.ls = l - 1;
        } else {
            divide.ls = ((int) (Math.ceil((double) l / (double) size))) * size;
        }
        // set lp
        if (lm == 0) {
            divide.lp = l / size + 1;
        } else if (lm == 1) {
            divide.lp = l / size + 1;
        } else {
            divide.lp = l / size + 2;
        }
        // set rp
        if (rm == 0) {
            divide.rp = r / size + 1;
        } else {
            divide.rp = r / size;
        }
        // set rs
        if (rm == 0) {
            divide.rs = r - 1;
        } else {
            divide.rs = (r / size) * size + 1;
        }
        // set r
        divide.r = r;

        return divide;
    }

    public static class Divide {
        private Integer l;
        private Integer ls;
        private Integer lp;
        private Integer rp;
        private Integer rs;
        private Integer r;
        List<Integer> piece = new ArrayList<>();
    }

}