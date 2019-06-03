package database.filtri;

public class FilterProvDestNin extends FilterArreyStringParent implements Filtro {

	
	public FilterProvDestNin(Object parametri) {
		super(parametri);
		
	}

	public boolean filter(Record record) {
		
		for(String param : parametri) {
			if(record.ProvDest.equals(param)) {
				return false;
			}
		}
		return true;
	}
	
	
}
