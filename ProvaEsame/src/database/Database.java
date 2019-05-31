package database;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<Record> dati = new ArrayList<>();

	
	//constructor
	public Database(ArrayList<Record> dati) {
		this.dati = dati;
	}
	
	public ArrayList<Record> getAllData() {return dati;}
	
	//Conditional Filter
	public ArrayList<Record> filterGreater(String field,int val){
		
		ArrayList<Record> risFilter = new ArrayList<>(); 
		
		for(Record c : dati ) {
			if(c.getIntbyField(field) > val) {
				risFilter.add(c);
			}
		}
		
		return risFilter;
	}

}
