package com.egova.baselibrary.retrofit.upload;

/**
 * 上传进度回调类
 * Created by WZG on 2016/10/20.
 */

public interface UploadProgressListener {
    /**
     * 上传进度
     * @param currentBytesCount
     * @param totalBytesCount
     */
    void onProgress(String key, long currentBytesCount, long totalBytesCount);
}