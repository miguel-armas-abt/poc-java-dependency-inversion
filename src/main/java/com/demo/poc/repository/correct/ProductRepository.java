package com.demo.poc.repository.correct;

import com.demo.poc.dao.ProductDAO;
import com.demo.poc.dto.ProductDTO;
import com.google.inject.Inject;
import java.util.List;

public class ProductRepository {

    private final ProductDAO productDAO;

    @Inject
    public ProductRepository(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<ProductDTO> findAll() {
        return productDAO.findAll();
    }

    public ProductDTO findById(Long id) {
        return productDAO.findById(id);
    }
}
