package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
	
	private int ID;
	private String groupName;
	private ArrayList<User> users;
	private ArrayList<Message> messages;
	
	
	public Group(int ID, String groupName){
		this.ID = ID;
		this.groupName = groupName;
		this.users = new ArrayList<User>();
		this.messages = new ArrayList<Message>();
	}
	
	
	public int getID(){
		return this.ID;
	}
	
	public String getGroupName(){
		return this.groupName;
	}
	
	public ArrayList<User> getUsers(){
		return this.users;
	}
	
	public void addUser(User user){
		users.add(user);
	}
	
	public ArrayList<Message> getMessages(){
		return this.messages;
	}
	
	public void addMessage(Message m){
		this.messages.add(m);
	}
}
