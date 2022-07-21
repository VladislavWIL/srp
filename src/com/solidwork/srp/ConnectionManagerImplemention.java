package com.solidwork.srp;

public class ConnectionManagerImplemention implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connection estabilished");
    }

    @Override
    public void disconnet() {
        System.out.println("diconnet phone");
    }
}
