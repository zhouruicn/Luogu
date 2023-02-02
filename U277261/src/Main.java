package U277261.src;

import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;

    private static int size;

    private static int groupCount;

    private static int[] arr;
    private static int[] group;

    private static final int factor = 998244353;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
            m = input.nextInt();
            size = (int) Math.sqrt(n);
            groupCount = n / size;
            arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = input.nextInt();
            }
            group = new int[groupCount + 1];
            for (int i = 1; i <= groupCount; i++) {
                long v = 1;
                for (int j = ((i - 1) * size + 1); j <= i * size; j++) {
                    v = v * arr[j] % factor;
                }
                group[i] = (int) v;
            }

            int a, b, c;
            for (int i = 1; i < m + 1; i++) {
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                if (a == 1) {
                    operate(b, c);
                } else {
                    inquire(b, c);
                }
            }
        }
    }

    public static void inquire(int l, int r) {
        long ans = 1;
        Divide divide = div(size, l, r);
        for (int i = divide.l; i <= divide.ls; i++) {
            ans = ans * arr[i] % factor;
        }
        for (int i = divide.lp; i <= divide.rp && i <= groupCount; i++) {
            ans = ans * group[i] % factor;
        }
        for (int i = divide.rs; i <= divide.r; i++) {
            ans = ans * arr[i] % factor;
        }
        System.out.println(ans);
    }

    public static void operate(int x, int y) {
        arr[x] = y;
        Piece pie = pie(size, x);
        long v = 1;
        for (int i = pie.l; i <= pie.r; i++) {
            v = v * arr[i] % factor;
        }
        group[pie.index] = (int) v;
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
            divide.rp = r / size;
        } else {
            divide.rp = r / size;
        }
        // set rs
        if (rm == 0) {
            divide.rs = r + 1;
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
    }

    public static Piece pie(int size, int num) {
        Piece piece = new Piece();
        int n = (num / size);
        piece.l = n * size + 1;
        piece.r = (n + 1) * size;
        piece.index = n + 1;
        return piece;
    }

    public static class Piece {
        private Integer l;
        private Integer r;
        private Integer index;
    }

}