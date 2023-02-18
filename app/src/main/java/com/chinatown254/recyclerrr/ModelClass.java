package com.chinatown254.recyclerrr;

public class ModelClass {


    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }

    public String getTextview2() {
        return textview2;
    }

    public void setTextview2(String textview2) {
        this.textview2 = textview2;
    }

    public String getTextview3() {
        return textview3;
    }

    public void setTextview3(String textview3) {
        this.textview3 = textview3;
    }

    public String getDivider() {
        return divider;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }

    public ModelClass(int imageView1,String textview1 , String textview2, String textview3, String divider) {
        this.imageView1 = imageView1;
        this.textview1 = textview1;
        this.textview2 = textview2;
        this.textview3 = textview3;
        this.divider = divider;
    }

    private int imageView1;

    public String getTextview1() {
        return textview1;
    }

    public void setTextview1(String textview1) {
        this.textview1 = textview1;
    }

    private String textview1;
    private String textview2;
    private String textview3;
    private String divider;

}
