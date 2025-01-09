public class TimeInSeconds {
    int seconds;

    public TimeInSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        int secondsInDay = this.seconds % (24 * 60 *60);
        int hours = secondsInDay / (60 * 60);
        secondsInDay = secondsInDay % (60 * 60);
        int minutes = secondsInDay / 60;
        secondsInDay = secondsInDay % 60;

        return  String.format("%02d:%02d:%02d", hours, minutes, secondsInDay);
    }
}
