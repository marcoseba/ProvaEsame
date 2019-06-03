package database.filtri;

public class FilterPaeseResIn extends FilterArreyStringParent implements Filtro {

	
	public FilterPaeseResIn(Object parametri) {
		super(parametri);
		
	}

	public boolean filter(Record record) {
		
		for(String param : parametri) {
			if(record.PaeseRes.equals(param)) {
				return true;
			}
		}
		return false;
	}
	
	
}
