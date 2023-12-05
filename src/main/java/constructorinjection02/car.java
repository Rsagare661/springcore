package constructorinjection02;

import java.util.List;
import java.util.Set;

public class car {
    private String companyname;
    private Set<String> carname;
    private List<String> price;
    
    public car(String companyname,Set<String> carname,List<String> price) {
    	this.companyname=companyname;
    	this.carname=carname;
    	this.price=price;  	
  }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.companyname+"{"+this.carname+"} {"+this.price+"}" ;
	}

	
	
	}

