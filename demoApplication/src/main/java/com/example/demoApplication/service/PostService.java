package com.example.demoApplication.service;

import com.example.demoApplication.model.Post;
import com.example.demoApplication.model.User;
import com.example.demoApplication.repository.PostRepository;
import com.example.demoApplication.repository.UserRepository;
import com.example.demoApplication.request.PostRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Post createPost(PostRequest request) {
        Post post = new Post();
        post.setDate(LocalDateTime.now().toString());
        post.setTitle(request.getTitle());
        post.setUser(userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("User Id Not found")));
        return postRepository.save(post);



    }

    public Post updatePost(Long postId, Post changedpost) {
        Post post;
        post = postRepository.findById(postId).orElseThrow(() -> new RuntimeException("id not found"));
//        if (changedpost.getEmail() != null) {
//            post.setEmail(changedpost.getEmail());
//        }
        if (changedpost.getPostId() != null) {
            post.setTitle(changedpost.getTitle());
        }
//        if (changedpost.getPhoneNumber() != null) {
//            post.setPhoneNumber(changedpost.getPhoneNumber());
//        }
        return postRepository.save(post);
    }
}
