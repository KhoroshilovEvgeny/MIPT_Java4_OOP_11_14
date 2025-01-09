public class Quadrate {
    private Point leftUpConner;
    private int sideOfSquare;

    public Quadrate(Point leftUpConer, int sideOfSquare) {
        if (sideOfSquare <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительным (т.е. больше нуля) числом"
                    + ", а в качестве аргумента было передано: " + sideOfSquare);
        }
        this.leftUpConner = leftUpConer;
        this.sideOfSquare = sideOfSquare;
    }

    public Quadrate(int x, int y, int sideOfSquare) {
        this(new Point(x, y),sideOfSquare);
    }

    public Point getLeftUpConner() {
        return leftUpConner;
    }

    public void setLeftUpConner(Point leftUpConner) {
        this.leftUpConner = leftUpConner;
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(int sideOfSquare) {
        if (sideOfSquare <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительным (т.е. больше нуля) числом"
                    + ", а в качестве аргумента было передано: " + sideOfSquare);
        }
        this.sideOfSquare = sideOfSquare;
    }

    public Polyline polylineFromQuadrate() {
        Polyline result = new Polyline(leftUpConner);
        result.add(leftUpConner.getX() + sideOfSquare, leftUpConner.getY());
        result.add(leftUpConner.getX() + sideOfSquare, leftUpConner.getY() - sideOfSquare);
        result.add(leftUpConner.getX() , leftUpConner.getY() - + sideOfSquare);
        result.add(leftUpConner.getX(), leftUpConner.getY());
        return  result;
    }
    @Override
    public String toString() {
        return "Квадрат в " + leftUpConner + " со стороной " + sideOfSquare;
    }
}
