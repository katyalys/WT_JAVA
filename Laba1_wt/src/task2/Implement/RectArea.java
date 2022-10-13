package task2.Implement;

import task2.Interface.Area;

public class RectArea implements Area {
    private final double left;
    private final double top;
    private final double right;
    private final double bottom;

    public RectArea(double x, double y, double width, double height) {
        left = x;
        bottom = y;
        top = y + height;
        right = x + width;
    }

    @Override
    public boolean contains(double x, double y) {
        return x >= left && y >= bottom && x <= right && y <= top;
    }
}