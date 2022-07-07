package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
