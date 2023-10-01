package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        if (x > 0 && x < 2 && y > 0 && y < 2 && x * x + y * y > 4 && y < x){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}