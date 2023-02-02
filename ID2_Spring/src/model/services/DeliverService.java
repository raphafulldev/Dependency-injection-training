package model.services;

public class DeliverService {

    public double fee (String state){
        if (state.equalsIgnoreCase("SP")){
            return 10;
        }else return 20;
    }
}
