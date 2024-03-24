public class CreditPaymentService {
    public int calculate(int amount, double rate, int paymentPeriod) {
        double interestRate = rate / 100 / 12;
        double result = amount * interestRate * Math.pow((1 + interestRate), paymentPeriod) / (Math.pow((1 + interestRate), paymentPeriod) - 1);
        return (int) result;
    }

}
