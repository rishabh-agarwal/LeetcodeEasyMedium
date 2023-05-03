package org.question.pratice;

import java.math.BigInteger;

public class isPrimeNumber {
    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(17);
        if(num.isProbablePrime(100)){
            System.out.println(num+"is prime!");
        }else {
            System.out.println(num+"is not prime!");
        }
    }
}
