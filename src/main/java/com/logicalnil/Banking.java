package com.logicalnil;

import java.math.BigDecimal;
import java.util.Scanner;

public class Banking {
    private BigDecimal currentBalance = new BigDecimal(0);
    public static Scanner scanner = new Scanner(System.in);
    Banking(){

    }

    public void printOption(){

        System.out.println("""
                    *************************************** \n
                    *         BANKING PROGRAM             * \n
                    *************************************** \n
                            1. CHECK BALANCE \n
                            2. WITHDRAW AMOUNT \n
                            3. MAKE DEPOSIT \n
                            4. EXIT \n
                """);
    }
    public int getInput(){
        System.out.print("\nEnter Your Choice : ");
        int i = scanner.nextInt();
        return i;
    }
    public void performAction(){
        boolean reRun = true;
        int c;
        BigDecimal zeroBalance = new BigDecimal(0);
        while (reRun){
            c = getInput();
            switch (c){
                case 1 ->{
                    System.out.println("Balance is : " + currentBalance);
                }
                case 2 -> {
                    if (currentBalance.equals(zeroBalance)){
                        System.out.println("Account Balance is zero, please deposit using option number 3");
                    }else {
                        System.out.print("\nEnter Amount to withdraw : ");
                        BigDecimal withdraw = scanner.nextBigDecimal();
                        currentBalance = currentBalance.subtract(withdraw);
                        System.out.println("Balance is : "+ currentBalance);
                    }
                }
                case 3 -> {

                    System.out.print("\nEnter Amount to Deposit : ");
                    BigDecimal Deposit = scanner.nextBigDecimal();
                    currentBalance = currentBalance.add(Deposit);
                    System.out.println("\nBalance is : "+currentBalance);
                }
                case 4 -> {
                    reRun = false;
                    System.out.println("*********** EXITING PROGRAM ************");
                }
                default -> System.out.println("Invalid Choice");
            }
        };

    }
    public void closeScanner(){
        scanner.close();
    }

}
