package com.github.appreciated.css.grid;

import com.vaadin.flow.component.Component;

import java.util.Arrays;

public interface GridLayoutComponent {

    default void setColumnAlign(Component component, ColumnAlign align) {
        for (String cssProperty : ColumnAlign.cssProperties) {
            component.getElement().getStyle().set(cssProperty, align.getAlignValue());
        }
    }

    default void setRowAlign(Component component, RowAlign align) {
        for (String cssProperty : RowAlign.cssProperties) {
            component.getElement().getStyle().set(cssProperty, align.getAlignValue());
        }
    }

    enum ColumnAlign {
        START("start"),
        END("end"),
        CENTER("center"),
        STRETCH("stretch");

        public static final String[] cssProperties = new String[]{"justify-self"};
        private final String alignValue;

        ColumnAlign(String alignValue) {
            this.alignValue = alignValue;
        }

        static ColumnAlign toColumnAlign(String alignValue, ColumnAlign defaultValue) {
            return Arrays.stream(values())
                    .filter((justifyContent) -> justifyContent.getAlignValue().equals(alignValue))
                    .findFirst()
                    .orElse(defaultValue);
        }

        String getAlignValue() {
            return this.alignValue;
        }
    }

    enum RowAlign {
        START("start"),
        END("end"),
        CENTER("center"),
        STRETCH("stretch");

        public static final String[] cssProperties = new String[]{"align-self"};
        private final String alignValue;

        RowAlign(String alignValue) {
            this.alignValue = alignValue;
        }

        static RowAlign toAlignment(String alignValue, RowAlign defaultValue) {
            return Arrays.stream(values())
                    .filter((alignment) -> alignment.getAlignValue().equals(alignValue))
                    .findFirst()
                    .orElse(defaultValue);
        }

        String getAlignValue() {
            return this.alignValue;
        }
    }

    enum AutoFlow {
        ROW("row"),
        COLUMN("column"),
        ROW_DENSE("row dense"),
        COLUMN_DENSE("column dense");

        public static final String cssProperty = "grid-auto-flow";
        private final String autoFlowValue;

        AutoFlow(String autoFlowValue) {
            this.autoFlowValue = autoFlowValue;
        }

        public static AutoFlow toAutoFlow(String autoFlowValue) {
            return toAutoFlow(autoFlowValue, ROW);
        }

        public static AutoFlow toAutoFlow(String autoFlowValue, AutoFlow defaultValue) {
            return Arrays.stream(values())
                    .filter((alignment) -> alignment.getAutoFlowValue().equals(autoFlowValue))
                    .findFirst()
                    .orElse(defaultValue);
        }

        public String getAutoFlowValue() {
            return this.autoFlowValue;
        }
    }

}
