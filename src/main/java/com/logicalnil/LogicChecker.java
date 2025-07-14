package com.logicalnil;

import java.util.ArrayList;
import java.util.Arrays;

public class LogicChecker {
    private char ch;
    private  static  char[] bc;
    private static String rcw;
    private static int incorrectCount=-1;
    private static ArrayList<Character> exhaustiveList = new ArrayList<>();
    LogicChecker( String rcw){

        LogicChecker.bc = new char[rcw.length()];
        LogicChecker.rcw = rcw;
    }
    void fillBCwith_(){
        Arrays.fill(bc,'_');
    }

    public static int getIncorrectCount() {
        return incorrectCount;
    }

    public static void setIncorrectCount(int incorrectCount) {
        LogicChecker.incorrectCount = incorrectCount;
    }

    public static ArrayList<Character> getExhaustiveList() {
        return exhaustiveList;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public static void setBc(char[] bc) {
        LogicChecker.bc = bc;
    }

    public static char[] getBc() {
        return bc;
    }

    public static void setRcw(String rcw) {
        LogicChecker.rcw = rcw;
    }

    public boolean ifWordExist(){
        boolean flag = false;
        for(int i =0; i < rcw.length(); i++){

            if(rcw.charAt(i) == ch){
                bc[i] = ch;
                flag = true;
            }
        }
        if (flag){
            return true;
        }else {
            LogicChecker.incorrectCount++;
            exhaustiveList.add(ch);
            return false;
        }
    }

    public boolean isBCFull(){
        return String.valueOf(bc).equals(rcw);
    }

}
