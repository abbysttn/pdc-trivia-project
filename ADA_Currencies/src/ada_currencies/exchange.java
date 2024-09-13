package ada_currencies;

import java.util.Scanner;

public class exchange {

    public static double[][] convertToWeights(double[][] rates) {
        int n = rates.length;
        double[][] weights = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    weights[i][j] = -Math.log10(rates[i][j]);
                } else {
                    weights[i][j] = 0;
                }
            }
        }

        return weights;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inf = 999;

        
        //Arbitrage test 1
        String[] currencies = {"NZD", "AUD", "USD", "GBP", "CHF"};

        double[][] rates = {
            {inf, 0.92, 0.62, 0.47, 0.53},
            {1.09, inf, 0.67, 0.51, 0.57},
            {1.62, 1.49, inf, 0.77, 0.85},
            {2.12, 1.95, 1.31, inf, 1.11},
            {1.9, 1.75, 1.17, 0.9, inf}
        };

        //Arbitrage test 2
        String[] currencies2 = {"CAD", "JPY", "KRW", "EUR", "USD", "GBP", "NZD"};

        double[][] rates2 = {
            {inf, 105.05, 988.11, 0.67, 0.74, 0.56, 1.2},
            {0.0095, inf, 9.4, 0.0064, 0.007, 0.0054, 0.011},
            {0.001, 0.11, inf, 0.00068, 0.00075, 0.00057, 0.0012},
            {1.5, 157.07, 1477.39, inf, 1.1, 0.84, 1.8},
            {1.36, 142.59, 1341.07, 0.91, inf, 0.77, 1.63},
            {1.77, 186.1, 1750.39, 1.18, 1.31, inf, 2.13},
            {0.83, 87.47, 822.69, 0.56, 0.61, 0.47, inf}
        };

        //Best conversion test
        String[] currencies3 = {"A", "B", "C", "D", "E"};

        double[][] rates3 = {
            {inf, 1.0, 0.5, 0.5, 0.5},
            {0.5, inf, 1.0, 0.5, 0.5},
            {0.5, 0.5, inf, 1.0, 1.0},
            {0.5, 1.0, 0.5, inf, 0.5},
            {0.5, 0.5, 0.5, 0.5, inf}
        };

        System.out.println("Choose input from: text(t) / saved(s) / API(a)");
        boolean y = true;
        while (y) {
            String ans = scan.nextLine().toLowerCase();

            switch (ans) {
                case "t":
                    inputRates();

                    y = false;
                    break;

                case "s":
                    int selected = selectSaved();
                    switch (selected) {
                        case 1:
                            if (!ArbitrageCheck.detectArbitrage(currencies.length, currencies, rates)) {
                                ArbitrageCheck.findBestConversion(currencies.length, currencies, rates, 0, currencies.length - 1);
                            }
                            break;

                        case 2:
                            if (!ArbitrageCheck.detectArbitrage(currencies2.length, currencies2, rates2)) {
                                ArbitrageCheck.findBestConversion(currencies2.length, currencies2, rates2, 0, currencies2.length - 1);
                            }
                            break;

                        case 3:
                            if (!ArbitrageCheck.detectArbitrage(currencies3.length, currencies3, rates3)) {
                                ArbitrageCheck.findBestConversion(currencies3.length, currencies3, rates3, 0, currencies3.length - 1);
                            }
                            break;

                        default:
                            if (!ArbitrageCheck.detectArbitrage(currencies3.length, currencies3, rates3)) {
                                ArbitrageCheck.findBestConversion(currencies3.length, currencies3, rates3, 0, currencies3.length - 1);
                            }
                            break;
                    }
                    y = false;
                    break;

                case "a":
                    getAPI();
                    y = false;
                    break;

                default:
                    System.out.println("Please enter either t, s, or a to answer the above question.");
            }
        }

    }

    private static int selectSaved() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1, 2, or 3 to choose a saved rates matrix:");

        boolean y = true;
        int selected = 0;

        while (y) {
            int ans = scan.nextInt();

            switch (ans) {
                case 1:
                    selected = 1;
                    y = false;
                    break;

                case 2:
                    selected = 2;
                    y = false;
                    break;

                case 3:
                    selected = 3;
                    y = false;
                    break;

                default:
                    System.out.println("Please enter either 1, 2, or 3 to choose the rates:");
            }
        }

        return selected;
    }

    private static void inputRates() {
        //String[] questionAndAnswers = line.split("\\|");
        //String question = questionAndAnswers[0];
        System.out.println("Please input the number of currencies and the names of currencies: (3 USD NZD AUD)");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] parts = input.split("\\s+");
        int num = Integer.parseInt(parts[0]);
        String[] currency = new String[parts.length - 1];
        for (int i = 1; i < parts.length; i++) {
            currency[i - 1] = parts[i];
            System.out.println(currency[i - 1]);
        }

        double[][] importRates = new double[num][num];

        for (int i = 0; i < currency.length; i++) {
            System.out.print("Enter the rates from " + currency[i] + " to");
            for (int j = 0; j < currency.length; j++) {
                System.out.print(" " + currency[j]);
            }
            System.out.println("\n(Enter 999 if the rate is going to itself)\n");
            String nums = scan.nextLine();
            String[] rates = nums.split("\\s+");
            for (int k = 0; k < num; k++) {
                double rate = Double.parseDouble(rates[k]);
                importRates[i][k] = rate;
            }
        }

        if (!ArbitrageCheck.detectArbitrage(num, currency, importRates)) {
            ArbitrageCheck.findBestConversion(num, currency, importRates, 0, num - 1);
        }
    }

    private static void getAPI() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of currencies and the names of each currency:");
        System.out.println("(3 USD AUD NZD)\n");

        String input = scan.nextLine();

        String[] parts = input.split("\\s+");
        int num = Integer.parseInt(parts[0]);
        String[] currency = new String[parts.length - 1];
        for (int i = 1; i < parts.length; i++) {
            currency[i - 1] = parts[i];
        }

        double[][] importRates = new double[num][num];

        for (int i = 0; i < num; i++) {
            String from = currency[i];
            for (int j = 0; j < num; j++) {
                String to = currency[j];
                if (from.equals(to)) {
                    importRates[i][j] = 999;
                } else {
                    double rate = ExchangeRatesAPI.getCurrency(from, to);
                    importRates[i][j] = rate;
                }
            }
        }
        
        if (!ArbitrageCheck.detectArbitrage(num, currency, importRates)) {
            ArbitrageCheck.findBestConversion(num, currency, importRates, 0, num - 1);
        }
    }
}
