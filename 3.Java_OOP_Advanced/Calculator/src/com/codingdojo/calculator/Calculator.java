package com.codingdojo.calculator;

@SuppressWarnings("serial")
class Calculator implements java.io.Serializable, CalculatorInterface {

	private double operand1;
	private double operand2;

	private String operation;
	private double result;

	public Calculator() {}

//////////////////////////////////////////////////
	public void setOperandOne(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperandOne() {
		return operand1;
	}


	public void setOperandTwo(double operand2) {
		this.operand2 = operand2;
	}
	public double getOperandTwo() {
		return operand2;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation() {
		return operation;
	}


// INTERFACE IMPLEMENTATION ////////////////////////////////////////
	public double performOperation(double operand1, double operand2, String operation) {
		setOperandOne(operand1);
		setOperandTwo(operand2);
		setOperation(operation);

		if(operation == "-") {
			result = operand1 - operand2;
			return result;
		} else {
			result = operand1 + operand2;
			return result;
		}

	}

	public void getResults() {
		System.out.println("The total is " + result);
	}

}