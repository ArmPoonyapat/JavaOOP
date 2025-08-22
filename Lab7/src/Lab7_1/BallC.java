package Lab7_1;

public class BallC extends BallA {

    public BallC(String treadMark) {
        super(treadMark);
    }

    @Override
    public void inflate(double volume) {
        System.out.println(this.getTreadMark() + "'s ball is inflated " + volume + " cu.ft.");
    }

    @Override
    public void roll() {
        System.out.println(this.getTreadMark() + " rolls very smoothly.");
    }
}
