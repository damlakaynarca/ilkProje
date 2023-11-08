package com.obss.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class SecondClass {

    private String name;
    private ThirdClass thirdClass;

    public SecondClass(String name, ThirdClass thirdClass) {
        this.name = name;
        this.thirdClass = thirdClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThirdClass getThirdClass() {
        return thirdClass;
    }

    public void setThirdClass(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    public void doSomethingElse() {
        System.out.println("Second class " + name + " is doing something else");
        thirdClass.doAnotherThing();
    }

    @Override
    public String toString() {
        return "SecondClass{" +
                "name='" + name + '\'' +
                ", thirdClass=" + thirdClass +
                '}';
    }}

