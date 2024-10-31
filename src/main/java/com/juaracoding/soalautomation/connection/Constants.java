package com.juaracoding.soalautomation.connection;

public class Constants {

	public static final int TIMEOUT = 15;
	public static final int TIMEOUT_DELAY = 3;
	public static final String GLOB_PARAM_DELAY = "y";
	public static final String CHROME = "Chrome";
	public static final String FIREFOX = "Firefox";
	public static final String EDGE = "Edge";
	public static final String OPERA = "Opera";
	public static final String IE = "IE";
	public static final String SAFARI = "Safari";

	public class UserData {
		private static String username;

		public static void setUsername(String user) {
			username = user;
		}

		public static String getUsername() {
			return username;
		}
	}
	public static final String URL_LOGIN = "https://www.demoblaze.com/";
}