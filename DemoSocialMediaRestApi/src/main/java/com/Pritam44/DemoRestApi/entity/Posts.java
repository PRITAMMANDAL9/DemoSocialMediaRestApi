package com.Pritam44.DemoRestApi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Posts {
	@Id
	@GeneratedValue
	private int postId;
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	public Posts(int postId, String description, User user) {
		super();
		this.postId = postId;
		this.description = description;
		this.user = user;
	}
	public int getPostId() {
		return postId;
	}
	public String getDescription() {
		return description;
	}
	public User getUser() {
		return user;
	}
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Posts [postId=" + postId + ", description=" + description + ", user=" + user + "]";
	}
	
}
