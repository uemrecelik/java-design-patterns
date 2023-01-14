package SecondOne.Model;

import java.util.List;

public class EuropeShopping implements Shopping {
    Region region= Region.EUR;
    double tax ;
    double shippingFee = 15;
    double exShippingFeeXL = 10;
    double TotalPrice = 0;



    public double calculatePrice(List<Product> products) {
        for(int i = 0; i< products.size(); i++){

            TotalPrice += products.get(i).getPrice();
            if(products.get(i).getSize() == Size.XL){
                TotalPrice += exShippingFeeXL;
            }
        }
        tax = TotalPrice * 0.015;
        TotalPrice = TotalPrice + tax +shippingFee;


        return TotalPrice;

    }
    public Currency getCurrency() {
        return Currency.EUR;
    }
}

