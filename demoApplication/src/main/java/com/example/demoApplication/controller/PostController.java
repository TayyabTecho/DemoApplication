package com.example.demoApplication.controller;


import com.example.demoApplication.model.Post;
import com.example.demoApplication.request.PostRequest;
import com.example.demoApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService service;

    @PostMapping("/")
    public Post createPost(@RequestBody PostRequest postRequest){
        return service.createPost(postRequest);
    }

//    @PutMapping("/upateById/userId")
//public Post updatePost(@PathVariable Long postId, @RequestBody Post post){
//        Post post=PostService(Long postId,  )
//}

}