package database.filtri;

public class FilterEsAlbArrIncluded implements Filtro {
	
	
	FilterEsAlbArrGreater filtroGreater = new FilterEsAlbArrGreater(0);
	FilterEsAlbArrLess filtroLess = new FilterEsAlbArrLess(0);
	
	public FilterEsAlbArrIncluded(int parametroFiltro1, int parametroFiltro2){
		
		filtroGreater.setParametroFiltro(parametroFiltro1);
		filtroLess.setParametroFiltro(parametroFiltro2);
	}
	
	public void setParametroFiltro1(int parametro1) {
		filtroGreater.setParametroFiltro(parametro1);
	}
	public void setParametroFiltro2(int parametro2) {
		filtroLess.setParametroFiltro(parametro2);
	}
	

	public boolean filter(Record record) {
		
		if(filtroGreater.filter(record) & filtroLess.filter(record)) {
			return true;
		}
		return false;
	}
}
	