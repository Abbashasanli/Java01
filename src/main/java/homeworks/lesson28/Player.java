package homeworks.lesson28;

public  final class  Player implements Comparable<Player> {
    public final String name;
    public final int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Player{name='%s', score=%d}", name, score);
    }

    @Override
    public int compareTo(Player that) {
        if (this.score != that.score) {
            return Integer.compare(this.score, that.score);
        }
        return -this.name.compareTo(that.name);
    }
}
