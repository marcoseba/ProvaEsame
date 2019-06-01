package database;

import java.util.ArrayList;

import database.filtri.Filtro;
import database.filtri.Record;

public class Database {
	
	private ArrayList<Record> dati = new ArrayList<>();

	
	//constructor
	public Database(ArrayList<Record> dati) {
		this.dati = dati;
	}
	
	public ArrayList<Record> getAllData() {return dati;}
	
	public ArrayList<Record> runFilter(Filtro filtro) {
		
		ArrayList<Record> risFilter = new ArrayList<>(); 
		
		for(Record c : dati ) {
			
			if(filtro.filter(c))
				risFilter.add(c);
			}
				
		return risFilter;
	}

}
