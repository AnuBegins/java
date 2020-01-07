package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        return "iPhone " + getVersionNumber() + " says " + getRingTone();
    }
    
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
    	String info = String.format("iPhone %s from %s", getVersionNumber(), getCarrier());
        System.out.println(info);          
    }
}