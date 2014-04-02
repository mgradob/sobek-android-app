package com.cita.irrigationsystem.irrigationsystem.models;

/**
 * Created by Enrique Ramirez on 4/2/14.
 *
 *
 * Class used as a model for the main screen icons
 *
 */
public class ClimaticData {

    private String text;
    private String value;
    private int imgResource;

    public ClimaticData(String text, String value, int imgResource) {
        this.text = text;
        this.value = value;
        this.imgResource = imgResource;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    @Override
    public String toString() {
        return "ClimaticData{" +
                "text='" + text + '\'' +
                ", value='" + value + '\'' +
                ", imgResource=" + imgResource +
                '}';
    }
}
