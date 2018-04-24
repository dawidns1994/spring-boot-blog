package com.test.blog.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/posts")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable Long id) {
        postService.updatePost(post);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
    public void addPost(@PathVariable Long id) {
        postService.deletePost(id);
    }


}
