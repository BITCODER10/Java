package com.logicalnil;

public class Dice {
    private int rol;
    Dice(){

    }
    Dice(int rol){
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    public void printRol(){
        switch (rol){
            case 1 ->{
                System.out.println(
                         """ 
                         -------------
                        |             |
                        |      ⏺      |
                        |             |
                         -------------
                        """);
            }
            case 2 ->{
                System.out.println("""
                         -------------
                        | ⏺           |
                        |             |
                        |           ⏺ |
                         -------------
                        """);
            }
            case 3 ->{
                System.out.println("""
                         -------------
                        | ⏺           |
                        |      ⏺      |
                        |           ⏺ |
                         -------------
                        """);
            }
            case 4 ->{
                System.out.println("""
                         -------------
                        | ⏺         ⏺ |
                        |             |
                        | ⏺         ⏺ |
                         -------------
                        """);
            }
            case 5 ->{
                System.out.println("""
                         -------------
                        | ⏺         ⏺ |
                        |      ⏺      |
                        | ⏺         ⏺ |
                         -------------
                        """);
            }
            case 6 ->{
                System.out.println("""
                         -------------
                        | ⏺         ⏺ |
                        | ⏺         ⏺ |
                        | ⏺         ⏺ |
                         -------------
                        """);
            }
        }
    }
}
