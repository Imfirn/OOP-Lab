package lab.pkg08.comparable;

import java.util.Scanner;

public class Lab08Comparable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner input = new Scanner(System.in);
        ComparableCircle[] c = new ComparableCircle[3];
        ComparableRectangle[] R = new ComparableRectangle[3];
        ComparableTriangle[] T = new ComparableTriangle[3];

        int score, index;
        String color, weight, color1, weight1;
        double[] s = new double[6];
        double[] r = new double[2];
        double[] w = new double[2];
        double[] h = new double[2];
        System.out.print("Menu : (1)Circle  (2)Rectangle  (3)Triangle :");
        score = input.nextInt();

        switch (score) {
            ///Circle ----------------------------------------
            case 1 -> {
                System.out.print("Circle c1(radius color weight) : ");
                r[0] = input.nextDouble();
                color = input.next();
                weight = input.next();
                c[0] = new ComparableCircle(r[0], color, weight);
                System.out.print("Circle c2(radius color weight) : ");
                r[1] = input.nextDouble();
                color1 = input.next();
                weight1 = input.next();
                c[1] = new ComparableCircle(r[1], color1, weight1);
                System.out.println(" Find the larger object using max method : c1 c2");
                MAXC(c[0], c[1]);
                System.out.println("Cloning Circle c3 by using(1 or 2) :");
                index = input.nextInt();
                if (index == 1) {
                    c[2] = (ComparableCircle) c[0].clone();
                    System.out.print("c1 == c3 is ");
                    System.out.println(c[2] == c[0]);
                    System.out.println("c1.equals(c3) is " + c[0].equals(c[2]));
                    System.out.print("Find the larger of 2 instances of comparable objects : c2 c3");
                    System.out.println("Answer : " + ((c[1].compareTo(c[2])) == 1 ? "c3 bigger than c2" : (c[1].compareTo(c[2])) == -1
                            ? " c2 bigger than c3" : "c3 is equal c2"));

                } else if (index == 2) {

                    c[2] = (ComparableCircle) c[1].clone();
                    System.out.print("c2 == c3 is ");
                    System.out.println(c[2] == c[1]);
                    System.out.println("c2.equals(c3) is " + c[2].equals(c[1]));
                    System.out.println("Find the larger of 2 instances of comparable objects : c1 c3");
                    System.out.println("Answer : " + ((c[2].compareTo(c[0])) == 1
                            ? "c1 bigger than c3" : (c[2].compareTo(c[0])) == -1
                            ? " c3 bigger than c1" : "c1 is equal c3"));
                }
            }
            ///Ractangle---------------------------------------------------
            case 2 -> {
                System.out.print("Rectangle r1 (width height color weight) :");
                w[0] = input.nextDouble();
                h[0] = input.nextDouble();
                color = input.next();
                weight = input.next();
                R[0] = new ComparableRectangle(w[0], h[0], color, weight);
                System.out.print("Rectangle r2 (width height color weight) :");
                w[1] = input.nextDouble();
                h[1] = input.nextDouble();
                color1 = input.next();
                weight1 = input.next();
                R[1] = new ComparableRectangle(w[1], h[1], color1, weight1);
                System.out.println(" Find the larger object using max method : r1 r2");
                MAXR(R[0], R[1]);
                System.out.print("Cloning Rectangle r3 by using(1 or 2) :");
                index = input.nextInt();
                if (index == 1) {
                    R[2] = (ComparableRectangle) R[0].clone();
                    System.out.print("r1 == r3 is ");
                    System.out.println(R[2] == R[0]);
                    System.out.println("r1.equals(r3) is " + R[0].equals(R[2]));
                    System.out.println("Find the larger of 2 instances of comparable objects : r2 r3");
                    System.out.println("Answer : " + ((R[2].compareTo(R[1])) == 1
                            ? "r2 bigger than r3" : (R[2].compareTo(R[1])) == -1 ? ""
                            + " r3 bigger than r2" : "r2 is equal r3"));

                } else if (index == 2) {
                    R[2] = (ComparableRectangle) R[1].clone();
                    System.out.print("r2 == r3 is ");
                    System.out.println(R[2] == R[1]);
                    System.out.println("r2.equals(r3) is " + R[2].equals(R[1]));
                    System.out.println("Find the larger of 2 instances of comparable objects : r1 r3");
                    System.out.println("Answer : " + ((R[0].compareTo(R[2])) == 1 ? "r3 bigger than r1" : (R[0].compareTo(R[2])) == -1
                            ? " r1 bigger than r3" : "r3 is equal r1"));
                }
            }
            ///Triangle------------------------------------------------
            case 3 -> {
                System.out.print("Triangle t1 (side1 side2 side3 color weight) :");
                s[0] = input.nextDouble();
                s[1] = input.nextDouble();
                s[2] = input.nextDouble();
                color = input.next();
                weight = input.next();
                T[0] = new ComparableTriangle(s[0], s[1], s[2], color, weight);
                System.out.print("Rectangle t2 (side1 side2 side3 color weight) :");
                s[3] = input.nextDouble();
                s[4] = input.nextDouble();
                s[5] = input.nextDouble();
                color1 = input.next();
                weight1 = input.next();
                T[1] = new ComparableTriangle(s[3], s[4], s[5], color1, weight1);
                System.out.println(" Find the larger object using max method : t1 t2");
                MAXT(T[0], T[1]);
                System.out.print("Cloning Triangle t3 by using(1 or 2) :");
                index = input.nextInt();
                if (index == 1) {

                    T[2] = (ComparableTriangle) T[0].clone();
                    System.out.print("t1 == t3 is ");
                    System.out.println(T[2] == T[0]);
                    System.out.println("t1.equals(t3) is " + T[0].equals(T[2]));
                    System.out.println("Answer : " + ((T[2].compareTo(T[1])) == 1
                            ? "t2 bigger than t3" : (T[2].compareTo(T[1])) == -1 ? ""
                            + " t3 bigger than t2" : "t2 is equal t3"));

                } else if (index == 2) {

                    T[2] = (ComparableTriangle) T[1].clone();
                    System.out.print("t2 == t3 is ");
                    System.out.println(T[2] == T[1]);
                    System.out.println("t2.equals(t3) is " + T[2].equals(T[1]));
                    System.out.println("Answer : " + ((T[0].compareTo(T[2])) == 1 ? "t3 bigger than t1" : (T[0].compareTo(T[2])) == -1
                            ? " t1 bigger than t3" : "t3 is equal t1"));
                }
            }
            default -> {
            }
        }

    }

    public static void MAXC(ComparableCircle c1, ComparableCircle c2) {

        System.out.println("Answer : " + ((c1.compareTo(c2)) == 1 ? "c2 bigger than c1"
                : (c1.compareTo(c2)) == -1 ? " c1 bigger than c2" : "c2 is equal c1"));
    }

    public static void MAXR(ComparableRectangle R1, ComparableRectangle R2) {

        System.out.println("Answer : " + ((R1.compareTo(R2)) == 1 ? "r2 bigger than r1"
                : (R1.compareTo(R2)) == -1 ? " r1 bigger than r2" : "r2 is equal r1"));
    }

    public static void MAXT(ComparableTriangle T1, ComparableTriangle T2) {

        System.out.println("Answer : " + ((T1.compareTo(T2)) == 1 ? "t2 bigger than t1"
                : (T1.compareTo(T2)) == -1 ? " t1 bigger than r2" : "t2 is equal t1"));

    }

}
