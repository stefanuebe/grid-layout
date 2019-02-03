package com.github.appreciated.grid.sizes;

import com.github.appreciated.grid.interfaces.AutoRowAndColUnit;
import com.github.appreciated.grid.interfaces.MinMaxUnit;
import com.github.appreciated.grid.interfaces.TemplateRowsAndColsUnit;

public class MaxContent implements AutoRowAndColUnit, TemplateRowsAndColsUnit, MinMaxUnit {
    @Override
    public String getValue() {
        return "max-content";
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
