import java.util.Arrays;

public class Town {
    String name = "";
    Route routes[];

    public Town(String name, Route ... routes) {
        this.name = name;
        this.routes = routes;
    }

    // конструктор на случай - 	Только название

    public Town(String name) {
        this(name, new Route[0]);
    }

    @Override
    public String toString() {
        String result = name;
        for (Route elem: routes) {
            result = result + "\n" + elem;
        }
        return result;
    }
}
