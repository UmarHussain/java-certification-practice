package com.company.chapter3.string.methods;

/**
 * Created by bv on 8/10/2016.
 */
public class StringMethods {


    public static void stringBuilderQuestion12(){

        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }




    public static String subString(String string,Integer beginIndex,Integer endIndex){

    try {
            if(beginIndex == null & endIndex == null){
                return "both indexes are null";
            }else{
            if(endIndex == null){
            String substring1 = string.substring(beginIndex);
            return substring1;
            }else{
                String substring1 = string.substring(beginIndex, endIndex);
                return substring1;
                }
            }
        }catch(Exception e){
            return "substring not found";
        }

    }

    public static Boolean containsString(String string,CharSequence charSequence){
        return string.contains(charSequence);
    }

    public  static void methodChaining(String start){


        System.out.println(start);
        String trimmed = start.trim();
        System.out.println(trimmed);
        String lowercase = trimmed.toLowerCase();
        System.out.println(lowercase);
        String result = lowercase.replace('a','A');
        System.out.println(result);
    }

    /**
     * String Builder indexof,length and substring method implemented
     */
    public void StringBuilder(){

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

    }

    public static void StringBuidlerAppendCharacters(){
        StringBuilder alpha = new StringBuilder();

        for(char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }
        System.out.println(alpha);

    }

    public static void main(String[] args) {

       /*

        System.out.println("---------------- BEGIN INDEX ONLY  ---------------------");

        System.out.println(subString(string, 0, null));
        System.out.println(subString(string, 1, null));


        System.out.println("------------------ USING INDEX OF IN SUBSTRING INDEX -----------------------------");

        System.out.println(subString(string, 0, string.indexOf("oo")));

        System.out.println("---------------------CONTAINS METHODS-----------------------------------");

        System.out.println(containsString(string,"a"));

        */

        //methodChaining("AniMal     ");

        /*String string  = "Yahoo";

        System.out.println("----------- BOTH INDEXES ------------------");

        System.out.println(subString(string, 0, 0));
        System.out.println(subString(string, 0, 1));
        System.out.println(subString(string, 0, 2));
        System.out.println(subString(string, 0, 3));*/

        //StringBuidlerAppendCharacters();

        stringBuilderQuestion12();


    }



}
