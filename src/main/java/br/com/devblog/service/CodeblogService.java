package br.com.devblog.service;

import java.util.List;

import br.com.devblog.model.Post;



public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
