package site;
import java.util.Comparator;
import java.util.TreeSet;

public class Hot {
	TreeSet<Upload> hottest;
	
	public Hot(){
		Comparator<Upload> r = new Comparator<Upload>() {

			@Override
			public int compare(Upload o1, Upload o2) {
				if(o1.likes < o2.likes){
					return -1;
				}
				
				if(o1.likes > o2.likes){
					return 1;
				}
				return 0;
			}
			
		};
		hottest = new TreeSet<Upload>(r);
	
	}

}
