package site;
import java.util.ArrayList;
import java.util.List;

import users.User;

public class Site implements IString{
	List<Upload> uploads;
	List<User> users;
	
	public Site(){
		uploads = new ArrayList<>();
		users = new ArrayList<>();
	}
	
	
	void saveUpload(Upload u){
		uploads.add(u);
	}
	
	void search(String s){
		if(isStringValid(s)){
			
		}
	}
	
	
}
