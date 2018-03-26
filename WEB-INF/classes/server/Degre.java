package server;

public enum Degre {


	PRIORITAIRE(3) ,
	SECONDAIRE(2),
	ANNEXE(1);
	
	private int value;
	
	Degre(int value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
