package com.logics;

public class EvalRomanNumerals extends AbstractRomanNumerals {
	
	@Override
	public Integer evaluateRomanValue(String romanValue) throws Exception{
		// TODO Auto-generated method stub
		String convUpperCase = romanValue.toUpperCase();
		int resultValue = 0;
		int currentValue = 0;
		int prevValue = 0;
		char currentChar = ' ' ;
		char prevChar = ' ';
		
		if( romanValue == null || "".equals(romanValue) )
			throw new NullPointerException("argument value should not be null or empty");
		
		char[] romanChars = convUpperCase.toCharArray();
		
		for(int i = romanChars.length - 1; i >= 0; i--){
			currentChar = romanChars[i];
			currentValue = evaluateCharacter(currentChar);
			
			if(i==0 || prevChar == ' ')
				prevValue = 0;
			else
				prevValue = evaluateCharacter(prevChar);
			
			if(currentValue >= prevValue )
				resultValue += currentValue;
			else
				resultValue -= currentValue;
			
			prevChar = currentChar;
		}
		
		
		return resultValue;
	}

}
