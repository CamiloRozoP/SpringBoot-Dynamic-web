package com.onboarding.core.beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.onboarding.models.Post;

@Component("com.onboarding.core.beans.postComponent")
public class PostComponent {
	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,"El perro es uno de los animales domésticos más antiguos del mundo y el mejor amigo del hombre","http://localhost/img/perro.jpg", new Date(1995,11,17),"Perro" ));
		post.add(new Post(2,"Khalid Robinson nació el 11 de febrero de 1998 en Fort Stewart, Georgia Pasó su infancia en distintos lugares de Estados Unidos","http://localhost/img/persona.jpg", new Date(1995,11,17),"Khalid" ));
		post.add(new Post(3,"Ke$ha es una cantante, compositora, productora, empresaria, bailarina, activista y actriz estadounidense.","http://localhost/img/mujer.jpg", new Date(1995,11,17),"Kesha" ));

		
		return post;
}}
