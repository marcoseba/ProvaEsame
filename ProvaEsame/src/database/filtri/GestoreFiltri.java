package database.filtri;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GestoreFiltri {

	private String percorso = "database.filtri.";
	
      
    public GestoreFiltri() {}  //constructor senza cambiare percorso
       
    public GestoreFiltri(String percorso) { //constructor con differente percorso
		this.percorso = percorso;
	}
    
    protected void changePackage(String path) {
    	this.percorso = path;
    }
    
    public Filtro instanceFilter(String name,Object parameters) 
    throws InstantiationException, IllegalAccessException, IllegalArgumentException, 
    InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
    	
	    Filtro filtro;
	    String FilterName = percorso.concat(name);
	    
	    Class<?> cls = Class.forName(FilterName); //seleziono la classe
	    
        Constructor ct = cls.getDeclaredConstructor(Object.class); //seleziono il costruttore
 
         filtro =(Filtro)ct.newInstance(parameters);  //instanzo oggetto filtro
        
        return filtro;
    }
    
}
