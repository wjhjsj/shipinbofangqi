package com.example.shipinbofangqi;


import android.app.Activity;
import android.os.Bundle;

import com.tencent.liteav.demo.play.SuperPlayerModel;
import com.tencent.liteav.demo.play.SuperPlayerVideoId;
import com.tencent.liteav.demo.play.SuperPlayerView;

public class MainActivity extends Activity {
    //超级播放器View
    private SuperPlayerView mSuperPlayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSuperPlayerView = (SuperPlayerView) findViewById(R.id.superVodPlayerView);
        //mSuperPlayerView.setPlayerViewCallback(this);
        play();
    }
    void play()
    {
        //不开防盗链
        SuperPlayerModel model = new SuperPlayerModel();
        model.appId = 1251530120;// 配置 AppId
        model.videoId = new SuperPlayerVideoId();
       // model.appid = 1251530120;
       // model.fileid = "5285890805780691891";
        model.videoId.fileId = "5285890805780691891"; // 配置 FileId
        mSuperPlayerView.playWithModel(model);

//开启防盗链需填写 psign， psign 即超级播放器签名，签名介绍和生成方式参见链接：https://cloud.tencent.com/document/product/266/42436
      /*  SuperPlayerModel model = new SuperPlayerModel();
        model.appId = 1400329071;// 配置 AppId
        model.videoId = new SuperPlayerVideoId();
        model.videoId.fileId = "5285890799710173650"; // 配置 FileId
        mSuperPlayerView.playWithModel(model);
        model.videoId.pSign = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHBJZCI6MTQwMDMyOTA3MSwiZmlsZUlkIjoiNTI4NTg5MDc5OTcxMDE3MzY1MCIsImN1cnJlbnRUaW1lU3RhbXAiOjEsImV4cGlyZVRpbWVTdGFtcCI6MjE0NzQ4MzY0NywidXJsQWNjZXNzSW5mbyI6eyJ0IjoiN2ZmZmZmZmYifSwiZHJtTGljZW5zZUluZm8iOnsiZXhwaXJlVGltZVN0YW1wIjoyMTQ3NDgzNjQ3fX0.yJxpnQ2Evp5KZQFfuBBK05BoPpQAzYAWo6liXws-LzU";
        mSuperPlayerView.playWithModel(model);*/
    }
}
