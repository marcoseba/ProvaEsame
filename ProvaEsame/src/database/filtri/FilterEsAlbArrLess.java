package database.filtri;

public class FilterEsAlbArrLess implements Filtro{

	int parametroFiltro;
	
	public FilterEsAlbArrLess(int parametroFiltro){
		this.parametroFiltro = parametroFiltro;
	}
	
	public void setParametroFiltro(int parametro) {
		parametroFiltro = parametro;
	}
	
	public boolean filter(Record record) {
		
		if(record.EsAlbArr < parametroFiltro) {
			return true;
		}
		return false;
	}
}
	

