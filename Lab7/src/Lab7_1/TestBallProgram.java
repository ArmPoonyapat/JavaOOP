package Lab7_1;

public class TestBallProgram {

    public static void main(String[] args) {
        // สร้าง Object ของแต่ละคลาส
        Ball ballA = new BallA("Zentia");
        Ball ballB = new BallB("Zapphire");
        Ball ballC = new BallC("Zenith");

        // ทดสอบการทำงานด้วยหลักการ Polymorphism
        TestBall(ballA, 1.0);
        TestBall(ballB, 1.1);
        TestBall(ballC, 1.2);
    }

    // static method สำหรับทดสอบการทำงาน
    public static void TestBall(Ball ballObject, double volume) {
        // เรียกใช้เมธอด inflate ซึ่งจะทำงานตามชนิดของ Object ที่ถูกส่งเข้ามา
        System.out.println("------------------------------------");
        System.out.println(ballObject.getTreadMark() + " is a trademark of " + ballObject.getClass().getSimpleName() + ".");
        ballObject.inflate(volume);

        // ตรวจสอบว่าเป็นชนิด RollAble หรือไม่ก่อนจะเรียกเมธอด roll()
        if (ballObject instanceof RollAble) {
            ((RollAble) ballObject).roll();
        }
    }
}
