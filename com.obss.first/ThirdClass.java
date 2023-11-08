 package com.obss.first;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ThirdClass {

    private String name;

    public ThirdClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doAnotherThing() {
        System.out.println("Third class " + name + " is doing another thing");
        try {
            File file = new File("C:\\Users\\Java\\Projects\\FirstProject\\src\\com\\obss\\first\\ThirdClass.java");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ThirdClass{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThirdClass that = (ThirdClass) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

