package com.asterdio.model;

/**
 * Created by Admin on 12/27/2016.
 */
public class Option
{
    private int option_id;
    private String value;

    public int getOption_id() {
        return option_id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Option() {

    }

    public Option(int option_id, String value) {
        this.option_id = option_id;
        this.value = value;
    }
}
