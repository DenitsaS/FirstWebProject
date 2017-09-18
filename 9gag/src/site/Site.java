package site;
import java.util.List;

public class Site {
	List<Upload> uploads;
	
	
	
	void saveUpload(Upload u){
		uploads.add(u);
	}
	
	void search(String s){
		if(s != null && !s.equals("")){
			//...
		}
	}
	
	
}
