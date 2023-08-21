package expressions;

public class UnaryExpression extends AbstractExpression {
	
	private String operator;
	private AbstractExpression rightSide;

	
	public UnaryExpression() {
		super();
	}
	
	public UnaryExpression(String operator) {
		super();
		this.setOperator(operator);
	}
	
	public UnaryExpression(String operator, AbstractExpression rightSide) {
		super();
		this.setOperator(operator);
		this.setRightSide(rightSide);
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public AbstractExpression getRightSide() {
		return rightSide;
	}

	public void setRightSide(AbstractExpression rightSide) {
		this.rightSide = rightSide;
	}
	
	@Override
	public String toString() {
		return operator + rightSide.toString();
	}
}
