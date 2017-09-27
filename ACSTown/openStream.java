package twitter;

import java.io.IOException;
import java.util.*;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;


public class openStream {
	
	public static void main(String[] args) throws TwitterException, IOException{
	    StatusListener listener = new StatusListener(){
	        public void onStatus(Status status) {
	        	if(status.getLang().equals("en"))
	            System.out.println(status.getUser().getName()+ " : " + status.getText());
	        }
	        public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {}
	        public void onTrackLimitationNotice(int numberOfLimitedStatuses) {}
	        public void onException(Exception ex) {
	            ex.printStackTrace();
	        }
			@Override
			public void onScrubGeo(long arg0, long arg1) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onStallWarning(StallWarning arg0) {
				// TODO Auto-generated method stub
				
			}
	    };
	    ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("IJRiIUyYuw7k2asgZVM4GgJVC")
		  .setOAuthConsumerSecret("m9hEnUTP7jxFPUVHOVtCWWFFruxdg4g4IvVi43r7GkirGIUrm6")
		  .setOAuthAccessToken("2561380412-Nq6jtYoip5Lz6X5IQQLdQL8PluDwGZc3rXcMCFB")
		  .setOAuthAccessTokenSecret("yfnGLFNSQTVFtkmRDZkPX2QgqfuArV0ZXUq2wWXneSP5m");
	    TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
	    twitterStream.addListener(listener);
	    // sample() method internally creates a thread which manipulates TwitterStream and calls these adequate listener methods continuously.
	    twitterStream.sample();
	}
	
}
