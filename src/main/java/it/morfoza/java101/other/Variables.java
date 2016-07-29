package it.morfoza.java101.other;

public class Variables {

    static byte b1;
    static short s1;
    static int i1;
    static long l1;
    static char c1 = 263;
    static float f1;
    static double d1;
    static Object o1;
    static boolean bool1;

    public static void main(String[] args) {

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(bool1);

        byte b2 = 7;
        short s2 = 0;
        int i2 = 0;
        long l2 = 0;
        char c2 = 0;
        float f2 = 0.0f;
        double d2 = 0.0d;
        Object o2 = null;
        boolean bool2 = false;



        if(b2==0){
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }
        if (s2==0) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (i1==i2) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (l2==l1) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (c2==c1) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (f2==f1) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (d2==f2) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (o2==null) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }
        if (bool2==true) {
            System.out.println("dzień dobry");
        } else {
            System.out.println("do widzenia");
        }



        int znak = 'ć';
        System.out.println();



    }

}
