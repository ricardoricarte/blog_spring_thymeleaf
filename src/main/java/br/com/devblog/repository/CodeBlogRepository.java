package br.com.devblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devblog.model.Post;


public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
