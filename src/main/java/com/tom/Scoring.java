package com.tom;

import java.io.*;

public class Scoring {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int english = 90;
        int math = 70;
        String name = "Eric";
        int average = (english+math)/2;
        String grading = "F";
        if (average >= 90) {
            grading = "A";
        } else if (average >= 80) {
            grading = "B";
        } else if (average >= 70) {
            grading = "C";
        } else if (average >= 60) {
            grading = "D";
        }
        System.out.println(name + " " + english + " " + math + " "
                + average + " " + grading);
    }
}
