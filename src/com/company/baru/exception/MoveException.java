package com.company.baru.exception;

/**
 * Exception of move.
 * @author dimassaputra
 * Created by dimassaputra on 4/25/16.
 */
public class MoveException extends Exception {
    private String msg;

    /**
     * Send the message.
     * @param msg String.
     */
    public MoveException(String msg) {
        this.msg = msg;
    }

    /**
     * return the error message
     * @return String.
     */
    public String toString() {
        return msg;
    }
}

