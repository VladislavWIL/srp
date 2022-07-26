package com.solidwork.srp;

public class Phone implements IConnectionManager, IDataManager {

    private IConnectionManager connection;
    private IDataManager dataChannel;

    public Phone(IConnectionManager connection, IDataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnet() {
        connection.disconnet();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
