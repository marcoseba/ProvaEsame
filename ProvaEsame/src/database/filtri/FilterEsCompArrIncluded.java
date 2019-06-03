package database.filtri;

public class FilterEsCompArrIncluded  extends Filter2ParParent implements Filtro  {
	
		
	public FilterEsCompArrIncluded(Object parametro1, Object parametro2) {
		super(parametro1, parametro2);
	}

	public boolean filter(Record record) {
		
		if( record.EsCompArr >= parametro1 & record.EsCompArr <= parametro2) {
			return true;
		}
		return false;
	}
}
	