package database.filtri;

public class FilterArreyStringParent {

	public String[] parametri;

	
	public FilterArreyStringParent(Object parametri) {
		
		if(parametri instanceof String[] ) {
			this.parametri = (String[])parametri;
			
		}else {throw new IllegalArgumentException("this filter accepted String array");}
		
	}
	
	
	public void SetParametriFiltro(Object parametri) {
		
		if(parametri instanceof String[] ) {
			this.parametri = (String[])parametri;
		}else {throw new IllegalArgumentException("this filter accepted String array");}
	
	}
	
}
