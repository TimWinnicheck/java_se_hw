package com.win.java.se.task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {

    private ResourceBundle bundle;

    public ResourceProperty(Locale locale) {
      //  bundle = ResourceBundle.getBundle("source");
     bundle = ResourceBundle.getBundle("source",locale);
    }
    public String getValue (String key) {
        return bundle.getString(key);
    }
}
