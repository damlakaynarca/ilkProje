package com.obss.first;

import java.util.Objects;

public class FirstClass {

    private String name;
    private SecondClass secondClass;

    public FirstClass(String name, SecondClass secondClass) {
        this.name = name;
        this.secondClass = secondClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecondClass getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public void doSomething() {
        System.out.println("First class " + name + " is doing something");
        secondClass.doSomethingElse();
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "name='" + name + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstClass that = (FirstClass) o;
        return name.equals(that.name) && secondClass.equals(that.secondClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondClass);
    }
}
