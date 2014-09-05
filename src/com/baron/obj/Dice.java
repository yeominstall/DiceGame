package com.baron.obj;

public class Dice {
	int value;
	
	int enroll( ){
		return ( int )( Math.random() * 6 ) + 1;
	}
}

class FraudDice extends Dice {
	
}