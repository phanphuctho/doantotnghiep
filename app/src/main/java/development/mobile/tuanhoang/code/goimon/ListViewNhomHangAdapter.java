package development.mobile.tuanhoang.code.goimon;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import development.mobile.tuanhoang.code.R;
import development.mobile.tuanhoang.code.entity.NhomHang;

public class ListViewNhomHangAdapter extends ArrayAdapter<String> {
    private Activity context = null;
    private int layoutID;
    private List<String> nhomHangLst = null;
    public int positionSelected;

    public ListViewNhomHangAdapter(Activity context, int textViewResourceId, List<String> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.layoutID = textViewResourceId;
        this.nhomHangLst = objects;
        this.positionSelected = 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID, null);

        if(nhomHangLst.size() > 0 && position >= 0){
            final TextView nhomHangTxtView = (TextView) convertView.findViewById(R.id.nhomHangTxtView);
            final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
            if(position == positionSelected){
                linearLayout.setBackgroundColor(Color.parseColor("#019f0b"));
            }
            nhomHangTxtView.setText(nhomHangLst.get(position));
        }
        return convertView;
    }
}
