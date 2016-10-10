package com.company.chapter3.array;

/**
 * Created by umar hussain on 10/10/2016.
 */
public class AddingArray {

    /*  public int recursiveCarryValue(int a ,int b){

        int result =

    }*/

    public static int[]  addTwoArray(int[] arr1, int[] arr2){

      int[] result  =new int [arr1.length > arr2.length ? arr1.length : arr2.length];

      if(result.length == arr2.length && result.length == arr1.length){
          for(int i = 0 ; i < (result.length) ; i++) {
              int value = arr1[i] + arr2[i];
                  if(value > 9) {
                      if(result.length-1 == i) {
                          result[i] += value;
                      }else{
                          result[i] += value - 10;
                          if (result.length > i + 1) {
                              result[i + 1] += 1;
                          }
                      }
                  } else {
                      result[i] += value;
                      }
                  }
         }else{
          int smallerArray = arr1.length < arr2.length ? arr1.length : arr2.length;
            for(int i = 0 ; i < (result.length) ; i++) {
              int value;
                   if(smallerArray > i) {
                  value = arr1[i] + arr2[i];
                  if(value > 9){
                      result[i] += value-10;
                      if(result.length>i+1){
                          result[i+1] += 1;
                      }
                  } else{
                      result[i] += value;
                  }
              }else{
                  result[i] += smallerArray == arr2.length ? arr1[i] : arr2[i];
              }
          }
      }
     return result;
        }


    public static void main(String... args) {



        int [] arr1 = {1,2,3,4,5,9,9};
        int [] arr2 = {1,2,3,4,5,9,9};

       int [] result  = addTwoArray(arr1,arr2);

        for(int i  = 0; i < result.length ; i++)
        System.out.print(result[i]+",");


    }




}
