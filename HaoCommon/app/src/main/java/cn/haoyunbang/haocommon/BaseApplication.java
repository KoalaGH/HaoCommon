package cn.haoyunbang.haocommon;

import android.app.Application;

import com.orhanobut.logger.LogLevel;

import cn.haoyunbang.common.widget.log.LogUtil;

/**
 * Created by fangxiao on 15/9/7.
 */
public class BaseApplication extends Application {

    // 定义是否是强制显示log的模式
    protected static final boolean LOG = false;

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.init()               // default PRETTYLOGGER or use just init()
                //.setMethodCount(2);            // default 2
                //.hideThreadInfo()             // default shown
                .setMethodOffset(1);           // default 0
        // 在debug下，才显示log
        LogUtil.init().setLogLevel(BuildConfig.DEBUG ? LogLevel.FULL : LogLevel.NONE);
        // 如果是强制显示log，那么无论在什么模式下都显示log
        if (BaseApplication.LOG) {
            LogUtil.init().setLogLevel(LogLevel.FULL);
        }
    }
}