package br.com.devblog.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devblog.model.Post;
import br.com.devblog.repository.CodeBlogRepository;
import br.com.devblog.service.CodeblogService;

import java.util.List;

@Service
public class CodeBlogServiceImpl implements CodeblogService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
}
