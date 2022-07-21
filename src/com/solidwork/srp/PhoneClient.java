package com.solidwork.srp;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplemention(), new DataManagerImplements());
        phone.dial("9228415101");
        phone.send("first message");
        phone.receive();
        phone.disconnet();
    }
}
