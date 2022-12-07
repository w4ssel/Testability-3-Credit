public class CreditPaymentService {
    public double calculate(int amount, int term, double percent) {
        double monthlyPercent = percent / (100 * 12); // месячная процентная ставка
        int termInMonths = term * 12; // срок кредита в месяцах
        double monthlyPayment = amount * (monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -termInMonths))); // размер ежемесячного платежа
        return monthlyPayment;
    }
}
