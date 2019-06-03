package database.filtri;

public class FilterEsAlbArrLess extends Filter1ParParent implements Filtro {

	
	public FilterEsAlbArrLess(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsAlbArr < parametroFiltro) {
			return true;
		}
		return false;
	}
}
	

