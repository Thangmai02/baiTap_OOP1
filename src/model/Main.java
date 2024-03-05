package model;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("- Nhập x ");
        float x = scanner.nextFloat();
        System.out.println("- Nhập y ");
        float y = scanner.nextFloat();
        point2D point2D1=new point2D(x,y);
        System.out.println(point2D1);


    }
}