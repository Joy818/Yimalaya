package com.zhy.yimalaya.interfaces;


import com.ximalaya.ting.android.opensdk.model.track.Track;

import java.util.List;

public interface IHistoryCallback {

    /**
     * 添加历史结果回调
     *
     * @param success
     */
    void onAddHistoryResult(boolean success);

    /**
     * 删除历史结果回调
     *
     * @param success
     */
    void onDeleteHistoryResult(boolean success);

    /**
     * 获取所有历史结果回调
     *
     * @param tracks
     */
    void onGetAllHistory(List<Track> tracks);

    /**
     * 清空所有历史结果回调
     *
     * @param success
     */
    void clearAllHistory(boolean success);
}
