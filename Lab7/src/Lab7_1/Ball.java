package Lab7_1;

public abstract class Ball {
    private String treadMark;

    public Ball(String treadMark) {
        this.treadMark = treadMark;
    }

    public String getTreadMark() {
        return treadMark;
    }

    public abstract void inflate(double volume);
}
