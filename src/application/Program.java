package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
		Date moment = sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to new Zealand";
		String content = "i'm going to visit this wonderful country!";
		Integer likes = 12;
		Post post = new Post(moment, title, content, likes);
		
		String comment = "Have a nice trip";
		Comment newComent = new Comment(comment);
		post.addComments(newComent);
		
		String comment2 = "Wow that's awesome!";
		Comment newComent2 = new Comment(comment2);
		post.addComments(newComent2);
		
		Date moment2 = sdf.parse("28/07/2018 23:14:19");
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		Integer likes2 = 5;
		Post post2 = new Post(moment2, title2, content2, likes2);
		
		String comment3 = "Good Night";
		Comment newComent3 = new Comment(comment3);
		post2.addComments(newComent3);
		
		String comment4 = "May the force be with you";
		Comment newComent4 = new Comment(comment4);
		post2.addComments(newComent4);
		
		System.out.println(post);
		System.out.println("");
		System.out.println(post2);
		

	}

}
