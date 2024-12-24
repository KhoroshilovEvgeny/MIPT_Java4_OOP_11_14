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
