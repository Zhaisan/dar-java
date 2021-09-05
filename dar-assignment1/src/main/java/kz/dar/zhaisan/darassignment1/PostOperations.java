package kz.dar.zhaisan.darassignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PostOperations {
    private static HashMap<Long, Post> posts = new HashMap<>();
    private static Long index = 2L;

    static {
        Post post1 = new Post(1, "Mobile phone", "KZ.ALMATY.Tolebi59", "ON THE WAY");
        Post post2 = new Post(2, "Sticker pack", "RU.MOSCOW.Tverskoi123", "DELIVERED");
        Post post3 = new Post(3, "Office chair", "UK.LONDON.BakerStreet98", "READY TO SEND");
        Post post4 = new Post(4, "Fast charger", "UA.KIEV.Donskoi321", "CANCELED");
        posts.put(1L, post1);
        posts.put(2L, post2);
        posts.put(3L, post3);
        posts.put(4L, post4);
    }

    public static ArrayList<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }

    public static Post getPostDetails(Long postId){
        return posts.get(postId);
    }

    public static Post addPost(Post post) {
        index += 1;
        post.setId(Math.toIntExact(index));
        posts.put(index, post);
        return post;
    }

    public static Post updatePost(Long postId, Post post) {
        post.setId(Math.toIntExact(postId));
        posts.put(postId, post);
        return post;
    }

    public static Post deletePost(Long postId) {
        return posts.remove(postId);
    }









}
