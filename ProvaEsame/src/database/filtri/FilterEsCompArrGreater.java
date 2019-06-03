package database.filtri;

public class FilterEsCompArrGreater extends Filter1ParParent implements Filtro {

	
	public FilterEsCompArrGreater(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsCompArr > parametroFiltro) {
			return true;
		}
		return false;
	}
}

