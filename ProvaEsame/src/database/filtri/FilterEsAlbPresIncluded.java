package database.filtri;

public class FilterEsAlbPresIncluded extends Filter2ParParent implements Filtro  {
	
		
	public FilterEsAlbPresIncluded(Object parametro1, Object parametro2) {
		super(parametro1, parametro2);
	}

	public boolean filter(Record record) {
		
		if( record.EsAlbPres >= parametro1 & record.EsAlbPres <= parametro2) {
			return true;
		}
		return false;
	}
}
	