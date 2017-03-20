package com.win.java.se.task3;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {

    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<Integer>();
    }

    public Integer getElement() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    public void setElement(Integer element) {
        list.add(element);
    }

}
