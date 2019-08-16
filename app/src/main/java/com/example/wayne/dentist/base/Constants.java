package com.example.wayne.dentist.base;

import android.os.Environment;

import java.io.File;

/**
 * @name 张东
 * @time 2019/8/114:31
 */
public interface Constants {

    //是否为debug状态,正式上线版本需要改为false
    boolean isDebug = true;


    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "codeest" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY = "com.baidu.geek.fileprovider";

    //网络缓存的地址
    String PATH_DATA = BaseApp.getInstance().getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";
    String DATA = "data";

    String USER_NAME = "userName";
    boolean ifmap = true;
    String SEARCH_CONTENT = "search_content";
    String PASSWORD = "password";

    String NIGHT = "night";
    String DATASBEAN = "datasbean";
    String TOKEN = "tooken";
    String TABID = "tabid";

}
