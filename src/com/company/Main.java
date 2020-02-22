//#####################
//Base -2 Exercise
//#####################
package com.company;
//#####################
//Import Libraries
//#####################
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String casesOutput="";
        Scanner sc= new Scanner(System.in);
        int numCases=0;
        numCases=sc.nextInt();
        for (int i=0;i<numCases;i++){
            int numRead=sc.nextInt();
            String newNum = "";
            while (numRead != 0)
            {
                int remainder = numRead % -2;
                numRead /= -2;

                if (remainder < 0)
                {
                    remainder += (-(-2));
                    numRead += 1;
                }

                newNum = remainder + newNum;

            }
            casesOutput += "Case " + (i+1) + ": " + newNum + "\n";
        }
        System.out.println(casesOutput);

    }
}
