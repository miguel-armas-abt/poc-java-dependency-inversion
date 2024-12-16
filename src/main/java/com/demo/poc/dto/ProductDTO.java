package com.demo.poc.dto;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ProductDTO implements Serializable {

    private Long id;
    private String name;
    private String category;
    private String brand;
    private Double price;
    private String model;
}
