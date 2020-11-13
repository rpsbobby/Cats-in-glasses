package com.company;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {


        // to call a method
        // <yourMethodName>();
        example();
        methodRobert();



    }
    public static void yourMethod(){
       /* Add your code here
        it might be whatever you need
        youre gonna create new method
        and then add it to the main method
        that will make program much more coherent
        */
    }

     public static void example(){
         System.out.println("Example method");
     }
     public static void methodRobert (){
         int a = 4, b = 5;
         float sum = (float) (a+b)/2;
         System.out.println("sum of "+a+" + "+b+" devided by numebr of factors = "+sum);
     }
}

