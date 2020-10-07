package edu.uoc.pac2.strings;



public class PAC2Ex4 {

	public String reverseText(String text) {
		//TODO	
		
		if (text == null){             

		        return null;
		}
		
		String reverse = new StringBuffer(text).reverse().toString();
		return reverse;
		

	}
	
	public int countM(String text) {
		//TODO
		if (text == null){             

	        return 0;
	}
		int count = 0;
		char someChar = 'm';
		char someChar2 = 'M';
		
		for (int i = 0; i < text.length(); i++) {
		   
			if (text.charAt(i) == someChar || text.charAt(i) == someChar2 ) {
		     count++;
		    }
			
		}
		return count;
	}
	
	
	
	public String capitalize(String text, int index) {		
		//TODO
		
		if (index >= 1 && index < text.length()){ 
		
				String a = text.substring(0, index); 
				String r = text.substring(index, text.length()); 
				String s = a.toUpperCase();
				
				return s+r;
		}
	
		if (text == null){             

	        return null;
		}
		
		if (index <= 0){             

	        return text;
		}
		
		if (index >= text.length()) {
		
			return text.toUpperCase();
		
		}
		return text;  
		
	
	}

}
