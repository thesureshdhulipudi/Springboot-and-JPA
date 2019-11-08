package com.example.jpa;

import com.example.jpa.model.Post;
import com.example.jpa.model.Tag;
import com.example.jpa.repository.PostRepository;
import com.example.jpa.repository.TagRepository;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaManyToManyDemoApplication implements CommandLineRunner {

	@Autowired
	private TagRepository tagRepository;

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Cleanup the tables
		postRepository.deleteAllInBatch();
		tagRepository.deleteAllInBatch();

		// =======================================

		// Create a Post
		Post post = new Post("Hibernate Many to Many Example with Spring Boot",
				"Learn how to map a many to many relationship using hibernate",
				"Entire Post content with Sample code");
		
		// Create two tags
		Tag tag1 = new Tag("Spring Boot");
		Tag tag2 = new Tag("Hibernate");
		Tag tag3 = new Tag("JPA");


		// Add tag references in the post
//		post.getTags().add(tag1);
//		post.getTags().add(tag2);
//		post.getTags().add(tag3);
		
		Set<Tag> tagsSet = new HashSet<>();
		tagsSet.add(tag1);
		tagsSet.add(tag2);
		tagsSet.add(tag3);
		
		post.setTags(tagsSet);
		
		post.setId(1L);

		// Add post reference in the tags
		tag1.getPosts().add(post);
		tag2.getPosts().add(post);
		tag3.getPosts().add(post);
		
		//postRepository.save(post);
		tagRepository.save(tag1);

		// =======================================

	}
}
