package SecondOne.Model;

import java.util.List;

public class AmericaShopping implements Shopping {
    Region region= Region.USA;
    double tax ;
    double customtax;
    double shippingFee = 15;
    double exShippingFee = 5;
    double exShippingFeeXL = 10;
    double TotalPrice = 0;





    public double calculatePrice(List<Product> products) {
        for(int i = 0; i< products.size(); i++){
            customtax = products.get(i).getPrice()* 0.075;
            TotalPrice += products.get(i).getPrice();
            if(products.get(i).getSize() == Size.XL){
                TotalPrice += exShippingFeeXL;
            }TotalPrice += exShippingFee;
        }
        tax = TotalPrice * 0.01;
        TotalPrice = TotalPrice + customtax + tax +shippingFee;


        return TotalPrice;

    }


    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
