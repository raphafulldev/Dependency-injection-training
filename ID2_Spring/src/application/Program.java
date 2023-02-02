package application;

import model.services.DeliverService;
import model.services.PayService;
import model.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        PayService payService = new PayService(new TaxService(), new DeliverService());

        System.out.println(payService.finalPrice(300, "Sc"));

        sc.close();
    }
}
