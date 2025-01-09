public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getPoint1() {
        return new Point(point1);
    }

    public void setPoint1(Point point1) {
        this.point1 = new Point(point1);
    }

    public void setPoint1(int x, int y) {
        this.point1= new Point(x,y);
    }

    public Point getPoint2() {
        return new Point(point2);
    }

    public void setPoint2(Point point2) {
        this.point1 = new Point(point2);
    }
    public void setPoint2(int x, int y) {
        this.point2= new Point(x,y);
    }
    @Override
    public String toString() {
        return "Линия от " + point1 + " до " + point2;
    }

    //  вычисление целочисленного расстояния линии
    public int intDistance() {
        return (int) Math.sqrt((point2.x - point1.x) * (point2.x - point1.x)
                + (point2.y - point1.y) * (point2.y - point1.y));
    }
}
