package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] number = new int[5];
        Random random = new Random();

        HashMap<String[], Integer> fam = new HashMap<>();
        for(int i=0; i< number.length; i++){
            number[i] = random.nextInt(0,100);
        }
        ArrayProgram array = new ArrayProgram();
        array.setNumbers(number);
        array.printArray();
        System.out.println("Sum of all the random numbers is : " + array.getSum());
        fam = yetAnotherExample();
        for(Map.Entry<String[],Integer> entry : fam.entrySet()){
            System.out.println(Arrays.toString(entry.getKey()) +": "+ entry.getValue());
        }

        ArraySort sort = new ArraySort();
        sort.setNumbers(number);
        sort.sortingArrayBuildin();

  }
  public  static HashMap<String[], Integer > yetAnotherExample(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String familyName;
        int familyMemberCount;
        int familyNumber = 1;
        String isAnotherFamily="yes";

        HashMap<String[], Integer> familyTree = new HashMap<String[], Integer>();





        while (isAnotherFamily.equals("yes")){

            System.out.println("Family Members count (including yourself ) : ");
            familyMemberCount = scanner.nextInt();
            scanner.nextLine();
            String[] familyMembersList = new String[familyMemberCount];

            for(int i =0; i< familyMemberCount; i++){
                System.out.printf("Enter Family member name %d :",i+1);
                familyMembersList[i]=scanner.nextLine();
            }

            familyTree.put(familyMembersList,familyNumber);

            System.out.println("Do we have another family in list ? yes/no :");
            isAnotherFamily = scanner.nextLine().toLowerCase();
            familyNumber++;
        }
        scanner.close();
        return familyTree;
  }

}