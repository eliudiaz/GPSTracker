package com.ed.gps.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

/**
 * Created by eliud on 7/25/2017.
 */
public class Server implements Runnable {
    private final Integer port;
    private final String address;
    private DatagramSocket socket;

    public Server(Integer port, String address) {
        this.port = port;
        this.address = address;
    }


    @Override
    public void run() {
        byte[] receiveData = new byte[255];
        while (!socket.isClosed()) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            try {

                socket.receive(receivePacket);
                byte[] content = Arrays.copyOf(receivePacket.getData(), receivePacket.getLength());

            } catch (IOException e) {
                System.out.println("udpServer: socket closed");
            }
        }
    }
}