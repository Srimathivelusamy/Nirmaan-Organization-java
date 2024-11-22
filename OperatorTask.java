package day1;

public class OperatorTask {
	public static void main(String args[])
	{
		int firstNum = 12;
		int secondNum = 25;
		int thirdNum = 10;
		int fourthNum = 50;
		int fifthNum = 5;
		int sixthNum = 100;
		
		System.out.println("Arthmeic Operators:");
		int addition  = firstNum + secondNum;
		int subtraction  = firstNum - secondNum;
		int multiplication = firstNum * secondNum;
		int division = firstNum / secondNum;
		int modulus = firstNum % secondNum;
		System.out.println("Addition : " +addition);
		System.out.println("Subtraction : " +subtraction);
		System.out.println("Multiplication : " +multiplication);
		System.out.println("Division : " +division);
		System.out.println("Modulus : " +modulus);
		
		System.out.println("Relational Operators:");
		
		
	boolean greaterThen = firstNum < secondNum;
	boolean smallerThen = firstNum > secondNum;
	boolean greaterthenOrequalto  = firstNum <= secondNum;
	boolean smallerthenOrequalto = firstNum >= secondNum;
	boolean equalTo = firstNum == secondNum;
	boolean notEqualto = firstNum != secondNum;
	System.out.println("12 < 25 : " +greaterThen);
	System.out.println("12 > 25 :" +smallerThen);
	System.out.println("12 >= 25 : " +greaterthenOrequalto);
	System.out.println("12 <= 25 : " +smallerthenOrequalto);
	System.out.println("12 == 25 : " +equalTo);
	System.out.println("12 != 25 : " +notEqualto);
	
	System.out.println("Logical Operators:");
	
	boolean logicalOperatorAnd = (firstNum > thirdNum )&&(secondNum > fourthNum);
	boolean logicalOperatorOr = (firstNum < fifthNum)||(secondNum > sixthNum);
	System.out.println("12 > 10 AND 25 > 100 : " +logicalOperatorAnd);
	System.out.println("12 < 5 OR 25 > 100 : " +logicalOperatorOr);
	
	}

}