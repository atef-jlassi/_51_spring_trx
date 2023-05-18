package com.services;

import com.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  @Transactional
  public void addOneProduct() {
    productRepository.addProduct("Beer");
    throw new RuntimeException(" :(");
  }
}
