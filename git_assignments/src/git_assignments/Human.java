package git_assignments;
import java.util.Scanner;


public class Human
{
	private int age;
	private int weight;

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int answerA, answerW;
		
		Human h1 = new Human();
		Human h2 = new Human(30,80); //im not using this human
		
		System.out.println("Hello fellow human, I want to know some information about you.");
		
		System.out.println("Age? ");
		answerA = in.nextInt();
		System.out.println("Weights? ");
		answerW = in.nextInt();
		
		h1.setWeight(answerW);
		h1.setAge(answerA);
		
		h1.ourStats();
	
	}
	
	public Human() 
	{
		
	}
	public Human(int newAge, int newWeight) 
	{
		age = newAge;
		weight = newWeight;
	}
	
	
	public void ourStats() 
	{
		
		System.out.println("Your age is: "+getAge());
		System.out.println("Y:Your weight is: "+getWeight());
		
		ageCheck();
		weightCheck();
	}
	
	public void ageCheck() 
	{
		if(age >= 70) 
		{
			System.out.println("You are old");
		}
		else 
		{
			System.out.println("You are not old");
		}
	}
	public void weightCheck()
	{
		if(weight >= 120) 
		{
			System.out.println("You are obsese");
		}
		else 
		{
			System.out.println("You are not obese");
		}
		
	}
	
	
	
	public void setAge(int newAge) 
	{
		age = newAge;
	}
	public int getAge() 
	{
		return age;
	}
	public void setWeight(int newWeight) 
	{
		weight = newWeight;
	}
	public int getWeight() 
	{
		return weight;
	}
	
	
	
}
