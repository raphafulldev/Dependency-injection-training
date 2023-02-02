package application;

import services.MGDeductionService;
import services.PayService;
import services.SPDeductionService;

public class Program {
    public static void main(String[] args) {

        PayService payService = new PayService(new MGDeductionService());

        double tax = payService.tax(1000.0);

        System.out.println(tax);

        PayService payService2 = new PayService(new SPDeductionService());

        double tax2 = payService2.tax(1000);

        System.out.println(tax2);

    }
}
