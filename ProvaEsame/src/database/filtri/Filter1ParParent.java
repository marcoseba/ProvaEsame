package database.filtri;

public class Filter1ParParent {

	int parametroFiltro;
	
	public Filter1ParParent(Object parametroFiltro){
		
		if(parametroFiltro instanceof Integer ) { //implementare gestione errori
			this.parametroFiltro =(Integer)parametroFiltro;
			}
	}
	
	public void setParametroFiltro(int parametro) {
		parametroFiltro = parametro;
	}
	
	public void setParametroFiltro(Object parametro) {
		
		if(parametro instanceof Integer ) { //implementare gestione errori
			parametroFiltro = (Integer)parametro;
		}
	}
	
	public int getParametroFiltro() {
		return parametroFiltro;
	}
}
