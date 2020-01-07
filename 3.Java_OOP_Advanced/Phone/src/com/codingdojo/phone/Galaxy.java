package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        return "Galaxy " + getVersionNumber() + " says " + getRingTone();
    }
    
    @Override
    public String unlock() {
        return "Unlocking via fingerprint";
    }
    
    @Override
    public void displayInfo() {
    	String info = String.format("Galaxy %s from %s", getVersionNumber(), getCarrier());
        System.out.println(info);          
    }
}