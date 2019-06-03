package database.filtri;

public class Filter2ParParent {

	public int parametro1;
	public int parametro2;
	
	public Filter2ParParent(Object parametro1,Object parametro2){
		
		if(parametro1 instanceof Integer ) { //implementare gestione errori
			this.parametro1 =(Integer)parametro1;
			}
		
		if(parametro2 instanceof Integer ) { //implementare gestione errori
			this.parametro2 =(Integer)parametro2;
			}
	}
	
	public void setParametroFiltro1(Object parametro) {
		
		if(parametro instanceof Integer ) { //implementare gestione errori
			parametro1 = (Integer)parametro;
		}
	}
	
	public void setParametroFiltro2(Object parametro) {
		
		if(parametro instanceof Integer ) { //implementare gestione errori
			parametro2 = (Integer)parametro;
		}
	}


}
