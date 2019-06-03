package database.filtri;

public class FilterOrCombiner implements Filtro{

	Filtro filter1;
	Filtro filter2;
	
	public FilterOrCombiner(Filtro filter1, Filtro filter2) {
		this.filter1 = filter1;
		this.filter2 = filter2;
	}
	
	public boolean filter(Record record) {
		
		if(filter1.filter(record) | filter2.filter(record)) {
			return true;
		}
		
		return false;
	}
	
}
