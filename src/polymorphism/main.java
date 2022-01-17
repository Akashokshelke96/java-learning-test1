package polymorphism;

public class main {
    public static void main(String[] args) {
            Card card = new Card();
            CreditCard creditCard = new CreditCard();
            DebitCard debitCard = new DebitCard();

            acceptCard(card);
            acceptCard(debitCard);
            acceptCard(creditCard);

        }

        public static  void acceptCard(Card card) {
            card.printType();

        }
    }


