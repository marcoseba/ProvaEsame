package database.filtri;

public class FilterProvDestIn extends FilterArreyStringParent implements Filtro {

	
	public FilterProvDestIn(Object parametri) {
		super(parametri);
		
	}

	public boolean filter(Record record) {
		
		for(String param : parametri) {
			if(record.ProvDest.equals(param)) {
				return true;
			}
		}
		return false;
	}
	
	
}
