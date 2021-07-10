package com.tom;

import java.util.Random;

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
        String s = "abc";  //char0,char1,char2
//        char[] cc = new char[3];
        char[] cc = {'a','b','c'};
        System.out.println(cc[0]);
        System.out.println(cc[2]);
        System.out.println(cc[1]);
//        int sum = m1 + m2 + m3 + m4 + m5
        int[] data = new int[50];
        //字串
        String hello = "Hello";
        String s1 = new String(cc);
        String s2 = "Thanks!";
//        String s2 = new String("Thanks!");
        System.out.println(s1);
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1); //immutable
        int n = 0;
        while(n <= 5) {
            System.out.println("Hello1");
            n++;
//            break;
        }
        for(int i = 0 ; i < 3; i++) {
            System.out.println("Hello2");
        }
        System.out.println("End");
        String s3 = "abcdefgh";
        //一個字元一行，全印出
        System.out.println("length:" + s3.length());
        if (s3.length() <= 5) {
            for (int i = 0; i < s3.length(); i++) {
                System.out.println(s3.charAt(i));
            }
        } else {
            System.out.println("Cannot print big string");
        }
        System.out.println(s3.toUpperCase());
        char lower = 'a';
        char upper = 'A';
//        upper++;
        System.out.println((int)lower);
        System.out.println(upper);
        for (int i=0; i<s3.length(); i++) {
            if (i%2 == 0) {
                System.out.print((char)(s3.charAt(i) - 32));
            } else {
                System.out.print(s3.charAt(i));
            }
        }
        System.out.println();
        System.out.println("end");
    }
}
