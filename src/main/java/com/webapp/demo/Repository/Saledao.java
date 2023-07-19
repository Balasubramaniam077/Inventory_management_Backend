package com.webapp.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.Model.Product;
import com.webapp.demo.Model.Sales;

public interface Saledao extends JpaRepository<Sales, Long> {

    List <Sales> findByProductId(Long productId);
    

}
