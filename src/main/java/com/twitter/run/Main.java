package com.twitter.run;

import java.util.List;

import com.twitter.utils.CreateTweet;
import com.twitter.utils.Search;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Main {	
	
	public static void main(String[] args) throws TwitterException {
		Search.SearchWithWord("Overwatch");
//		CreateTweet tweet = new CreateTweet();
//		tweet.createTweet("Test");
//		String id = "079707";
//		System.out.println(Long.parseLong(id));
//		Search.searchTweetById(Long.parseLong(id));
//		Search.getRetweets(3383L);
//		Search.searchUsers("Paul");
		

	}

}
