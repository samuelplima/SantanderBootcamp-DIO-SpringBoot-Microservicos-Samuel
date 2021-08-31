package com.one.digitalinnovation.shoppingcart.repository;

import com.one.digitalinnovation.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;


public interface CartRepository extends CrudRepository<Cart, Integer> {
}
