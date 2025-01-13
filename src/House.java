public class House {
    private final int floor;

    public House(int floor) {
        if (floor < 1) {
            throw new IllegalArgumentException("Количество этажей в создаваемом доме должно быть положительным числом,"
            + " т.е. больше нуля. При создании данного дома было указано число этажей: " + floor);
        }
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        String lastWord = " этажами";
        if (this.floor == 1) {
            lastWord = " этажом";
        }
        return "дом с " + floor + lastWord;
    }
}
