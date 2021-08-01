package com.toy.gamma.service.impl;

import com.toy.gamma.repository.PostsRepository;
import com.toy.gamma.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;

public class PostsServiceImpl implements PostsService {

    private final PostsRepository postsRepository;

    @Autowired
    public PostsServiceImpl(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

}
