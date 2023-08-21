package symbols;

public enum DataType implements ToTargetType {
	INTEGER("int"),
	REAL("float");

	String targetType;
	
	DataType(String targetType) {
		// TODO Auto-generated constructor stub
		this.targetType = targetType;
	}
	
	public String getTargetType() {
		return this.targetType;
	}
	
	public static String getTargetTypePrintfChar(DataType type) {
		switch (type) {
			case INTEGER:
				return "d";
			case REAL:
				return "f";
			default:
				throw new IllegalArgumentException(
						"Argument value " + type.toString() + " is not a valid DataType");
		}
	}
}
