package database.filtri;

public class FilterEsAlbArrIncluded extends Filter2ParParent implements Filtro  {
	
		
	public FilterEsAlbArrIncluded(Object parametro1, Object parametro2) {
		super(parametro1, parametro2);
	}

	public boolean filter(Record record) {
		
		if( record.EsAlbArr >= parametro1 & record.EsAlbArr <= parametro2) {
			return true;
		}
		return false;
	}
}
	