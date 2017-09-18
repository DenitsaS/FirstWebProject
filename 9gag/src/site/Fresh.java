package site;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Fresh {

	TreeSet<Upload> freshest;
	
	public Fresh(){
		Comparator<Upload> r = new Comparator<Upload>() {

			@Override
			public int compare(Upload o1, Upload o2) {
				return o1.date.compareTo(o2.date);
			}
			
		};
		freshest = new TreeSet<Upload>(r);
	
	}
	

}
