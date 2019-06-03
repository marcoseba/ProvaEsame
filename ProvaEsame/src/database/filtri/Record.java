package database.filtri;

public class Record {

	protected String ProvDest ;
	protected String RegGeoRes ;
	protected String PaeseRes ;
	protected int EsAlbArr;
	protected int EsAlbPres;
	protected int EsCompArr;
	protected int EsCompPres;
	protected int TotEsRicArr;
	protected int TotEsRicPres;


	public Record(String provDest, String regGeoRes, String paeseRes, int esAlbArr, int esAlbPres, int esCompArr,
			int esCompPres, int totEsRicArr, int totEsRicPres) {
		super();
		ProvDest = provDest;
		RegGeoRes = regGeoRes;
		PaeseRes = paeseRes;
		EsAlbArr = esAlbArr;
		EsAlbPres = esAlbPres;
		EsCompArr = esCompArr;
		EsCompPres = esCompPres;
		TotEsRicArr = totEsRicArr;
		TotEsRicPres = totEsRicPres;
	}
	
	public int getIntbyField(String field) {
		
		switch(field) {
		case "EsAlbArr":
			return EsAlbArr;
			
		case "EsAlbPres":
			return EsAlbPres;

		case "EsCompArr":
			return EsCompArr;
			
		case "EsCompPres":
			return EsCompPres;
		
		case "TotEsRicArr":
			return TotEsRicArr;
			
		case "TotEsRicPres:":
			return TotEsRicArr;
		
		default:
			return -1; //errore
		}
		
	}

	public String toString() {
		
		String ret = new String("\nProvDest: "+this.ProvDest+"\nRegGeoRes: "+this.RegGeoRes+
				                "\nPaeseRes: "+this.PaeseRes+"\nEsAlbArr: "+this.EsAlbArr+
				                "\nEsAlbPres: "+this.EsAlbPres+"\nEsCompArr: "+this.EsCompArr+
				                "\nEsCompPres: "+this.EsCompPres+"\nTotEsRicArr: "+this.TotEsRicArr+
				                "\nTotEsRicPres: "+this.TotEsRicPres);
		
		return ret;
	}
		
	
}