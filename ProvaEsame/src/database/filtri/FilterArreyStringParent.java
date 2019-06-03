package database.filtri;

public class FilterArreyStringParent {

	public String[] parametri;

	
	public FilterArreyStringParent(Object parametri) {
		
		if(parametri instanceof String[] ) {
			this.parametri = (String[])parametri;
		}
	}
	
	
	public void SetParametriFiltro(Object parametri) {
		
		if(parametri instanceof String[] ) {
			this.parametri = (String[])parametri;
		}
	
	}
	
}
