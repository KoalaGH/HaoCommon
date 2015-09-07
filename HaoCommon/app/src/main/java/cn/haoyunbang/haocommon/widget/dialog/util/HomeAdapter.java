package cn.haoyunbang.haocommon.widget.dialog.util;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


import cn.haoyunbang.haocommon.R;
import cn.haoyunbang.haocommon.widget.dialog.DialogDemoActivity;


public class HomeAdapter extends BaseExpandableListAdapter {
    private Context context;

    public HomeAdapter(Context context) {
        this.context = context;
    }

    // --->group
    @Override
    public int getGroupCount() {
        return DialogDemoActivity.groups.length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return DialogDemoActivity.groups[groupPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.ad_dialog_home, null);
        }

        TextView tv = ViewFindUtils.find(convertView, R.id.tv);
        tv.setText(DialogDemoActivity.groups[groupPosition]);
        return convertView;
    }

    // --->child
    @Override
    public int getChildrenCount(int groupPosition) {
        return DialogDemoActivity.childs[groupPosition].length;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return DialogDemoActivity.childs[groupPosition][childPosition];
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
                             ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.ad_dialog_home, null);
        }

        TextView tv = ViewFindUtils.find(convertView, R.id.tv);
        View v_line = ViewFindUtils.find(convertView, R.id.v_line);

        v_line.setVisibility(View.INVISIBLE);
        tv.setTextColor(Color.parseColor("#383838"));
        tv.setText(DialogDemoActivity.childs[groupPosition][childPosition]);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
