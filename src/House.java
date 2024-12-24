public class House {
    final int floor;

    public House(int floor) {
        this.floor = floor;
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
