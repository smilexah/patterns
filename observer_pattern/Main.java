public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 100.00f);
        Stock stock2 = new Stock("APPL", 200.00f);

        Subscriber investor1 = new Investor("John");
        Subscriber investor2 = new Investor("Mike");
        Subscriber investor3 = new Investor("Abduali");

        stock.registerInvestor(investor1);
        stock.registerInvestor(investor2);
        stock.registerInvestor(investor3);

        System.out.println("=========================\n");

        stock.updatePrice(95.00f);

        stock2.registerInvestor(investor3);
        stock2.registerInvestor(investor2);

        System.out.println("\n=========================\n");

        stock2.updatePrice(210.00f);

        stock.unregisterInvestor(investor1);
        stock.unregisterInvestor(investor2);

        System.out.println("\n=========================\n");

        stock.updatePrice(99.00f);

        System.out.println("\n=========================");
    }
}
