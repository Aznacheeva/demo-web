package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> result = new ArrayList<>();
        result.add(new Post("ПРЕВЕД МЕДВЕД"));
        result.add(new Post("третье сентября.... день прощанья"));
        result.add(new Post("сентябрь гарит..."));

        return result;
    }

}
