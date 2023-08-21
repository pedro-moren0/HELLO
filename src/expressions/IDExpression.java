package expressions;

import symbols.Identifier;

public class IDExpression extends AbstractExpression{
	private String id;
	private int    value;
	
	public IDExpression() {	}
	
	public IDExpression(String id) {
		this.id = id;
	}
	
	public IDExpression(Identifier variable) {
		this.id = variable.getText();
		if (variable.getValue() != null) {
			this.value = variable.getValue();
		}
	}
	
	public String toString() {
		return this.id;
	}
}
