package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
