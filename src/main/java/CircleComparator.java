import Comparator.Comparator;
import Shapes.Circle;

public class CircleComparator extends Circle implements Comparator {
    @Override
    public void compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
