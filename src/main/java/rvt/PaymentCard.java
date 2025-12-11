package rvt;

public class PaymentCard {

    static class PaymentCards {
        private double balance;

        public PaymentCards(double openingBalance) {
            this.balance = openingBalance;
        }

        public String toString() {
            return "The card has a balance of " + this.balance + " euros";
        }

        public void eatAffordably() {
            double price = 2.60;

            if (this.balance >= price) {
                this.balance -= price;
            }
        }

        public void eatHeartily() {
            double price = 4.60;

            if (this.balance >= price) {
                this.balance -= price;
            }
        }

        public void addMoney(double amount) {
                if (amount < 0) {
                    return;
                }

                this.balance += amount;

                if (this.balance > 150) {
                    this.balance = 150;
                }
            }
        }

        public static void main(String[] args) {

            PaymentCards paulsCard = new PaymentCards(20);
            PaymentCards mattsCard = new PaymentCards(30);

            paulsCard.eatHeartily();

            mattsCard.eatAffordably();

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);

            paulsCard.addMoney(20);

            mattsCard.eatHeartily();

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);

            paulsCard.eatAffordably();
            paulsCard.eatAffordably();

            mattsCard.addMoney(50);

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);
    }
}


