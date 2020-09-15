package utilities;

import java.security.SecureRandom;

public class RandomString {
	static final String AB01 = "abcdefghijklmnopqrstuvwxyz";
	static final String AB02 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	static SecureRandom rnd = new SecureRandom();

	public static String randomString( int len ){
	   StringBuilder sb = new StringBuilder( len );
	   for( int i = 0; i < len; i++ ) 
	      sb.append( AB01.charAt( rnd.nextInt(AB01.length()) ) );
	   return sb.toString();
	}
	


	public static String randomAlphaNum( int len ){
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB02.charAt( rnd.nextInt(AB02.length()) ) );
		   return sb.toString();
		}
}
