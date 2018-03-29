package com.twitter.controller;import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class getInstance {
	private static Twitter twitter;

	public static Twitter getInstance(){
		if(twitter == null){
			twitter = new TwitterFactory().getInstance();
			return twitter;
		}
		return twitter;
	}
}
