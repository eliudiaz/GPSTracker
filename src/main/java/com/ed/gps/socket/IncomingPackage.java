package com.ed.gps.socket;


/**
 * Created by eliud on 7/25/2017.
 */
public class IncomingPackage {
    private final byte[] content;

    public IncomingPackage(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }
}
