package com.twitter.utils;

import java.util.List;

import com.twitter.controller.getInstance;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

public class Search {
	public static Twitter connection = getInstance.getInstance();

	public static void SearchWithWord(String research) throws TwitterException{	
	
	Query query = new Query(research);
	QueryResult result;
	do{
		result = connection.search(query);
		List<Status> tweets = result.getTweets();
		for(Status tweet : tweets){
			System.out.println("@"+ tweet.getUser().getScreenName()+ "-"+tweet.getText());
		}
	}while((query = result.nextQuery())!=null);		
	System.exit(0);
	}
	
	public static void searchTweetById(Long research) throws TwitterException{
		Status status = connection.showStatus(research);
		System.out.println("@" +status.getUser().getScreenName() + "- date du tweet = "+status.getCreatedAt()+ " " + status.getText()+" Id du tweet = "+status.getId() + ", User=" +status.getUser()
		+ "Nombre de favoris = " +status.getFavoriteCount()+", USER ID : "+status.getUser().getId());
		System.exit(0);
	}
	
	public static void getRetweets(Long id) throws TwitterException{
		List<Status> tweets = connection.getRetweets(id);
		for(Status status: tweets){
			System.out.println("@"+status.getUser().getScreenName()+" - "+status.getText());
			
		}
		System.out.println("Terminé.");
		System.exit(0);
	}
	
	public static void searchUsers(String name) throws TwitterException{
		int page = 1;
		ResponseList<User> users;
		users = connection.searchUsers(name, page);
		for(User user : users){
			if(user!= null){
				System.out.println("@"+user.getScreenName()+ " ("+ user.getName()+", ");
				System.out.println(+user.getFollowersCount()+" followers) - Dernier tweet: "+user.getStatus().getText());
				System.out.println("ID= "+user.getId()+" Language: "+user.getLang()+ ".");
				System.out.println("Vérifié ? "+user.isVerified());
				System.out.println(" Location: "+user.getLocation());
			}else{
				System.out.println("@"+ user.getScreenName());
			}
			page++;
		}while(users.size()!=0 && page<100);
		System.out.println("Terminé");
		System.exit(0);
	}
}