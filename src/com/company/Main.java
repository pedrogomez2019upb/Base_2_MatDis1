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
        //Test commit
        Scanner sc= new Scanner(System.in);
        int numCases=0;
        //BigInteger numCases = new BigInteger("0");
        numCases=sc.nextInt();
        for (int i=0;i<numCases;i++){
            int numRead=sc.nextInt();
            String newNum = "";
            if (numRead!=0){

                while (numRead != 0) {
                    int module = numRead % -2;
                    numRead /= -2;

                    if (module < 0) {
                        module += (-(-2));
                        numRead += 1;
                    }

                    newNum = module + newNum;

                }
            }
            else{
                newNum="0";
            }
            casesOutput += "Case " + (i+1) + ": " + newNum + "\n";
        }
        System.out.println(casesOutput);

    }
}
