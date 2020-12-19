public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(400000,30,3);
        CreditRateAndInterestsSimulator simulator = new CreditRateAndInterestsSimulator();

        simulator.setTerm(credit1);

        simulator.calculateCredit1(credit1);
        simulator.calculateCredit2(credit1);
        simulator.calculateCredit3(credit1);


    }
}
