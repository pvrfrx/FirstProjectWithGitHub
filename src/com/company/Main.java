package com.company;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
        DrawCharInPoint(1,2,'c');
        DrawCharInPoint(3,2,'d');

    }

    public static void DrawCharInPoint(int x, int y, char c){
        for (int i = 0; i < y-1; i++) {
            System.out.println();
        }
        for (int i = 0; i < x-1; i++) {
            System.out.print(' ');
        }
        System.out.print(c);
    }
}
