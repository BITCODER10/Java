package com.logicalnil;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Switch to different branches to check the java projects");
        System.out.println();

//        T roomNumber;
//        U floor;
//        V governmentApproval;
//        W rent;

        GenericsStudy<String, Integer, Boolean, String> newBuilding = new GenericsStudy<>();
        GenericsStudy<Integer, Integer, Integer, Double> newBuilding2 = new GenericsStudy<>();
        GenericsStudy<Integer, Character, String, BigDecimal> newBuilding3 = new GenericsStudy<>();

        newBuilding.setRoomNumber("Delux-01");
        newBuilding.setFloor(12);
        newBuilding.setGovernmentApproval(true);
        newBuilding.setRent("Rs. 3400 only");


        newBuilding2.setRoomNumber(001);
        newBuilding2.setFloor(15);
        newBuilding2.setGovernmentApproval(0);
        newBuilding2.setRent(2400.99);


        newBuilding3.setRoomNumber(1012);
        newBuilding3.setFloor('P');
        newBuilding3.setGovernmentApproval("Pending");
        newBuilding3.setRent(BigDecimal.valueOf(15000));

        GenericsStudy[] hotelData = {newBuilding,newBuilding2, newBuilding3};

        for(GenericsStudy g : hotelData){
            System.out.println("Room Number : "+g.getRoomNumber());
            System.out.println("Floor : "+g.getFloor());
            System.out.println("Is government approved : "+g.getGovernmentApproval());
            System.out.println("What is the rent : "+g.getRent());
            System.out.println("---------------------------------");

        }




  }
}