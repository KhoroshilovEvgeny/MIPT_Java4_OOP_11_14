public class Route {
    String name;
    Integer price;

    public Route(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    public Route() {
        this("",0);
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }
}
