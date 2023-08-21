package symbols;

import java.util.HashMap;

public class SymbolTable {
	
	private HashMap<String, Identifier> symbols;
	
	public SymbolTable() {
		this.symbols = new HashMap<String, Identifier>();
	}	
	
	public Identifier get(String key) {
		return this.symbols.get(key);
	}
	
	public void add(String key, Identifier id) {
		this.symbols.put(key, id);
	}
	
	public boolean exists(String key) {
		return this.symbols.containsKey(key);
	}

	public HashMap<String, Identifier> getSymbols() {
		return symbols;
	}

	public void setSymbols(HashMap<String, Identifier> symbols) {
		this.symbols = symbols;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		symbols.forEach((k, v) -> {
			strBuilder.append(k.toString());
			strBuilder.append(" = ");
			strBuilder.append(v.toString());
			strBuilder.append("\n");
		});
		return strBuilder.toString();
	}
}
