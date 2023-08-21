package expressions;

public class ParenthesisExpression extends AbstractExpression {
	
	private AbstractExpression expr;
	
	public ParenthesisExpression() { }
	
	public ParenthesisExpression(AbstractExpression expr) {
		this.expr = expr;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "(" + expr.toString() + ")";
	}
}
