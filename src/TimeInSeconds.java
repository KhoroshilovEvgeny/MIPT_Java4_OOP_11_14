public class TimeInSeconds {
    int seconds = 0;

    @Override
    public String toString() {
        int secondsInDay = this.seconds % (24 * 60 *60);
        int hour = secondsInDay / (60 * 60);
        secondsInDay = secondsInDay % (60 * 60);
        int minute = secondsInDay / 60;
        secondsInDay = secondsInDay % 60;

        String result = hour + ":";
        if (minute < 10) {
            result +="0";
        }
        result = result + minute + ":";
        if (secondsInDay < 10) {
            result +="0";
        }
        result += secondsInDay;

        return result;
    }
}
