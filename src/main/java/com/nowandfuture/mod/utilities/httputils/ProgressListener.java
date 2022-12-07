package com.nowandfuture.mod.utilities.httputils;

public interface ProgressListener {
    void start(long max);

    void loading(long readBytes, long totalBytes);

    void complete(String path);

    void fail(int code, String message);

    void loadfail(String message);
}
