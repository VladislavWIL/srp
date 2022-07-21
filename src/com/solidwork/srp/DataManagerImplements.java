package com.solidwork.srp;

public class DataManagerImplements implements IDataManager {
    @Override
    public void send(String message) {
        System.out.println("message send successfully");
    }

    @Override
    public int receive() {
        return 0;
    }
}
