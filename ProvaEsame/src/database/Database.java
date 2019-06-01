package database;

import database.cella.*;


import java.util.ArrayList;

public class Database {
	
	private ArrayList<Record> dati = new ArrayList<>();

	
	//constructor
	public Database(ArrayList<Record> dati) {
		this.dati = dati;
	}
	
	public ArrayList<Record> getAllData() {return dati;}
	
	//--------Conditional Filter-------------------
	
	public ArrayList<Record> filterGreater(String field,int val) throws ClassNotFoundException{
		
		ArrayList<Record> risFilter = new ArrayList<>(); 
				
		for(Record c : dati ) { //scorre il database
			
			for(CellaParentsInt cella : c.dataIntArrey) {
				
				Class prova = Class.forName(field);
				
				if(Class.forName(field).isInstance(cella)) {
					
					if(cella.getValue() > val) {
						
						risFilter.add(c);
					}
				}
			}
			
		}
		
		return risFilter;
	}

}
