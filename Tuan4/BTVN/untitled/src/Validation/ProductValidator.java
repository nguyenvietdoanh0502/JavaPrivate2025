package Validation;

import Constant.Constant;
import Model.Product;

public class ProductValidator {
    public boolean isValid(Product product){
        if(product.getName().isEmpty()){
            System.out.println(Constant.ErrorMassage.NAME_EMPTY);
            return false;
        }
        if(product.getDescription().isEmpty()){
            System.out.println(Constant.ErrorMassage.DESCRIPTION_EMPTY);
            return false;
        }
        if(product.getPrice()<=0){
            System.out.println(Constant.ErrorMassage.PRICE_INCORRECT);
            return false;
        }
        return true;
    }
}
