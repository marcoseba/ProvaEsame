package database.filtri;

public class FilterPaeseResNin extends FilterArreyStringParent implements Filtro {

	
	public FilterPaeseResNin(Object parametri) {
		super(parametri);
		
	}

	public boolean filter(Record record) {
		
		for(String param : parametri) {
			if(record.PaeseRes.equals(param)) {
				return false;
			}
		}
		return true;
	}
	
	
}