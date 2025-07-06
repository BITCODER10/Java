package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean isAmountOK = false;
        int amountToBet = 5;
        String[] results;
        String runAgain = "y";
        Scanner scanner = new Scanner(System.in);

        SlotOptions topSection = new SlotOptions();
        topSection.getOptions();
        BetAmount betAmount = new BetAmount();


        while (runAgain.equals("y")){
            do{
                System.out.print("\nPlease Enter your bet amount : Rs.");
                amountToBet = scanner.nextInt();
                isAmountOK = betAmount.setBetAmount(amountToBet);
            } while (!isAmountOK);

            System.out.println("You have bet Rs." + amountToBet);

            System.out.println("\t\tSlot machine is running .....");
            System.out.println("\t\tResult is as below ");
            System.out.println();

            SlotMachineEngine slotMachineEngine = new SlotMachineEngine();
            results = slotMachineEngine.runEngine();

            for (String result : results){
                System.out.print("***"+result+"***\t");
            }
            System.out.println();

            int benefit = slotMachineEngine.resultChecker();
            betAmount.manageBalance(benefit);
            System.out.println();
            System.out.print("Bet Again : (Y / N). ");
            runAgain = scanner.next().toLowerCase();
        }
        System.out.println();
        System.out.println("*************GAME ENDED**********");
        System.out.println();
        System.out.println();
        System.out.printf("You can cashout Rs %d at the cashier counter",betAmount.getCurrentBalanche());
        System.out.println();
        System.out.println();
        scanner.close();
  }
}