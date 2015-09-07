package cn.haoyunbang.haocommon.widget.log;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.haoyunbang.common.ui.BaseActivity;
import cn.haoyunbang.common.widget.log.LogUtil;
import cn.haoyunbang.haocommon.R;

/**
 * Created by fangxiao on 15/9/7.
 */
public class LogUtilDemoActivity extends BaseActivity {

    @Bind(R.id.text1)
    TextView text1;
    @Bind(R.id.text2)
    TextView text2;
    @Bind(R.id.text3)
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logutil_layout);
        ButterKnife.bind(this);
        init();
    }


    private void init() {

        // string
        String str = "test log";
        LogUtil.d(str != null ? str : "hello world");

        // json
        LogUtil.json("[{\"CityId\":18,\"CityName\":\"西安\",\"ProvinceId\":27,\"CityOrder\":1},{\"CityId\":53,\"CityName\":\"广州\",\"ProvinceId\":27,\"CityOrder\":1}]'");

        // arrays
        double[][] doubles = {
                {1.2, 1.6, 1.7, 30, 33},
                {1.2, 1.6, 1.7, 30, 33},
                {1.2, 1.6, 1.7, 30, 33},
                {1.2, 1.6, 1.7, 30, 33}
        };
        LogUtil.Object(doubles);


        // object
        LogUtil.Object(new User("jack", "f"));


        // sub class
        new User("name", "sex").log();

    }


    private class User {

        private String name;

        private String sex;

        User(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        public void log() {
            show();
        }

        private void show() {
            LogUtil.d("user");
        }
    }


}
