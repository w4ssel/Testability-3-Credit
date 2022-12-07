public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма ежемесячного платежа на срок 1 год:");
        System.out.printf("%.0f", service.calculate(1_000_000, 1, 9.99));

        System.out.println();
        System.out.println();
        System.out.println("Сумма ежемесячного платежа на срок 2 год:");
        System.out.printf("%.0f", service.calculate(1_000_000, 2, 9.99));

        System.out.println();
        System.out.println();
        System.out.println("Сумма ежемесячного платежа на срок 3 год:");
        System.out.printf("%.0f", service.calculate(1_000_000, 3, 9.99));
    }
}