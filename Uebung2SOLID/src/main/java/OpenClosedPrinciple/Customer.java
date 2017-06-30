package OpenClosedPrinciple;

import java.io.IOException;

public class Customer {
	
	private String name;
	
	public Customer() {
		this.setName(name);
	}	
	
	/*
	 * The method "save" must be modified if a new save type is required.
	 * That means: A new requirement is resulting in a modification of existing code.
	 * The Open Closed Principle is violated.
	 */	
	public String save(String s, int saveType) throws IOException  
    {   
		if (saveType == 1) {
			FileStorage storage = new FileStorage(s);
			return storage.save(s);        
		}
		if (saveType == 2) {
			XMLStorage storage = new XMLStorage(s);
			return storage.save(s);        
		} else {			
			return "Unknown save type!";
		}
		
    }  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
