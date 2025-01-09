public class Route {
    private Town town;
    private Integer price;

    public Route(Town town, Integer price) {
        this.town = town;
        this.price = price;
    }

    public  Route (Route route) {
        this(route.getTown(), route.getPrice());
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return town + ":" + price;
    }
}
