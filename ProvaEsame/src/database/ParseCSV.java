package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import database.filtri.*;


public class ParseCSV {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
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
	    //for(Record r: records) System.out.println(r.getIntbyField("EsAlbArr"));
	    
	    Database DB = new Database(records);
	    ArrayList<Record> recordsFilter = new ArrayList<>();
	    
	    Filtro filtro; //riferimeto a interfaccia filtro
	    
	    /*
	    //dichiarazione e inizializzazione del filtro
	    filtro = new FilterEsAlbArrGreater(1000);
	    recordsFilter = DB.runFilter(filtro); //elaborazione dati
	    System.out.println("------------------FILTRO maggiore ------------------------------");
	    for(Record r: recordsFilter) System.out.println(r);
		
	    
	    filtro = new FilterEsAlbArrIncluded(200,400);
	    recordsFilter = DB.runFilter(filtro); //elaborazione dati
	    System.out.println("------------------FILTRO compreso ------------------------------");
	    for(Record r: recordsFilter) System.out.println(r.getIntbyField("EsAlbArr"));
	 
	    
	    String[] param = new String[2];
	    param[0] = "Roma";
	    param[1] = "Viterbo";
	    filtro = new FilterProvDestIn(param);
	    recordsFilter = DB.runFilter(filtro); //elaborazione dati
	    System.out.println("------------------FILTRO In prov dest ------------------------------");
	    for(Record r: recordsFilter) System.out.println(r.toString());
	    
	    param[0] = "Roma";
	    param[1] = "Viterbo";
	    filtro = new FilterProvDestNin(param);
	    recordsFilter = DB.runFilter(filtro); //elaborazione dati
	    System.out.println("------------------FILTRO Nin prov dest ------------------------------");
	    for(Record r: recordsFilter) System.out.println(r.toString());
	    
	    param[0] = "Australia";
	    //param[1] = "Viterbo";
	    filtro = new FilterPaeseResIn(param);
	    recordsFilter = DB.runFilter(filtro); //elaborazione dati
	    System.out.println("------------------FILTRO In Paese Residenza ------------------------------");
	    for(Record r: recordsFilter) System.out.println(r.toString());
	    
	    */
	    //-------------------------------------------------------------------------------
	    
	    String percorso = "database.filtri.";
	    String nomeFiltro = "FilterEsCompArrLess";  //INSERIRE NOME FILTRO 
	    
	    String nomeCompleto = percorso.concat(nomeFiltro);
	    
	    Class<?> cls = Class.forName(nomeCompleto); //seleziono la classe
	    
        Constructor ct = cls.getDeclaredConstructor(Object.class); //seleziono il costruttore
        //System.out.println(ct.getName());
        
        filtro =(Filtro)ct.newInstance(10);  //istanzo oggetto filtro
        
        recordsFilter = DB.runFilter(filtro); //elaborazione dati con filtro selezionato
	    System.out.println("\n---------------------FILTRO istanza dinamica ------------------");
	    System.out.println("FILTRO Selezionato: "+nomeFiltro);
	    for(Record r: recordsFilter) System.out.println(r); //stampa dati filtrati
	    
	    System.out.println("------------------FINE ------------------------------");
	 
	    GestoreFiltri gf = new GestoreFiltri();
	    
	    String[] param = new String[2];
	    param[0] = "Roma";
	    param[1] = "Viterbo";
	    
	    filtro = gf.instanceFilter("FilterProvDestIn", 10);
        recordsFilter = DB.runFilter(filtro); //elaborazione dati con filtro selezionato
	    System.out.println("\n---------------------FILTRO istanza dinamica 2 ------------------");
	    for(Record r: recordsFilter) System.out.println(r); //stampa dati filtrati
	    
	}

	
	
}