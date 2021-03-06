package com.cita.irrigationsystem.irrigationsystem.dummy;

import com.cita.irrigationsystem.irrigationsystem.R;
import com.cita.irrigationsystem.irrigationsystem.models.WeatherInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Item 1"));
        addItem(new DummyItem("2", "Item 2"));
        addItem(new DummyItem("3", "Item 3"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static ArrayList<WeatherInformation> WEATHERINFO = new ArrayList<WeatherInformation>();


    static {

        WEATHERINFO.add(new WeatherInformation("Hello", "Test", R.drawable.img_humidity));
        WEATHERINFO.add(new WeatherInformation("Hello", "Test", R.drawable.img_temperature));
        WEATHERINFO.add(new WeatherInformation("Hello", "Test", R.drawable.img_wind_speed));
        WEATHERINFO.add(new WeatherInformation("Hello", "Test", R.drawable.img_radiation));

    }

//    String[] texts = {
//getString(R.string.humidity),
//    getString(R.string.temperature),
//    getString(R.string.windSpeed),
//    getString(R.string.solar_radiation)
//};
//String[] values = {
//        getString(R.string.humidity_level),
//        getString(R.string.temperature_level),
//        getString(R.string.windSpeed_level),
//        getString(R.string.solar_radiation_level)
//        };
//        int[] imgIds = {
//        R.drawable.img_humidity,
//        R.drawable.img_temperature,
//        R.drawable.img_wind_speed,
//        R.drawable.img_radiation
//        };

}
