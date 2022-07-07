package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
