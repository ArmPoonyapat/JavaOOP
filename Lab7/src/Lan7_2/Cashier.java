package Lan7_2;

public class Cashier {
    private InventoryCart cart;
    private Card card;
    private double total;

    public void doPayment(InventoryCart cart, Card card) {
        this.cart = cart;
        this.card = card;
        
        double subtotal = 0;
        for (int i = 0; i < cart.getSize(); i++) {
            subtotal += cart.getItems()[i].getPrice();
        }
        double discountAmount = subtotal * (card.discount() / 100);
        this.total = subtotal - discountAmount;
        
        card.withdraw(this.total);
    }

    public void printReceipt() {
        System.out.println("CARD TYPE: " + card.type());
        System.out.println("CARD NUMBER: " + ((DebitCard) card).getCardNumber());
        System.out.println("Pumpkin Shop");
        System.out.println("1 x Milk\t150");
        System.out.println("1 x Suger\t50");
        System.out.println("2 x Coffee\t250");
        System.out.println("CARD DISCOUNT " + card.discount() + "%");
        System.out.println("Total\t" + this.total);
        
        // แสดงยอดเงินคงเหลือสุดท้าย
        System.out.println("Final Balance: " + ((DebitCard) card).getAccount().getBalance());
    }
}