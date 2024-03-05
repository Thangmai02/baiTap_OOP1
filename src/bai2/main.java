package bai2;

import model.point2D;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

//        System.out.println("- Nhập x ");
//        float x = scanner.nextFloat();
//        System.out.println("- Nhập y ");
//        float y = scanner.nextFloat();
//        point point1=new point(x,y);
//        System.out.println(point1);


        System.out.println("- Nhập x ");
        float x2 = scanner.nextFloat();
        System.out.println("- Nhập y ");
        float y2 = scanner.nextFloat();
        System.out.println("- Nhập Speed x ");
        float speedX = scanner.nextFloat();
        System.out.println("- Nhập Speed y ");
        float speedY = scanner.nextFloat();
        MovablePoint movablePoint=new MovablePoint(x2,y2,speedX,speedY);
        System.out.println(movablePoint);
    }
}
