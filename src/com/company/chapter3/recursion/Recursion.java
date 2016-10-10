package com.company.chapter3.recursion;

/**
 * Created by bv on 8/31/2016.
 */
public class Recursion {


    public static void recursivePrime(int number, boolean printPrime2){

        if(number >1){

            if(number == 2){
                if (printPrime2)
                    System.out.println("PRIME2  : "+number);
                else
                    System.out.println("PRIME : "+number);

                if (printPrime2==true)
                    printPrime2 = false;
                else
                    printPrime2 = true;

            }
            else if(number%2==0 && number != 2){
                System.out.println("EVEN : "+number);
            }else{

                for(int i = number ; i >= 2; i--){

                    Integer x;

                    if(i>2)
                     x = number % (i-1);
                     else
                        x = number % i;

                    if(x==0){
                        System.out.println("DIVISIBLE  ODD : "+number);
                        break;
                    }


                    if(i == 2 && number > 2){
                        if (x != 0 ){
                            if (printPrime2)
                                System.out.println("PRIME2  : "+number);
                            else
                                System.out.println("PRIME : "+number);

                            if (printPrime2==true)
                                printPrime2 = false;
                            else
                                printPrime2 = true;
                        }
                    }

                }
            }
            recursivePrime(number-1,printPrime2);
        }
    }

    public static void main(String[] args) {
        recursivePrime(21,false);
    }


}
