package com.example.carlosparra.fragmentsexercise2.models;

import java.util.ArrayList;

public class Device {

    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getDeviceName() {
        return deviceName;
    }

    public ArrayList<Device> createListOfDevices(DeviceMakes deviceMake) {
        ArrayList<Device> devices = new ArrayList<>();

        switch (deviceMake) {
            case Android:
                devices.add(new Device("Motorola Moto G4"));
                devices.add(new Device("Nexus 6P"));
                devices.add(new Device("Xiaomi RedMI 4"));
                devices.add(new Device("Samsung Galaxy S6"));
                devices.add(new Device("Samsung Galaxy S7"));
                devices.add(new Device("Samsung Galaxy S7 Edge"));
                devices.add(new Device("Huawei X"));
                devices.add(new Device("Blu HD"));
                devices.add(new Device("Motorola Moto X"));
                devices.add(new Device("Google Pixel 2"));
                break;
            case iOS:
                devices.add(new Device("iPhone 2"));
                devices.add(new Device("iPhone 3"));
                devices.add(new Device("iPhone 4"));
                devices.add(new Device("iPhone 5"));
                devices.add(new Device("iPhone 5S"));
                devices.add(new Device("iPhone 6"));
                devices.add(new Device("iPhone 6S"));
                devices.add(new Device("iPhone 6S Plus"));
                devices.add(new Device("iPhone 7S"));
                devices.add(new Device("iPhone X"));
                break;
            case Windows:
                devices.add(new Device("Lumia 430"));
                devices.add(new Device("Lumia 435"));
                devices.add(new Device("Another Windows Phone 1"));
                devices.add(new Device("Another Windows Phone 2"));
                devices.add(new Device("Another Windows Phone 3"));
                devices.add(new Device("Another Windows Phone 4"));
                devices.add(new Device("Another Windows Phone 5"));
                break;
                default:
                    break;
        }

        return devices;
    }
}

