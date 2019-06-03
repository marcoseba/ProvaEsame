package database.filtri;

public class FilterEsAlbPresGreater extends Filter1ParParent implements Filtro {

	
	public FilterEsAlbPresGreater(Object parametroFiltro) {
		super(parametroFiltro);
	}

	public boolean filter(Record record) {
		
		if(record.EsAlbPres > parametroFiltro) {
			return true;
		}
		return false;
	}
}
