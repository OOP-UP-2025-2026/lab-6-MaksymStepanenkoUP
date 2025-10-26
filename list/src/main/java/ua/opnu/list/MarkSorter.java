package ua.opnu.list;

import java.util.Comparator;

public class MarkSorter implements Comparator {

    private final boolean order;

    public MarkSorter(final boolean order) {
        this.order = order;
    }

    @Override
    public int compare(final Object o1, final Object o2) {
        if (o1 instanceof Student s1 && o2 instanceof Student s2) {

            if (order) {
                return Double.compare(s1.getAvgMark(), s2.getAvgMark());
            } else {
                return Double.compare(s2.getAvgMark(), s1.getAvgMark());
            }

        }
        return 0;
    }
}
