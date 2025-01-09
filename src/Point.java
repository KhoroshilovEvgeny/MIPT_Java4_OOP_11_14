public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.x, point.y);
    }


    @Override
    public String toString() {
        return "{" + x + ";" + y +"}";
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double preciseDistance (Point point) {
        return Math.sqrt(
                (this.getX() - point.getX()) * (this.getX() - point.getX()) +
                (this.getY() - point.getY()) * (this.getY() - point.getY()) );
    }
}
