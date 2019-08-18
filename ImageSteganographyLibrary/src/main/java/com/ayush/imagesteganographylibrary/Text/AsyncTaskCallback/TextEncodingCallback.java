package com.ayush.imagesteganographylibrary.Text.AsyncTaskCallback;

import android.support.annotation.AnyThread;

import com.ayush.imagesteganographylibrary.Text.ImageSteganography;

/**
 * This the callback interface for TextEncoding AsyncTask.
 */

public interface TextEncodingCallback {

    @AnyThread
    void onStartTextEncoding();

    @AnyThread
    void onCompleteTextEncoding(ImageSteganography result);

}
