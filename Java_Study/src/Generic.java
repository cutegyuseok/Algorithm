public class Generic {
    public static void main(String[] args) {
        Card card = new Card();
        card.setCardNum("9429-0200-4412-19");
        Cash cash = new Cash();
        cash.setAllCash(100000);
        Phone phone1 = new Phone("01011111234","SamsungNote10","gyuseok");
        Payment<Card> cardPayment = new Payment<>();
        cardPayment.set(card);
        Card card1 = cardPayment.get();
        Payment<Cash> cashPayment = new Payment<>();
        cashPayment.pay();
    }
}

    class Payment<T> {
        private T pm;
        public void set(T o) {
            pm = o;
        }
        public T get() {
            return pm;
        }
        static int limit = 100000;
        public void pay(){
            limit = limit-1000;
        }
    }

    class SamsungPay {
        Phone phone;

        public void setPhone(Phone phone) {
            this.phone = phone;
        }
    }

    class Card {
        String cardNum;

        public void setCardNum(String cardNum) {
            this.cardNum = cardNum;
        }
    }

    class Cash {
        int allCash;

        public void setAllCash(int allCash) {
            this.allCash = allCash;
        }
    }

    class Phone {
        String PhoneNum;
        String PhoneName;
        String Owner;

        public Phone (String phoneNum, String phoneName, String owner) {
            phoneNum = this.PhoneNum;
            phoneName = this.PhoneName;
            owner = this.Owner;
        }

    }

