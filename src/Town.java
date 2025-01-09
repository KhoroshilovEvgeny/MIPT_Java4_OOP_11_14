import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Town {
    private String name = "";
    private ArrayList<Route> routes = new ArrayList<>();

    public Town(String name, Route ... routes) {
        this.name = name;
        this.routes.addAll(Arrays.asList(routes));
    }

    // конструктор на случай - 	Только название

    public Town(String name) {
        this(name, new Route[0]);
    }

    // метод для добавления новых дорог, с проверкой на существование данной дороги
    public void  addRoute (Route extraRoute) {
        for (Route elem: routes) {
            if (elem.getTown().equals(extraRoute.getTown()) )  {
                elem.setPrice(extraRoute.getPrice());
                return;
            }
        }
        routes.add(new Route(extraRoute));
    }

    public void  addAllRoutes (Route ... extraAllRoutes) {
        ArrayList<Route> extraRoutes= new ArrayList<>(Arrays.asList(extraAllRoutes));
        for (Route addRoute: extraRoutes) {
            this.addRoute(addRoute);
        }
    }

    public void  removeRoute (Route extraRoute) {
        for (Route elem: routes) {
            if (elem.getTown().equals(extraRoute.getTown()) )  {
                routes.remove(elem);
                return;
            }
        }
    }


    public void  removeAllRoutes (Route ... routesForRemove) {
        ArrayList<Route> removeRoutes= new ArrayList<>(Arrays.asList(routesForRemove));
        for (Route route: removeRoutes) {
            this.removeRoute(route);
        }
    }

    @Override
    public String toString() {
        String result = name;
        for (Route elem: routes) {
            result = result + "\n" + elem;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town town)) return false;
        //return Objects.equals(name, town.name) && Objects.equals(routes, town.routes);
        return Objects.equals(name, town.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, routes);
    }
}
