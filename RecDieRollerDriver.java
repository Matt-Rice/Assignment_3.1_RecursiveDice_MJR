/**
 * Class to test the methods from the RecDieRoller class
 * @author Matt Rice
 * @version 10/6/22
 * RecDieRollerDriver
 * Fall 2022
 */
public class RecDieRollerDriver {
		/**
		 * Main method to test the roll method and meanRoll method
		 * @param args
		 */
		public static void main(String[]args) {
			
			RecDieRoller dice=new RecDieRoller();//creates RecDieRoller object
			dice.roll();//calls the roll method outside of meanRoll
			
			System.out.println(dice.meanRoll(1000));//calls the roll method 1000 times
		}//end main
}//end RecDieRollerDriver
	