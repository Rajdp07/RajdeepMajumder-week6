package week6.CollectionFr;

import java.util.logging.Level;
import java.util.logging.Logger;

public class test extends App {
	public static void main(String args[]) {
		App ob = new App();
		int i;
		
		ob.add(99);     
		ob.add("MAJUMDER");     
		ob.add(59);       
		ob.add(20);     
		ob.add("RAJDEEP");    
		ob.add(50.5);    
		ob.add(7.3);
		ob.add(3);
		ob.add(70);
		ob.add(80);
		ob.add(90);
		Logger logger  = Logger.getLogger( test.class.getName());
		
	
		logger.log(Level.INFO,"logging: {0}",new Object[] {"CREATION AND INSERTION PHASE"});

		
		for(i=0;i<ob.len();i++)
		{
				
			logger.log(Level.INFO,"logging: {0}",new Object[] {ob.get(i).toString()});
		}
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {"RETRIEVAL PHASE:"});
		logger.log(Level.INFO,"logging: {0}",new Object[] {ob.get(1).toString()});
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {ob.get(5).toString()});
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {ob.get(9).toString()});
		
		ob.remove(1);
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {"REMOVAL PHASE"});
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {"AFTER REMOVAL:"});
		
		logger.log(Level.INFO,"logging: {0}",new Object[] {ob.get(1).toString()});
	}
	
}

