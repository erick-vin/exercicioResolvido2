package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.Comment;


public class Post {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>(); 
	
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	public void addComments(Comment comments) {
		this.comments.add(comments);
	}
	
	public void removeComments(Comment comments) {
		this.comments.remove(comments);
	}
	
	public String toString() {
		StringBuilder feed = new StringBuilder();
		feed.append(title + "\n");
		feed.append(likes + "Likes - ");
		feed.append(sdf.format(moment) + "\n");
		feed.append(content + "\n");
		feed.append("Comments: \n");
		for(Comment c : comments) {
			feed.append(c.getText() + "\n");;
		}
		return feed.toString();
	}
	
}
