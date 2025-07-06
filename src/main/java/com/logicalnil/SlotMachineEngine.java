package com.logicalnil;

import java.util.Random;

public class SlotMachineEngine {

    private final String[] options = {"👑" , "🐷" , "🔥" , "🍑" , "🍦"};
    String[] results = {"","",""};


    Random random = new Random();

    String[] runEngine(){
        for(int i =0; i<=2; i++){
            results[i]=options[random.nextInt(4)];
        }
        return results;
    }

    int resultChecker(){
        int navigate = results.length;
        int count = 0;
        while (navigate >1){
            if (results[navigate-1].equals(results[navigate -2])){
                count++;
            }
            navigate--;
        }

        if (count ==0){
            return -1;
        }else {
            return count;
        }

    }

}
