package com.cita.irrigationsystem.irrigationsystem.models;

/**
 * Created by mgradob on 4/3/14.
 */
public class CropInformation {

    private int field_id;
    private String field_name;
    private String field_desc;
    private float field_lat;
    private float field_long;

    public CropInformation(int id, String name, String desc, float lat, float lng) {
        this.field_id = id;
        this.field_name = name;
        this.field_desc = desc;
        this.field_lat = lat;
        this.field_long = lng;
    }

    public int getField_id() {
        return field_id;
    }

    public void setField_id(int field_id) {
        this.field_id = field_id;
    }

    public String getField_name() {
        return field_name;
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public String getField_desc() {
        return field_desc;
    }

    public void setField_desc(String field_desc) {
        this.field_desc = field_desc;
    }

    public float getField_lat() {
        return field_lat;
    }

    public void setField_lat(float field_lat) {
        this.field_lat = field_lat;
    }

    public float getField_long() {
        return field_long;
    }

    public void setField_long(float field_long) {
        this.field_long = field_long;
    }

    @Override
    public String toString() {
        return "CropInformation{" +
                "field_id=" + field_id +
                ", field_name='" + field_name + '\'' +
                ", field_desc='" + field_desc + '\'' +
                ", field_lat=" + field_lat +
                ", field_long=" + field_long +
                '}';
    }
}
