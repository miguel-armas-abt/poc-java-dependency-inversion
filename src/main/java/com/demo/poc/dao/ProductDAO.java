package com.demo.poc.dao;

import com.demo.poc.dto.ProductDTO;
import java.util.List;

public interface ProductDAO {

    List<ProductDTO> findAll();

    ProductDTO findById(Long id);
}
