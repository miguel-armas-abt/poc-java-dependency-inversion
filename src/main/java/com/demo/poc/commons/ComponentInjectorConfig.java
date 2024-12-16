package com.demo.poc.commons;

import com.demo.poc.dao.ProductDAO;
import com.demo.poc.dao.ProductDAOImpl;
import com.demo.poc.repository.correct.ProductRepository;
import com.google.inject.AbstractModule;

public class ComponentInjectorConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(ProductDAO.class).to(ProductDAOImpl.class);
        bind(ProductRepository.class);
    }
}
