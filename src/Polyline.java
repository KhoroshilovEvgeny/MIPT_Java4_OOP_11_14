import java.util.ArrayList;
import java.util.Arrays;

public class Polyline {
    Point points[];

    public Polyline(Point ... points) {
        this.points = points;
    }

    public Polyline(Polyline polyline) {
        this(polyline.points);
    }

    public Polyline() {
        this(new Point[0]);
    }
    public Polyline(int ... coord)
    {
        ArrayList<Point> pointsFromCoord = new ArrayList<>();
        for (int i = 0; i < coord.length; i = i + 2) {
            pointsFromCoord.add(new Point(coord[i],coord[i+1]));
        }
        Point[] arr = new Point[pointsFromCoord.size()];
        arr = pointsFromCoord.toArray(arr);
        points = arr;
    }

    public void add (int ... coord) {
        ArrayList<Point> pointsFromCoord = new ArrayList<>(Arrays.asList(points));
        for (int i = 0; i < coord.length; i = i + 2) {
            pointsFromCoord.add(new Point(coord[i],coord[i+1]));
        }
        Point[] arr = new Point[pointsFromCoord.size()];
        arr = pointsFromCoord.toArray(arr);
        points = arr;
    }

    public void add (Point ... additionalPoints) {
        ArrayList<Point> pointsFromPoints = new ArrayList<>(Arrays.asList(points));
        for (int i = 0; i < additionalPoints.length;  i++) {
            pointsFromPoints.add(additionalPoints[i]);
        }
        Point[] arr = new Point[pointsFromPoints.size()];
        arr = pointsFromPoints.toArray(arr);
        points = arr;
    }

    // метод, который удаляет в ломанной линии заданную по позиции точку
    public void  removePoint (int pos) {
        if (( this.points.length == 0) ) {
            throw new IllegalArgumentException("Данная ломаная линия не содерждит точек, поэтому у нее нельзя удалить" +
                    " какую-либо точку.");
        }
        if ((pos < 0) || (pos >= this.points.length) ) {
            throw new IllegalArgumentException("Позиция удаляемой точки должна быть в интервале от 0 включительно до " +
                    (this.points.length - 1) + " включительно");
        }
        Point result[] = new Point[points.length - 1];
        for (int i = 0; i < pos; i++) {
            result[i] = points[i];

        }
        for (int i = pos; i < points.length - 1; i++) {
            result[i] = points[i + 1];
        }
        points = result;
    }
    // метод, который удаляет в ломанной линии самую последнюю точку
    public void removeLastPoint() {
        this.removePoint(points.length-1);
    }


    public double calculateLength () {
        double tempLegnth = 0.0;
        if (points.length > 1) {
            for (int i = 0; i < points.length - 1; i++) {
                tempLegnth = tempLegnth + points[i].preciseDistance(points[i + 1]);
            }
        }
        return tempLegnth;
    }

    @Override
    public String toString() {
        String result = "Линия ";
        for (int i = 0; i < points.length; i++) {
            result += points[i];
            if (i != points.length - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
