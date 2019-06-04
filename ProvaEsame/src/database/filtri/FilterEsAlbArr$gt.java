package database.filtri;

public class FilterEsAlbArr$gt extends Filter1ParParent implements Filtro {

	
	public FilterEsAlbArr$gt(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsAlbArr > parametroFiltro) {
			return true;
		}
		return false;
	}
}
