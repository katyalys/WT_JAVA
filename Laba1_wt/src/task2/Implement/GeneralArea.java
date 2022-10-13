package task2.Implement;

import task2.Interface.Area;

public class GeneralArea implements Area {
    private final Area[] areas;

    public GeneralArea(Area... areas) {
        this.areas = areas;
    }

    @Override
    public boolean contains(double x, double y) {
        for (Area area : areas) {
            if (area.contains(x, y)) return true;
        }

        return false;
    }
}
