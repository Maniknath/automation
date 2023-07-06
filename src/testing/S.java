package testing;

public class S {
	
	//String Handling
	String s = "Manik Nath is a good man";
	
	public void stringHndling(){
		int i = s.trim().length();
		
		System.out.println(i);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(8));
		
		System.out.println(s.length() - s.replace("t", "").length());
		
		String aa[] = s.split(" ");
		for(String a : aa){
			System.out.println(a);
		}
		
		
	
		
	}

}
