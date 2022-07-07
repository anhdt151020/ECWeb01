package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
