package com.logicalnil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        boolean runAgain = true;
        Shape maxArea = null;
        Shape maxVolume = null;
        Scanner scanner = new Scanner(System.in);
        int userEnter;

        System.out.print("""
                
                1. Add Rect
                2. Add Cube
                3. Add Circle
                4. Add Sphere
                5. Exit
                
                """);
        userEnter = scanner.nextInt();

        while (runAgain){
            switch (userEnter){
                case 1->{
                    double len, bre;
                    String name;
                    System.out.println("Enter name for rectangle");
                    name = scanner.next();
                    System.out.println("Enter the length :");
                    len = scanner.nextDouble();
                    System.out.println("Enter the breadth :");
                    bre = scanner.nextDouble();
                    shapes.add(new rect_Cube(len,bre,name));
                    System.out.println("Add one more ? :");
                    String s = scanner.next();
                    if(s.equals("y")){
                    }else {
                        runAgain = false;
                    }
                }
                case 2->{
                    double len, bre, hei;
                    String name;
                    System.out.println("Enter name for cube");
                    name = scanner.next();
                    System.out.println("Enter the length :");
                    len = scanner.nextDouble();
                    System.out.println("Enter the breadth :");
                    bre = scanner.nextDouble();
                    System.out.println("Enter the height :");
                    hei = scanner.nextDouble();
                    shapes.add(new rect_Cube(len,bre,hei,name));
                    System.out.println("Add one more ? :");
                    String s = scanner.next();
                    if(s.equals("y")){
                    }else {
                        runAgain = false;
                    }
                }
                case 3->{
                    double rad;
                    String name;
                    System.out.println("Enter name for circle");
                    name = scanner.next();
                    System.out.println("Enter the radius :");
                    rad = scanner.nextDouble();
                    shapes.add(new Circle_Sphere(rad,name));
                    System.out.println("Add one more ? :");
                    String s = scanner.next();
                    if(s.equals("y")){
                    }else {
                        runAgain = false;
                    }
                }
                case 4->{
                    double rad;
                    String name;
                    System.out.print("Enter name for Sphere");
                    name = scanner.next();
                    System.out.print("Enter the radius :");
                    rad = scanner.nextDouble();
                    shapes.add(new Circle_Sphere(rad,name));
                    System.out.println("Add one more ? :");
                    String s = scanner.next();
                    if(s.equals("y")){
                    }else {
                        runAgain = false;
                    }
                }
                default -> {
                    System.out.println("Invalid Input");
                    runAgain = false;
                }
            }
        }


        for (Shape a : shapes){
            System.out.printf("Area of %s is %f",a.getName(),a.area());
        }


        for (int i = 0; i < shapes.size()-1; i++) {
            maxArea = shapes.get(i).Compare(shapes.get(i+1));
        }
        System.out.printf("\nBiggest Area Belongs to : %s with area %d ",maxArea.getName(), maxArea.area());

        System.out.println(maxArea.toString());
        scanner.close();

  }
}