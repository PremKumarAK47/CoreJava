package two.answer;

public class Lion {
	
	    String name;
	    Boolean isHungry;
	    int age;
	    static int totalDeaths;
	    
	    void thinking(String name,Boolean isHungry,int age)
	    {
	    	 if (!isHungry) 
	    	 {
	             System.out.println(name + " is sleeping");
	         } 
	    	 else if (age > 12) 
	    	 {
	             totalDeaths += 2;
	             System.out.println(name + " has eaten two animals");
	         } 
	    	 else if (age > 2 && age <= 12) 
	    	 {
	             totalDeaths += 1;
	             System.out.println(name + " has eaten one animal");
	         }
	    	 else 
	    	 {
	             System.out.println(name + " is calling Mom");
	         }
	    }
	    static void printKillings()
	    {
	        System.out.println("Total killings by lion in jungle = "+totalDeaths);
	    }
	    
	    
	    public static void main(String[] args) 
	    {
	        Lion l1= new Lion();
	        l1.thinking("lion 1",true,8);
	        Lion l2= new Lion();
	        l2.thinking("lion 2",true,23);
	        Lion l3= new Lion();
	        l3.thinking("lion 3",true,2);
	        printKillings();
	    }

}
