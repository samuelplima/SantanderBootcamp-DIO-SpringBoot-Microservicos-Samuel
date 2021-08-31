package com.one.digitalinnovation.productcatalog.repository;

import com.one.digitalinnovation.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
