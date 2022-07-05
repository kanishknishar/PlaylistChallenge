public class Song {
    private final String title;
    private final double length;

    public Song(String title, double length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return title + " - "
                + (length/60) + "  minutes";
    }
}
