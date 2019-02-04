package com.github.appreciated.css.grid.sizes;

import com.github.appreciated.css.grid.interfaces.*;

public class Auto implements AutoRowAndColUnit, RowOrColUnit, TemplateRowsAndColsUnit, MinMaxUnit, TemplateAreaUnit {
    @Override
    public String getValue() {
        return "auto";
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
