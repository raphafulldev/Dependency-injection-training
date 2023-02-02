package services;

public class SPDeductionService implements DedeuctionService{
    @Override
    public double deduction(double amount) {
        return amount * 0.15;
    }
}
