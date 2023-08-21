package ast;

import symbols.DataType;
import symbols.Identifier;

public class CmdRead extends AbstractCommand{
	
	private Identifier id;
	
	public CmdRead(Identifier id) {
		super();
		this.id = id;
	}
	public CmdRead() {
		super();
	}


	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		return "scanf(\"%" + DataType.getTargetTypePrintfChar(id.getType()) + "\",&" + id.getText() + ");\n";
	}

}
