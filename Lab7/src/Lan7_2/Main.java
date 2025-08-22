package Lan7_2;

public class Main {
    public static void main(String[] args) {
        // สร้าง Object ของ FixedSalary
        FixedSalary employeeA = new FixedSalary("Clark", "Kent", "555-999-5555", 15000.00);

        // ฝากเงินเข้าบัญชีที่ผูกกับบัตร DebitCard ของ employeeA โดยตรง
        employeeA.getCard().getAccount().deposit(1000);

        // สร้าง Object ของสินค้า
        Milk p1 = new Milk(150);
        Sugar p2 = new Sugar(50);
        Product p3 = new Coffee(250);
        Product p4 = new Coffee(250);

        // สร้าง InventoryCart และเพิ่มสินค้า
        InventoryCart ic = new InventoryCart(10);
        ic.add(p1);
        ic.add(p2);
        ic.add(p3);
        ic.add(p4);

        // เรียกใช้ Cashier เพื่อทำรายการชำระเงิน
        Cashier c = new Cashier();
        c.doPayment(ic, employeeA.getCard());
        c.printReceipt();
    }
}