package com.warehouse.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.warehouse.application.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> { 

}
