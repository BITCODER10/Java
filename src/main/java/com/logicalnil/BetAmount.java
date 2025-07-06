package com.logicalnil;

public class BetAmount {
    private static int betAmount;
    private static int currentBalance = 100;
    BetAmount(){

    }

    public boolean setBetAmount(int betAmount) {
        if (betAmount <= currentBalance ){
            if(betAmount >0){
                BetAmount.betAmount = betAmount;
                return true;
            }else {
                System.out.println();
                System.out.println("Bet Amount cannot be less that or equal to 0");
                System.out.println();
                return false;
            }
        }else {
            System.out.println();
            System.out.println("Amount You are betting is exceeding your current balance");
            System.out.print("\nPlease enter new bet");
            System.out.println();
            return false;
        }
    }

    void manageBalance(int multiplier){

        BetAmount.currentBalance += betAmount*multiplier;
        if(multiplier >0){
            System.out.println();
            System.out.println("Congratulations !! You have won Rs. "+(betAmount*multiplier));
            System.out.println("Your Current Balance is "+BetAmount.currentBalance);
            System.out.println();
        }else {
            System.out.println();
            System.out.println("Oops !! You you lost Rs. "+(betAmount*multiplier));
            System.out.println("Your Current Balance is "+BetAmount.currentBalance);
            System.out.println();
        }


    }

    int getCurrentBalanche(){
        return BetAmount.currentBalance;
    }
}
