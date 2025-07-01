package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //        ******************Dice-Project*****************
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        Random random = new Random();
        Dice dice = new Dice();
        System.out.print("\nHow Many times you want to Roll the Die ? : ");
        int rollCount = scanner.nextInt();
        if (rollCount !=0){
            for (int i=1; i<=rollCount; i++){
                int j= random.nextInt(1,7);
                dice.setRol(j);
                System.out.printf("\n Die rolled %d \n",j);
                dice.printRol();
                sum +=j;
            }
        }else System.out.println("You did not roll a die");

        System.out.println("\n Sum of all rolling attempt  : " + sum);
        scanner.close();
  }
}