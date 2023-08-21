package expressions;

public class NumberDecimalExpression extends AbstractExpression{
	
	private float numberValue;
	
	public NumberDecimalExpression(float numberValue) {
		super();
		this.numberValue = numberValue;
	}
	

	public NumberDecimalExpression() {
		super();
	}
	

	public float NumberDecimalExpression() {
		return numberValue;
	}


	public void setNumberDecimalValue(float numberValue) {
		this.numberValue = numberValue;
	}
	
	
	public String toString(){
		return String.valueOf(numberValue);
	}

}
