package expressions;

public class NumberExpression extends AbstractExpression{
	
	private int numberValue;
	
	public NumberExpression(int numberValue) {
		super();
		this.numberValue = numberValue;
	}
	

	public NumberExpression() {
		super();
	}
	

	public int getNumberValue() {
		return numberValue;
	}


	public void setNumberValue(int numberValue) {
		this.numberValue = numberValue;
	}
	
	public String toString(){
		return String.valueOf(numberValue);
	}

}
