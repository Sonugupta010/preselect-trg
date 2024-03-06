/* Take values of length and breadth of a rectangle from user and check if it is square or not. */

class CheckSquareOrNot{
	public static void main(String [] args){
		int length = Integer.parseInt(args[0]);
        		int breadth = Integer.parseInt(args[1]);

		if(length == breadth){
			System.out.println("The given rectangle is square. ");
		}
		else{
			System.out.println("The given reactangle is not a square");
		}
	}
}

