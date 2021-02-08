package com.example.aulaspring2.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.aulaspring2.entities.Post;
import com.example.aulaspring2.entities.User;
import com.example.aulaspring2.repositories.PostRepository;
import com.example.aulaspring2.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2021"), "Partiu viagem", "Muito bom viagem", maria);
		Post post2 = new Post(null, sdf.parse("21/03/2021"), "Foto Estrelada", "Melhores fotos", maria);
		Post post3 = new Post(null, sdf.parse("21/03/2021"), "Carro do ano", "Rapido com nunca", bob);
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		postRepository.saveAll(Arrays.asList(post1, post2, post3));
	}

}
