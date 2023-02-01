package U277261.src;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,1,10");
        Divide divide1 = div(3, 1, 10);
        System.out.println(divide1.l);
        System.out.println(divide1.ls);
        System.out.println(divide1.lp);
        System.out.println(divide1.rp);
        System.out.println(divide1.rs);
        System.out.println(divide1.r);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,2,10");
        Divide divide2 = div(3, 2, 10);
        System.out.println(divide2.l);
        System.out.println(divide2.ls);
        System.out.println(divide2.lp);
        System.out.println(divide2.rp);
        System.out.println(divide2.rs);
        System.out.println(divide2.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,3,10");
        Divide divide3 = div(3, 3, 10);
        System.out.println(divide3.l);
        System.out.println(divide3.ls);
        System.out.println(divide3.lp);
        System.out.println(divide3.rp);
        System.out.println(divide3.rs);
        System.out.println(divide3.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,4,10");
        Divide divide4 = div(3, 4, 10);
        System.out.println(divide4.l);
        System.out.println(divide4.ls);
        System.out.println(divide4.lp);
        System.out.println(divide4.rp);
        System.out.println(divide4.rs);
        System.out.println(divide4.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,5,10");
        Divide divide5 = div(3, 5, 10);
        System.out.println(divide5.l);
        System.out.println(divide5.ls);
        System.out.println(divide5.lp);
        System.out.println(divide5.rp);
        System.out.println(divide5.rs);
        System.out.println(divide5.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,6,10");
        Divide divide6 = div(3, 6, 10);
        System.out.println(divide6.l);
        System.out.println(divide6.ls);
        System.out.println(divide6.lp);
        System.out.println(divide6.rp);
        System.out.println(divide6.rs);
        System.out.println(divide6.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,10,10");
        Divide divide7 = div(3, 10, 10);
        System.out.println(divide7.l);
        System.out.println(divide7.ls);
        System.out.println(divide7.lp);
        System.out.println(divide7.rp);
        System.out.println(divide7.rs);
        System.out.println(divide7.r);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!3,4,5");
        Divide divide8 = div(3, 4, 5);
        System.out.println(divide8.l);
        System.out.println(divide8.ls);
        System.out.println(divide8.lp);
        System.out.println(divide8.rp);
        System.out.println(divide8.rs);
        System.out.println(divide8.r);
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
