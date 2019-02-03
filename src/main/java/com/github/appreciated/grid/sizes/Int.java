package com.github.appreciated.grid.sizes;

import com.github.appreciated.grid.interfaces.RowOrColUnit;

public class Int implements RowOrColUnit {
    private int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
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