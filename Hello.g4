/**
 * Define a grammar called Hello
 */
grammar Hello;

@header{
	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	import java.util.HashMap;
	import java.util.Map;
	
}

@members{
	private SymbolTable symbolTable = new SymbolTable();
	private DataType currentType;
	private AbstractExpression expression;
	private String operator;
	private String unaryOperator;
	private DataType leftDT;
	private DataType rightDT;
	private String   idDeclarado, idAtribuido;
	private boolean isExprParenthesisOpened = false;
	private boolean condicaoEnquanto = false;
	private List<Identifier> declaredIds;
	private String   text;
	private Program  program = new Program();
	private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
	private Map<String, Boolean> mapaUsoVariaveis = new HashMap<>();
	private Map<String, Boolean> mapaVarsInicializadas = new HashMap<>();
	
	public void init(){
		program.setSymbolTable(symbolTable);
		stack.push(new ArrayList<AbstractCommand>());
	}
		
	public void exibirID(){
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void generateObjectCode(){
		program.generateTarget();
	}

}
programa  : 'programa' decl+ cmd+ 'fimprog.'
			{
				for (Map.Entry<String, Boolean> entry : mapaUsoVariaveis.entrySet()) {
					if(entry.getValue() == false){
    					System.out.println("A variavel: " + entry.getKey() + " não foi utilizada.");
					}
				}
				System.out.println();
				program.setComandos(stack.pop());
			}
		  ;
		  
decl	  : tipo lista_var PF {
	          Declaration _decl = new Declaration(declaredIds);
	          stack.peek().add(_decl);
            }
		  ;
		 
tipo	  : 'INTEGER' { currentType = DataType.INTEGER; }
          | 'REAL'    { currentType = DataType.REAL; }
          ;
         
lista_var : ID {
	          declaredIds = new ArrayList<>();
	          idDeclarado = _input.LT(-1).getText();
	          if (symbolTable.get(idDeclarado) != null) {
	          	throw new RuntimeException("Variable " + idDeclarado + " already has been declared");
	          }
	          mapaUsoVariaveis.put(idDeclarado,false);
	          mapaVarsInicializadas.put(idDeclarado, false);
	          symbolTable.add(idDeclarado, new Identifier(idDeclarado, currentType));
	          declaredIds.add(symbolTable.get(idDeclarado));
            } 
           (VIRG 
           	ID {
           	  idDeclarado = _input.LT(-1).getText();
           	  if (symbolTable.get(idDeclarado) != null) {
	          	throw new RuntimeException("Variable \"" + idDeclarado + "\" already has been declared");
	          }
	          mapaUsoVariaveis.put(idDeclarado,false);
	          mapaVarsInicializadas.put(idDeclarado, false);
	          symbolTable.add(idDeclarado, new Identifier(idDeclarado, currentType));
	          declaredIds.add(symbolTable.get(idDeclarado));
           	}
           )*
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile
		  ;

cmdWhile  : 'enquanto'{ 
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();
				CmdWhile _cmdWhile = new CmdWhile();
			}
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText());
			}
			expr {
				_relExpr.setRightSide(expression);
				_cmdWhile.setExpr(_relExpr);
				// limpando operadores para validacoes de comparacoes futuras
				leftDT = null;
				rightDT =null;
			}
			FP 'realize' cmd+ {
				_cmdWhile.setCommands(stack.pop());
			}
			'fimenquanto' PF{
				stack.peek().add(_cmdWhile);
			}
          ;

cmdIf     : 'se' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();
				CmdIf _cmdIf = new CmdIf();
			} 
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText());
			}
			expr {
				_relExpr.setRightSide(expression);
				_cmdIf.setExpr(_relExpr);
				// limpando operadores para validacoes de comparacoes futuras
				leftDT = null;
				rightDT =null;
			} FP 'entao'  cmd+  
			{
				_cmdIf.setListaTrue(stack.pop());
			}
			('senao' {
				stack.push(new ArrayList<AbstractCommand>());
			}
			cmd+ {
				_cmdIf.setListaFalse(stack.pop());
			})? 			
			'fimse' PF {
				stack.peek().add(_cmdIf);
			}		 
		  ; 
		  
cmdRead   : 'leia' AP ID {
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id == null){
					throw new RuntimeException("Undeclared Variable");
				}
				CmdRead _read = new CmdRead(id);
				stack.peek().add(_read);
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Undeclared Variable");	         		
	         	}
	         	CmdWrite _write = new CmdWrite(id);
	         	stack.peek().add(_write);
	         } 
	         | 
	         TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
             ) FP PF
          ;		      		  
   		  
cmdAttr   : ID {
				idAtribuido = _input.LT(-1).getText();
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
				}
				mapaVarsInicializadas.put(idAtribuido, true);
				leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				rightDT = null;
			}
         	ATTR expr PF
				{
					// logica para atribuir o valor da expressao no identificador
					Identifier id = symbolTable.get(idAtribuido);
					symbolTable.add(idAtribuido, id);
					CmdAttrib _attr = new CmdAttrib(id, expression);
					stack.peek().add(_attr);
					expression = null;
					leftDT = null;
					rightDT = null;
				}
		  ;

expr	  : termo exprl*
          ;
          
termo     : NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));

			}
		  |
		  DECIMAL_NUMBER{
		  	expression = new NumberDecimalExpression(Float.parseFloat(_input.LT(-1).getText()));
		  }
		  |
			ID {
			    // checks for existence in symbolTable; throws RuntimeError if not present
				if (!symbolTable.exists(_input.LT(-1).getText())){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
				}
				
				// checks for left-hand side and right-hand side type equality; throws if mismatch
				rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				//como a expressão é reusada, usamos o  if abaixo para atribuicao de tipo do lado esquerdo da expressao. Apos isso ele ira ler o valor do lado direito.
				if(leftDT == null){
					leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				};
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}		
				
				// checks for initialization; if initialized generate new NumberExpression, throws otherwise
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (mapaVarsInicializadas.get(id.getText())){ //nome - v se inicializado, false caso contrario
					mapaUsoVariaveis.put(id.getText(),true);
					expression = new IDExpression(id);
				}
				else{
					throw new RuntimeException("Semantic ERROR - Unassigned variable: " + id.getText());
				}
			}
		  | AP expr FP {
		  	  expression = new ParenthesisExpression(expression);
		    }
		  | (SUM | SUB) {
		  	  unaryOperator = _input.LT(-1).getText();
		    } expr {
		  	  expression = new UnaryExpression(unaryOperator, expression);
		    }
		  ;

exprl     : (SUM | SUB | MULT | DIV) { 
				operator = _input.LT(-1).getText();
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
			} 
			termo
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
			}
          ;		         

NUMBER	  : [0-9]+ 
		  ;
		  
DECIMAL_NUMBER	  : [0-9]+('.' [0-9]+)?
		  ;
		  
TEXT 	  : '"' (~["\\\r\n])* '"' // tudo entre aspas menos " \ \r \n
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;

MULT      : '*'
          ;

DIV       : '/'
          ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '!='
 		  ;          
   		  
ID		  : [a-z] ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	      
BLANK     : (' '| '\t' | '\n' | '\r') -> skip
          ;                                 		           		 		 