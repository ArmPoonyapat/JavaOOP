package Lab7_1;

public class BallA extends Ball implements RollAble {

    public BallA(String treadMark) {
        super(treadMark);
    }

    @Override
    public void inflate(double volume) {
        System.out.println(this.getTreadMark() + "'s ball is inflated " + volume + " cu.ft.");
    }

    @Override
    public void roll() {
        System.out.println(this.getTreadMark() + " rolls rather smoothly.");
    }
}
