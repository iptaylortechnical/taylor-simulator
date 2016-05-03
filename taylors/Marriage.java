package taylors;

import java.util.Random;

public class Marriage extends Child{
	
	private Child[] children;
	private int futureNumberOfChildren;
	private int currentNumberOfChildren;
	private Random rand;
	private boolean good = true;
	private int[] parents = new int[2];
	private int parent_count = 2;

	public Marriage(int age, boolean male){
		rand = new Random();
		futureNumberOfChildren = (2 + rand.nextInt(3));
		children = new Child[futureNumberOfChildren];
		
		if(male){
			parents[0] = age;
			parents[1] = age - rand.nextInt(4);
		}else{
			parents[0] = age;
			parents[1] = age + rand.nextInt(4);
		}
	}
	
	public Marriage(int currentNumberOfChildren, int futureNumberOfChildren, boolean good, boolean isMale, int parent_count, int[] parents, Child[] children){
		this.currentNumberOfChildren = currentNumberOfChildren;
		this.futureNumberOfChildren = futureNumberOfChildren;
		this.good = good;
		this.parent_count = parent_count;
		this.parents = parents;
		this.children = children;
	}
	
	
	
	
	public void addChild(Child child){
		if(currentNumberOfChildren < futureNumberOfChildren){
//			System.out.println(children.length);
//			System.out.println(futureNumberOfChildren);
			children[currentNumberOfChildren] = child;
			currentNumberOfChildren++;
		}
	}
	
	public boolean next(){
		
		for(int i = 0; i < currentNumberOfChildren; i++){
			
			if(children[i].next()){
				children[i] = new Marriage(children[i].getAge(), children[i].getIsMale());
			}
		}
		
		if(good){
			if(currentNumberOfChildren < futureNumberOfChildren){
				addChild(new Child());
			}else{
				good = false;
			}
		}
		
		if(parents[0] > 85 && parents[0] != 0){
			parent_count -= 1;
			parents[0] = 0;
		}else{
			parents[0]++;
		}
		
		if(parents[1] > 85 && parents[1] != 0){
			parent_count -= 1;
			parents[1] = 0;
		}else{
			parents[1]++;
		}
		
		return false;
	}
	
	public boolean getGood(){
		return good;
	}
	
	public int getWorth(){
		int total = 0;
		
		total += parent_count;
		
		for(int i = 0; i < currentNumberOfChildren; i++){
			total += children[i].getWorth();
		}
		
		return total;
	}
	
}
