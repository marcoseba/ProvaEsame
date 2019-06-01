package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ParseCSV {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		String csvFile = "/home/marcoseba/universita/programmazione/esame/dataset/dataset61.csv";
		BufferedReader br = null;                                     
		String line = "";
		ArrayList<Record> records = new ArrayList<>();
		
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));				
			while ((line = br.readLine()) != null) {	
				
				try {
			
			        // usa virgola e spazio come separatore
			        String[] recordCorrente = line.split(";");	
			 			        
			        // crea un oggetto di tipo Record
			        Record oggettoRecord = new Record(
			        							recordCorrente[0], 
			        							recordCorrente[1],
			        							recordCorrente[2],
												Integer.parseInt(recordCorrente[3]),
												Integer.parseInt(recordCorrente[4]),
												Integer.parseInt(recordCorrente[5]),
												Integer.parseInt(recordCorrente[6]),
												Integer.parseInt(recordCorrente[7]),
												Integer.parseInt(recordCorrente[8])						
					);
			        
			        records.add(oggettoRecord);
			        
				} catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				} catch(NumberFormatException e) {
					e.printStackTrace();
				} 
				
			} 
	    
	        try {
				br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
			
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		   // Stampa la lista di Record
	    for(Record r: records) {r.stampaDEB();}
	    
	    
	    Database DB = new Database(records);
	    ArrayList<Record> recordsFilter = new ArrayList<>();
	    
	    System.out.println("------------------FILTRO------------------------------");
	    
	    recordsFilter = DB.filterGreater("String", 10000);
	    
	    for(Record r: recordsFilter) {r.stampaDEB();}
		
	}

	
	
}