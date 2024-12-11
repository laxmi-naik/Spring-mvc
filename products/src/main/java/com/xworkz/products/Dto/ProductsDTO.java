package com.xworkz.products.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
@Data
@NoArgsConstructor
public class ProductsDTO {
    private  String name;
    private  String type;
    private  int cost;
    private String manufacturer;
    private String manufacturerDate;
    private  int warranty;
}
