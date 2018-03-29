package com.twitter.utils;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class CreateTweet {
	public String createTweet(String tweet) throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
		Status status = twitter.updateStatus(tweet);
		System.out.println("Tweet posté avec succès");
		return status.getText();		
	}
	
}
