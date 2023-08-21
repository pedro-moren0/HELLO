package ast;

import symbols.DataType;
import symbols.Identifier;

public class CmdWrite extends AbstractCommand{
	
	private Identifier id;
	private String text;
	
	public CmdWrite() {
		super();
	}
	
	public CmdWrite(Identifier id) {
		super();
		this.id = id;
	}
	

	public CmdWrite(String text) {
		super();
		this.text = text;
	}

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		return "printf("
				+ (id != null
					? "\"%" + DataType.getTargetTypePrintfChar(id.getType()) + "\"," + id.getText()
					: "\"%s\"," + text)
				+ ");\nprintf(\"\\n\");\n";
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
