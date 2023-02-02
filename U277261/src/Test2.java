package U277261.src;

public class Test2 {

    public static void main(String[] args) {

        System.out.println("!!!!!!!!!!!!!!!!:3,1");
        Piece p1 = pie(3, 1);
        System.out.println(p1.l);
        System.out.println(p1.r);
        System.out.println(p1.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,2");
        Piece p2 = pie(3, 2);
        System.out.println(p2.l);
        System.out.println(p2.r);
        System.out.println(p2.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,3");
        Piece p3 = pie(3, 3);
        System.out.println(p3.l);
        System.out.println(p3.r);
        System.out.println(p3.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,4");
        Piece p4 = pie(3, 4);
        System.out.println(p4.l);
        System.out.println(p4.r);
        System.out.println(p4.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,5");
        Piece p5 = pie(3, 5);
        System.out.println(p5.l);
        System.out.println(p5.r);
        System.out.println(p5.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,6");
        Piece p6 = pie(3, 6);
        System.out.println(p6.l);
        System.out.println(p6.r);
        System.out.println(p6.index);
        System.out.println("!!!!!!!!!!!!!!!!:3,1");
        Piece p7 = pie(3, 7);
        System.out.println(p7.l);
        System.out.println(p7.r);
        System.out.println(p7.index);

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
