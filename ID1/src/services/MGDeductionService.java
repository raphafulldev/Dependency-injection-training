package services;

public class MGDeductionService implements DedeuctionService{
    @Override
    public double deduction(double amount) {
        return amount * 0.12;
    }
}
