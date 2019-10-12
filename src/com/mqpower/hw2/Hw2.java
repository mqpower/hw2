package com.mqpower.hw2;

public class Hw2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xc;

        short s1 = 1300;
        short s2 = 0b010100010100;
        short s3 = 02424;
        short s4 = 0x514;

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;

        long l1 = 123456789;
        long l2 = 0b111010110111100110100010101;
        long l3 = 0726746425;
        long l4 = 0x75BCD15;

        System.out.println("=====================================================");
        System.out.println("Decimal variables: " + b1 + ", " + s1 + ", " + i1 + ", " + l1 + ";");
        System.out.println("Binary variables: " + b2 + ", " + s2 + ", " + i2 + ", " + l2 + ";");
        System.out.println("Hex variables: " + b4 + ", " + s4 + ", " + i4 + ", " + l4 + ";");
        System.out.println("Oct variables: " + b3 + ", " + s3 + ", " + i3 + ", " + l3 + ".");

        float f1 = 1.1f;
        float f2 = 20.0f;

        double d1 = 200.9;
        double d2 = -231.4;

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("=====================================================");
        System.out.println("Float variables: " + f1 + ", " + f2 + ";");
        System.out.println("Double variables: " + d1 + ", " + d2 + ";");
        System.out.println("Boolean variables: " + bool1 + ", " + bool2 + ";");
        System.out.println("=====================================================");

        char ch1 = 123;
        char ch2 = 'a';
        char ch3 = '\u03c8';

        System.out.println("Char variables: " + ch1 + ", " + ch2 + ", " + ch3 + ".");
        System.out.println("=====================================================");


    }
}

