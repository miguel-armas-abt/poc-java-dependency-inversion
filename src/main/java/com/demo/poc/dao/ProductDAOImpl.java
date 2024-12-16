package com.demo.poc.dao;

import com.demo.poc.commons.CsvReader;
import com.demo.poc.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO {

    private static final String FILE = "/products/products.csv";
    private static final char SEPARATOR = ',';

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> productList = new ArrayList<>();
        try {
            CsvReader.getRecords(FILE, SEPARATOR)
                    .forEach(csvRecord -> {

                        ProductDTO product = ProductDTO.builder()
                            .id(Long.parseLong(csvRecord.get("ID")))
                            .name(csvRecord.get("NAME"))
                            .category(csvRecord.get("CATEGORY"))
                            .brand(csvRecord.get("BRAND"))
                            .price(Double.parseDouble(csvRecord.get("PRICE")))
                            .model(csvRecord.get("MODEL"))
                            .build();

                        productList.add(product);
                    });
        } catch (Exception exception) {
            throw new IllegalArgumentException("Error reading CSV: " + exception.getMessage(), exception);
        }
        return productList;
    }

    @Override
    public ProductDTO findById(Long id) {
        List<ProductDTO> productList = this.findAll();
        for (ProductDTO product: productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new IllegalArgumentException("No such product");
    }
}
