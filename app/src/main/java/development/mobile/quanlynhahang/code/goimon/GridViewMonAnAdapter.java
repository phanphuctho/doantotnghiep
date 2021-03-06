package development.mobile.quanlynhahang.code.goimon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

import development.mobile.tuanhoang.code.R;
import development.mobile.quanlynhahang.code.entity.MonAn;

public class GridViewMonAnAdapter extends ArrayAdapter<MonAn> {
    private Activity context = null;
    private int layoutID;
    private List<MonAn> monAnLst = null;

    public GridViewMonAnAdapter(Activity context, int textViewResourceId, List<MonAn> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.layoutID = textViewResourceId;
        this.monAnLst = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID, null);

        if(monAnLst.size() > 0 && position >= 0){
            final TextView tenMonTxtView = (TextView) convertView.findViewById(R.id.tenMonTxtView);
            final TextView giaTxtView = (TextView) convertView.findViewById(R.id.giaTxtView);
            final MonAn monAn = monAnLst.get(position);
            tenMonTxtView.setText(monAn.getTenMonAn());
            giaTxtView.setText(NumberFormat.getCurrencyInstance().format(monAn.getGia()));
        }
        return convertView;
    }
}
