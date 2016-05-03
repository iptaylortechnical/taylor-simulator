//This is a Taylor family simulation. 


package taylors;

public class MainClass {
	public static int tot = 0;
	int year;
	int fin;
	
	Marriage mar = new Marriage(10, 10, false, true, 2, new int[]{84, 98}, new Child[]{
			//Peter
			new Marriage(3, 3, false, true, 2, new int[]{70,71}, new Marriage[]{
					
					new Marriage(5, 5, false, true, 2, new int[]{38, 40}, new Child[]{
							new Child(18, false), new Child(16, true), new Child(14, false), new Child(9, false), new Child(8, false)
					}),
					new Marriage(6, 6, false, true, 2, new int[]{42, 46}, new Child[]{
							new Child(20, true), new Child(19, false), new Child(17, true), new Child(15, true), new Child(12, false), new Child(9, true)
					}),
					new Marriage(4, 4, false, true, 2, new int[]{37, 33}, new Child[]{
							new Child(7, true), new Child(6, true), new Child(4, false), new Child(3, false)
					})
					
			}),
			//Janet
			new Child(67, false), 
			new Marriage(5, 5, false, true, 2, new int[]{64, 64}, new Child[]{
				
					new Marriage(5, 5, false, true, 2, new int[]{39, 39}, new Child[]{
							new Child(15, false), new Child(12, false), new Child(11, false), new Child(8, true), new Child(5, false)
					}),
					new Marriage(3, 3, false, false, 2, new int[]{38, 37}, new Child[]{
							new Child(8, true), new Child(6, false), new Child(4, true)
					}),
					new Marriage(1, 3, true, false, 2, new int[]{35, 34}, new Child[]{
							new Child(6, true), new Child(1, true), null, null
					}),
					new Marriage(3, 3, true, false, 2, new int[]{33, 37}, new Child[]{
							new Child(8, false), new Child(6, true), new Child(3, false)
					}),
					new Marriage(1, 4, true, true, 2, new int[]{30, 30}, new Child[]{
							new Child(1, false), null, null, null
					})
					
			}),
			//Cynthia
			new Marriage(2, 2, false, false, 2, new int[]{63, 64}, new Child[]{
					new Marriage(2, 4, true, true, 2, new int[]{28, 28}, new Child[]{
							new Child(2, false), new Child(4, true), null, null
					}), new Child(26, true)
			}), 
			//Becky
			new Marriage(1, 1, false, false, 1, new int[]{73, 100}, new Child[]{
					
					new Marriage(2, 2, false, false, 2, new int[]{43, 43}, new Child[]{
							new Child(15, true), new Child(12, true)
					})
					
			}), 
			//Gretchen
			new Marriage(4, 4, false, false, 2, new int[]{61, 61}, new Child[]{
					
					new Marriage(4, 4, false, false, 2, new int[]{38,38}, new Child[]{
							new Child(9, true), new Child(7, false), new Child(5, false), new Child(3, true)
					}),
					new Marriage(2, 3, true, false, 2, new int[]{35, 35}, new Child[]{
							new Child(1, true), new Child(4, false), null
					}),
					new Marriage(2, 3, true, false, 2, new int[]{32, 34}, new Child[]{
							new Child(1, false), new Child(4, true), null
					}),
					new Marriage(0, 3, true, false, 2, new int[]{30, 32}, new Child[]{
							null, null, null
					})
					
			}), 
			//Mary Lee
			new Marriage(5, 5, false, false, 2, new int[]{60, 62}, new Child[]{
					new Marriage(5, 6, true, false, 2, new int[]{39, 40}, new Child[]{
							new Child(14, true), new Child(12, true), new Child(9, true), new Child(8, false), new Child(5, false), null
					}), 
					new Marriage(2, 4, true, true, 2, new int[]{33, 30}, new Child[]{
							new Child(8, true), new Child(3, false), null, null
					}),
					new Marriage(3, 3, false, true, 2, new int[]{34, 30}, new Child[]{
							new Child(8, true), new Child(7, true), new Child(1, true)
					}),
					new Marriage(5, 5, false, false, 2, new int[]{26, 28}, new Child[]{
							new Child(6, false), new Child(3, true), new Child(2, true), new Child(5, true), new Child(1, false)
					}),
					new Marriage(1, 5, true, true, 2, new int[]{23, 21}, new Child[]{
							new Child(1, true), null, null, null, null
					})
			}), 
			//Alison
			new Marriage(3, 3, false, false, 2, new int[]{59, 67}, new Child[]{
					new Child(41, false), new Child(31, true), new Marriage(2, 2, false, false, 2, new int[]{31, 31}, new Child[]{
							new Child(11, false), new Child(8, false)
					})
			}), 
			//John
			new Marriage(1, 1, false, true, 2, new int[]{72, 72}, new Child[]{
					new Marriage(3, 3, false, false, 2, new int[]{46, 46}, new Child[]{
							new Child(14, true), new Child(18, false), new Child(9, true)
					})
			}),
			//Marty
			new Marriage(4, 4, false, false, 2, new int[]{72, 70}, new Child[]{
				new Child(44, true), new Child(30, false), new Child(41, false), new Marriage(3, 3, false, false, 2, new int[]{49, 49}, new Child[]{
						new Child(19, true), new Child(17, false), new Child(14, false)
				})	
			})
			
	});
	
	public static void main(String[] args){
		GUI gui = new GUI();
		
		gui.setVisible(true);
	}
	
	public MainClass(int year){
		
		int years = year-2015;
		
		for(int i = 0; i < years; i++){
			mar.next();
		}
		
		tot = mar.getWorth();
		
	}
}
