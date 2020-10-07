package cse360assignment02;

public class AddingMachine {
	
	private int total;
	private String history;
	  
	  public AddingMachine () { //initialize total and history 
	    total = 0;  
	    history = "0";
	  }
	  
	  public int getTotal () { //returns total
	    return total;
	  }
	  
	  public void add (int value) { //adds value to total; adds a new line to history
		  total = total + value;
		  history = history + " + " + value;
	  }

	  public void subtract (int value) { //subtracts value from total; adds a new line to history
		  total = total - value;
		  history = history + " - " + value;
	  }

	  public String toString () { //returns the complete history of transactions
	    return history;
	  }

	  public void clear() { //clears total to zero and history to zero
		  total = 0;
		  history = "0";
	  }
}
