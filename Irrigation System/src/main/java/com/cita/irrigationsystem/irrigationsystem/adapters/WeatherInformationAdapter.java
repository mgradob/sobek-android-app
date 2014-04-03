package com.cita.irrigationsystem.irrigationsystem.adapters;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cita.irrigationsystem.irrigationsystem.R;
import com.cita.irrigationsystem.irrigationsystem.dummy.DummyContent;
import com.cita.irrigationsystem.irrigationsystem.models.WeatherInformation;


public class WeatherInformationAdapter extends BaseAdapter {

    // TODO replace with a collection of data from the web
    private static final ArrayList<WeatherInformation> DATA = DummyContent.WEATHERINFO;

    private LayoutInflater mInflater;

    public WeatherInformationAdapter(Context context) {
        // Cache the LayoutInflate to avoid asking for a new one each time.
        mInflater = LayoutInflater.from(context);

    }

    /**
     * @see android.widget.ListAdapter getCount()
     */
    public int getCount() {
        return DATA.size();
    }

    /**
     * @see android.widget.ListAdapter getItem(int)
     */
    public Object getItem(int position) {
        return DATA.get(position);
    }

    /**
     * Use the array index as a unique id.
     *
     * @see android.widget.ListAdapter getItemId(int)
     */
    public long getItemId(int position) {
        return position;
    }

    /**
     * Make a view to hold each row.
     *
     * @see android.widget.ListAdapter getView(int, android view View,
     * android view ViewGroup)
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        // A ViewHolder keeps references to children views to avoid unneccessary
        // calls
        // to findViewById() on each row.
        ViewHolder holder;

        // When convertView is not null, we can reuse it directly, there is no
        // need
        // to reinflate it. We only inflate a new View when the convertView
        // supplied
        // by ListView is null.
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_weather_information, null);

            // Creates a ViewHolder and store references to the two children
            // views
            // we want to bind data to.
            holder = new ViewHolder();
            // TODO store references to your views
            holder.weatherTitle = (TextView) convertView.findViewById(R.id.weather_title);
            holder.weatherValue = (TextView) convertView
                    .findViewById(R.id.weather_value);
            holder.weatherIcon = (ImageView) convertView
                    .findViewById(R.id.weather_icon);

            convertView.setTag(holder);
        } else {
            // Get the ViewHolder back to get fast access to the TextView
            // and the ImageView.
            holder = (ViewHolder) convertView.getTag();
        }

        // TODO Bind your data efficiently with the holder.
        holder.weatherTitle.setText(DATA.get(position).getText());
        holder.weatherValue.setText(DATA.get(position).getValue());
        holder.weatherIcon.setImageResource(DATA.get(position).getImgResource());

        return convertView;
    }

    static class ViewHolder {
        // TODO define members for each view in the item layout
        TextView weatherTitle;
        TextView weatherValue;
        ImageView weatherIcon;
    }

}
