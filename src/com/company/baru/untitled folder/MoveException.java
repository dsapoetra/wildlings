package com.company.baru.exception;

/**
 * Created by dimassaputra on 4/25/16.
 */

import java.io.*;

public class MoveException extends Exception {
    private String msg;

    public MoveException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

