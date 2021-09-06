package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("ПРЕВЕД МЕДВЕД", new Date()));
        posts.add(new Post("третье сентября.... день прощанья", new Date()));
        posts.add(new Post("сентябрь гарит...", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
