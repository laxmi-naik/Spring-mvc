package com.xworkz.products.Service;

import com.xworkz.products.Dto.ProductsDTO;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService{
    @Override
    public boolean saveAndValid(ProductsDTO productsDTO) {
        boolean valid= true;
        if(productsDTO!=null){

            String name=productsDTO.getName();
            if(name!=null&&name.length()>4){
                System.out.println("name is correct");
            }
            else {
                valid=false;
                System.out.println("name is incorrect");
            }
            int cost=productsDTO.getCost();
            if(cost!=0){
                System.out.println("cost is correct");
            }
            else {
                valid=false;
                System.out.println("cost is incorrect");
            }
        }

        return valid ;
    }
}
