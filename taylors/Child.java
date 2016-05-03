package taylors;

import java.util.Random;

public class Child {
	
	private int age;
	private int ageOfMarriage;
	private Random rand;
	private boolean isMale;
	
	public Child(){
		rand = new Random();
		
		isMale = (rand.nextInt(1) == 1) ? true : false;
		age = 0;
		ageOfMarriage = (19 + rand.nextInt(7));
	}
	
	
	public Child(int age, boolean isMale){
		this.age = age;
		this.isMale = isMale;
		
		if(age < 40){
			rand = new Random();
			ageOfMarriage = (19 + rand.nextInt(7));
		}else{
			ageOfMarriage = 0;
		}
	}
	
	
	public boolean next(){
		boolean ready = false;
		
		age++;
		
		if(age == ageOfMarriage){
			ready = true;
		}
		
		return ready;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getWorth(){
		return 1;
	}
	
	public boolean getIsMale(){
		return isMale;
	}
}
