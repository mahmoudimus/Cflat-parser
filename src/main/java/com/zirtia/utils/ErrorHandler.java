package com.zirtia.utils;

import java.io.OutputStream;
import java.io.PrintStream;

public class ErrorHandler {
    protected String programId;
    protected PrintStream stream;
    protected long nError;
    protected long nWarning;

    public ErrorHandler(String progid) {
        programId = progid;
        stream = System.err;
    }

    public ErrorHandler(String progid, OutputStream stream) {
        programId = progid;
        this.stream = new PrintStream(stream);
    }


    public void error(String msg) {
        stream.println(programId + ": error: " + msg);
        nError++;
    }

    public void warn(String msg) {
        stream.println(programId + ": warning: " + msg);
        nWarning++;
    }

    public boolean errorOccured() {
        return (nError > 0);
    }
}
