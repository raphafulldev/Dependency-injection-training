package services;

public class PayService {

    private DedeuctionService dedeuctionService;

    public PayService(DedeuctionService dedeuctionService) {
        this.dedeuctionService = dedeuctionService;
    }

    public double tax (double amount){
        amount = amount - dedeuctionService.deduction(amount);
        return amount * 0.2;
    }
}
