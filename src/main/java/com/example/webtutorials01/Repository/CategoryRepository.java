package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {


    Optional<Category> findOneByIdAndName(String id, String Name);
}
