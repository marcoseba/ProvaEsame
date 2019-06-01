package database.cella;

public class EsAlbArr extends CellaParentsInt implements CellaInt {

	public EsAlbArr(int value) {
		super(value);
	}
	
	public EsAlbArr() {}
	
	public String toString() {
		return Integer.toString(value);
	}
}
