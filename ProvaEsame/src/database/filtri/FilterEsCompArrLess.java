package database.filtri;

public class FilterEsCompArrLess extends Filter1ParParent implements Filtro {

	
	public FilterEsCompArrLess(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsCompArr < parametroFiltro) {
			return true;
		}
		return false;
	}
}
	

