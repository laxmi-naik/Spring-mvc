package com.xworkz.products.controller;

import com.xworkz.products.Dto.ProductsDTO;
import com.xworkz.products.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")
public class ProductsController {

        @Autowired
        private ProductsService productsService;
        public ProductsController()
        {
            System.out.println("Running in ProductsController");
        }

        @RequestMapping(value = "/order",method = RequestMethod.POST)

        public String onSave(ProductsDTO productsDTO, Model model) {
            System.out.println("onSave running in ProductController");
            System.out.println(productsDTO.toString());

            if(productsService.saveAndValid(productsDTO)){
                model.addAttribute("message","Product is successfully order");
                model.addAttribute("productsDTO",productsDTO);
                return "ProductSuccess.jsp";

            }
            else {
               model.addAttribute("failure","error while ordering a product");
                return "Product.jsp";

            }


        }
}
