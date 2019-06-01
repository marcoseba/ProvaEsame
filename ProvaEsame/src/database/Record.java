package database;

import database.cella.*;


public class Record {

	protected String ProvDest ;
	protected String RegGeoRes ;
	protected String PaeseRes ;
	
	protected CellaParentsInt dataIntArrey[] = new  CellaParentsInt[6];
	
	
	
	public Record(String provDest, String regGeoRes, String paeseRes, int esAlbArr, int esAlbPres, 
			      int esCompArr, int esCompPres, int totEsRicArr, int totEsRicPres) {
		
		ProvDest = provDest;
		RegGeoRes = regGeoRes;
		PaeseRes = paeseRes;
		
		dataIntArrey[0] =  new EsAlbArr(esAlbArr);
		dataIntArrey[1] =  new EsAlbPres(esAlbPres);
		dataIntArrey[2] =  new EsCompArr(esCompArr);
		dataIntArrey[3] =  new EsCompPres(esCompPres);
		dataIntArrey[4] =  new TotEsRicArr(totEsRicArr);
		dataIntArrey[5] =  new TotEsRicPres(totEsRicPres);
		
	}
	
	public void stampaDEB () {
		System.out.println(dataIntArrey[0]);
	}
}
