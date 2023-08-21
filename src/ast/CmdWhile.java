package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdWhile extends AbstractCommand{

	private AbstractExpression expr;
	private List<AbstractCommand> commands;
	
	public CmdWhile() {
		super();
	}

	public CmdWhile(AbstractExpression expr) {
		super();
		this.expr = expr;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}


	public void setCommands(List<AbstractCommand> commands) {
		this.commands = commands;
	}

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for (AbstractCommand cmd: commands) {
			str.append(cmd.generateCode());
		}
		return "while (" + expr.toString()+ ") {\n "+ str.toString() + "}\n";
	}
	
}
