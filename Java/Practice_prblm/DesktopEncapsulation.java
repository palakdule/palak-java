// Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize. 
// Provide public getter and setter methods to access and modify these variables.
//  Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.

import java.util.*;

public class DesktopEncapsulation {
    private String brand;
    private String processor;
    private int ramSize;

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void upgradeRam(int additionalRam) {
        this.ramSize += additionalRam;
    }
}

public class ComputerTest {
    public static void main(String[] args) {
        DesktopEncapsulation desktop = new DesktopEncapsulation();
        desktop.setBrand("Dell");
        desktop.setProcessor("Intel i7");
        desktop.setRamSize(16);

        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM Size: " + desktop.getRamSize() + " GB");

        desktop.upgradeRam(8);
        System.out.println("After upgrading RAM:");
        System.out.println("RAM Size: " + desktop.getRamSize() + " GB");
    }
}