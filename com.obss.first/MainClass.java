package com.obss.first;

public class MainClass {

    public static void main(String[] args) {
        new ThirdClass();
        SecondClass secondClass = new SecondClass();
        FirstClass firstClass = new FirstClass("First", secondClass);

        // Call the doSomething() method of the first class
        firstClass.doSomething();
    }
}
