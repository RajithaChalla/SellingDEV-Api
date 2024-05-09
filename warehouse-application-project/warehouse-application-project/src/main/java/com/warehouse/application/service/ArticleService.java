package com.warehouse.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.application.entity.Article;
import com.warehouse.application.repository.ArticleRepository;

@Service
@Transactional
public class ArticleService {
	@Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(String id) {
        Optional<Article> articleOptional = articleRepository.findById(id);
        return articleOptional.orElse(null);
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article updateArticle(String id, Article article) {
        Optional<Article> existingArticleOptional = articleRepository.findById(id);
        if (existingArticleOptional.isPresent()) {
            Article existingArticle = existingArticleOptional.get();
            existingArticle.setArtName(article.getArtName());
            existingArticle.setStock(article.getStock());
            return articleRepository.save(existingArticle);
        } else {
            return null;
        }
    }

    public void deleteArticle(String id) {
        articleRepository.deleteById(id);
    }

}
