package cn.haoyunbang.common.widget.dialog.callback;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by fangxiao on 15/9/7.
 */
public interface DialogItemClick {
    void onOperItemClick(AdapterView<?> parent, View view, int position, long id);
}
