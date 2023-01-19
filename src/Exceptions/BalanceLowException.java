package Exceptions;

import kotlin.jvm.Throws;

import java.text.MessageFormat;

/**
 * This is going to be the custom exception throwing when the user's
 * account balance is less than a certain amount
 * Exception is the mother of all exceptions
 *
 */

public class BalanceLowException extends Exception{

    public BalanceLowException() {

    }

    public BalanceLowException(String message) {
        super(message);
    }

    private static int[] accountNumber = {1001, 1003,1002,1004};

    private static double[] balanceLimit = {1000,99,1100,1999,750};

    private static String[] regiesteredNames = {"Akhila", "Manasa", "Soundarya","Shravya"};

    public static void main(String[] args) {

        try{

            //System.out.println("accountNumber" + "/t" + "balanceLimit" + "/t" + "regiesteredNames" +"/t");

            for(int i = 0; i < 5; i++){

                    System.out.println("accountNumber :" + accountNumber[i] + " - balanceLimit :" + balanceLimit[i] + " - regiesteredNames :" + regiesteredNames[i] );

                if (balanceLimit[i] < 1000){

                    BalanceLowException balanceLowException = new BalanceLowException("Balance is Low");
                    throw  balanceLowException;
                }

            }


        }
        catch(Exception e){

            e.printStackTrace();

        }
    }
}
