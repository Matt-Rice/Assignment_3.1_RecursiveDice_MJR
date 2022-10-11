
/**
 * Class that creates a recursive dice roll method and method to find avg amount of rolls to get a two
 * @author Matt Rice
 * @version 10/6/22
 * RecDieRoller
 * Fall 2022
 */
public class RecDieRoller {
	//Insance variables
	private int faceValue;//face value of the dice roll
	private double rolls;//amount of total dice rolls
	private int count;//The amount of rolls it takes to roll a two
	private double mean;//the average amount of rolls it takes to roll a 2
	
	/**
	 * Object that will be used to call the roll method, sets initial values
	 */
	public RecDieRoller(){
		faceValue=0;
		rolls=0;
		count=0;
	}
	
	/**
	 * Method to simulate rolling a six-sided die
	 * @return a random value from one to six (what face the die showed)
	 */
	public int roll() {
		count++;//the amount of time it takes to roll a two
		rolls++;//increases each time roll is called
		faceValue=(int)(Math.random()*(6-1))+1;//determines the value of the roll
		 
		if (faceValue==2) {
			 System.out.println(faceValue+"\nNumber of times rolled: " + count + "\nTotal number of times rolled: " + rolls);
			 count=0;//resets the count each time a two is rolled
			 return faceValue;
		 }//end if 
		 else {
			System.out.println(faceValue);
			return roll();//calls roll again if faceValue is not two
		 }//end else
	}//end roll
	
	/**
	 * Method to roll a certain number of times and return the mean of the amount of rolls to the amount of trials to find average amount of rolls it takes to roll a two
	 * @param trials the amount times the user wants to roll a two
	 * @return the average number of rolls it takes to roll a two
	 */
	public double meanRoll(int trials) {
		
		for(int i=0; i<trials;i++) {
			roll();//calls roll recursively trials time(s)
		}//end for
		mean=rolls/trials;//finds the mean of how many rolls it takes to get a two
		return mean;
	}//end meanRoll
	 
}//end RecDieRoller
	

