package com.roy_sun.awesomeshop_imitative.bean;

/**
 * Created by Roy_Sun on 2016/2/16 0016.
 */
public class TabHostBean {
    private int title;
    private int icon;
    private Class fragment;

    public TabHostBean(int title, int icon, Class fragment) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }
}
