package me.tedzhang.demo.designpattern.behavioral.interpreter;

/**
 * To implement interpreter pattern, we need to create Interpreter context
 * engine that will do the interpretation work and then we need to create
 * different Expression implementations that will consume the functionalities
 * provided by the interpreter context. Finally we need to create the client
 * that will take the input from user and decide which Expression to use and
 * then generate output for the user.
 * 
 * 1. Interpreter pattern can be used when we can create a syntax tree for the grammar we have.
 * 2. Interpreter pattern requires a lot of error checking and a lot of expressions and code to 
 * evaluate them, it gets complicated when the grammar becomes more complicated and hence hard 
 * to maintain and provide efficiency.
 * 
 * @author skuld1012
 *
 */
public class InterpreterPatternMain {

	public static void main(String[] args) {
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";

		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1 + "= " + ec.interpret(str1));
		System.out.println(str2 + "= " + ec.interpret(str2));
	}

}
