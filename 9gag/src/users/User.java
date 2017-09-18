package users;

import java.util.List;
import java.util.TreeMap;

import site.Upload;

public class User extends ContactInfo {
	private String notifications; //?
	private Profile myProfile;
	private TreeMap<String, List<Upload>> pesonalInfo;
	
	public User() {
		
	}
}
