public class Line {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line() {
        this(new Point(), new Point());
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public String toString() {
        return "Линия от {" + point1.x + ";" + point1.y + "} до {"
                + point2.x + ";" + point2.y + "}";
    }
}
