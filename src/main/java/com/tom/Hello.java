package com.tom;

public class Hello {
    public static void main(String[] args) { //main
        System.out.println("Hello"); //sout
        int a = 18;
        int b = a + 20;
        long num = a;
        float f = a;
        float f2 = num;
//        System.out.println(num);
        num = num + 1; //num++
        //a--; //a=a-1
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
        a = a + 3; // a+=3
        a = a - 5; // a-=5
        a = a * 2; // a*=2
        a = a % 3; // a%=3
        boolean d1 = true;
        boolean d2 = false;
        System.out.println(d1 & d2);
        System.out.println(true ^ true);
        a = 4;
        System.out.println(a << 7);
        System.out.println(!false);
        boolean adult = true;
        System.out.println(!adult);

        // --------3-------------8------>
        int m = 5;
        System.out.println(m<3 || m>8);
        //System.out.println(m>=3 & m<=8);
    }
}
