package com.github.appreciated.css.grid.sizes;

import com.github.appreciated.css.grid.interfaces.AreaUnit;
import com.github.appreciated.css.grid.interfaces.RowOrColUnit;

public class Area implements AreaUnit, RowOrColUnit {

    private String area;

    public Area(String area) {
        this.area = area;
    }

    @Override
    public String getValue() {
        return String.valueOf(area);
    }

    @Override
    public boolean hasSuffix() {
        return false;
    }

    @Override
    public String getSuffixValue() {
        return null;
    }

}