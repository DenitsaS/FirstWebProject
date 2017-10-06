package site;

public interface IString {
	default boolean isStringValid(String s){
		if(!s.equals("") && s != null){
			return true;
		} else {
			return false;
		}
	}
}
