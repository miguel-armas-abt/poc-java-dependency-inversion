package com.demo.poc;

import com.demo.poc.commons.ComponentInjectorConfig;
import com.demo.poc.dto.ProductDTO;
import com.demo.poc.repository.correct.ProductRepository;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ComponentInjectorConfig());
        ProductRepository repository = injector.getInstance(ProductRepository.class);

        for (ProductDTO product: repository.findAll())
            System.out.println(product);
    }
}
