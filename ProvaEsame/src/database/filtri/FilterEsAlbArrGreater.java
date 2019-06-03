package database.filtri;

public class FilterEsAlbArrGreater extends Filter1ParParent implements Filtro {

	
	public FilterEsAlbArrGreater(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsAlbArr > parametroFiltro) {
			return true;
		}
		return false;
	}
}
