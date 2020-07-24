package com.onboarding.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onboarding.core.beans.PostComponent;

@SpringBootApplication
public class PrimerProyectoApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("com.onboarding.core.beans.postComponent")
	public PostComponent postComponent;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postComponent.getPosts().forEach(p -> {
			System.out.println(p.getDescripcion());
			
		});
		
	}

}
