package database.filtri;

public class FilterEsAlbPresLess extends Filter1ParParent implements Filtro {

	
	public FilterEsAlbPresLess(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsAlbPres < parametroFiltro) {
			return true;
		}
		return false;
	}
}
	

