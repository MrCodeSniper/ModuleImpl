package com.hrz.moduleimpl;
//Thanks For Your Reviewing My Code 
//Please send your issues email to 15168264355@163.com when you find there are some bugs in My class 
//You Can add My wx 17620752830 and we can communicate each other about IT industry
//Code Programming By MrCodeSniper on 2018/11/26.Best Wishes to You!  []~(~▽~)~* Cheers!


import android.app.Application;

import com.ch.android.JdSdk.JdSdkRouter;
import com.ch.android.alibabaSDK.AlibabaSDK;

public class BaseApplication extends Application{

    public static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
        JdSdkRouter.init(application,"447f389022c343f09294898204070742","a07e8bdc4929448382503f9bba815975");
        AlibabaSDK.initSDK(application);
    }
}
