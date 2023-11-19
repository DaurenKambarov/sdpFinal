public class CashToCardAdapter implements PaymentMethod {
    private PaymentByCash paymentByCash;

    public CashToCardAdapter(PaymentByCash paymentByCash) {
        this.paymentByCash = paymentByCash;
    }

    @Override
    public void pay(Product product) {
        paymentByCash.pay(product);
        System.out.println("Converted cash to card payment.");
    }
}
