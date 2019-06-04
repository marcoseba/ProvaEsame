package database.filtri;

public class Filter1ParParent {

	int parametroFiltro;
	
	public Filter1ParParent(Object parametroFiltro){
		
		if(parametroFiltro instanceof Integer ) { //implementare gestione errori
			
			this.parametroFiltro =(Integer)parametroFiltro;
		}else {throw new IllegalArgumentException("this filter accepted Integer ");} //TODO forse cambiare
	}
		
	
	public void setParametroFiltro(Object parametro) {
		
		if(parametro instanceof Integer ) { //implementare gestione errori
			
			parametroFiltro = (Integer)parametro;
		}else {throw new IllegalArgumentException("this filter accepted Integer ");} //TODO forse cambiare
	}
	
	public int getParametroFiltro() {
		return parametroFiltro;
	}
}
