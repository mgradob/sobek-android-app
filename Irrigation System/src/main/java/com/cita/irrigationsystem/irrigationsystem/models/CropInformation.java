package com.cita.irrigationsystem.irrigationsystem.models;

/**
 * Created by mgradob on 4/4/14.
 */
public class CropInformation {
    private int Crop_ID;
    private String Crop_Name;
    private String Crop_Desc;
    private int Crop_EV;

    public int getCrop_ID() {
        return Crop_ID;
    }

    public void setCrop_ID(int crop_ID) {
        Crop_ID = crop_ID;
    }

    public String getCrop_Name() {
        return Crop_Name;
    }

    public void setCrop_Name(String crop_Name) {
        Crop_Name = crop_Name;
    }

    public String getCrop_Desc() {
        return Crop_Desc;
    }

    public void setCrop_Desc(String crop_Desc) {
        Crop_Desc = crop_Desc;
    }

    public int getCrop_EV() {
        return Crop_EV;
    }

    public void setCrop_EV(int crop_EV) {
        Crop_EV = crop_EV;
    }

    @Override
    public String toString() {
        return "CropInformation{" +
                "Crop_ID=" + Crop_ID +
                ", Crop_Name='" + Crop_Name + '\'' +
                ", Crop_Desc='" + Crop_Desc + '\'' +
                ", Crop_EV=" + Crop_EV +
                '}';
    }
}
