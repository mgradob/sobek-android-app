package com.cita.irrigationsystem.irrigationsystem;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by mgradob on 4/2/14.
 */
public class ClimaticData extends BaseAdapter {
    private Context context;
    private final String[] text, value;
    private final int[] imageId;

    public ClimaticData(Context context, String[] text, String[] value, int[] id){
        this.context = context;
        this.text = text;
        this.value = value;
        this.imageId = id;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null){
            grid = new View(context);
            grid = li.inflate(R.layout.climatic_info_details, null);

            ImageView img = (ImageView) grid.findViewById(R.id.grid_image);
            TextView val = (TextView) grid.findViewById(R.id.grid_value);
            TextView txt = (TextView) grid.findViewById(R.id.grid_text);

            img.setImageResource(imageId[i]);
            val.setText(value[i]);
            txt.setText(text[i]);
        } else {
            grid = (View) view;
        }

        return grid;
    }
}
