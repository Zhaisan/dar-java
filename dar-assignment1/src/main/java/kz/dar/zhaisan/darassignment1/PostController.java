package kz.dar.zhaisan.darassignment1;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostController {

    @GetMapping("/posts")
    public ArrayList<Post> getAllPosts() {
        return PostOperations.getAllPosts();
    }

    @GetMapping("/post/{postId}")
    public Post getPostDetails(@PathVariable Long postId){
        return PostOperations.getPostDetails(postId);
    }

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post) {
        return PostOperations.addPost(post);
    }

    @PutMapping("/updatePost/{postId}")
    public Post updatePost(@PathVariable Long postId, @RequestBody Post post) {
        return PostOperations.updatePost(postId, post);
    }

    @DeleteMapping("/deletePost/{postId}")
    public Post deletePost(@PathVariable Long postId) {
        return PostOperations.deletePost(postId);
    }



}
