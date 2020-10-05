package cse360assignment02;

/**
* The Calculator allows users to add and subtract numbers 
*  while keeping a history of all actions
*
* @author  Gabriel Waegner
* @version 1.0
* @since   10/04/2020
*/


public class Calculator {
  private int total = 0;
  private String val = total + " ";
  
  public Calculator() {
    total = 0;// not needed - included for clarity		
  }
  
  public int getTotal () {
    /**
    * This method is set to return
    * the int total
    * @param none
    * @return int total
    */
    return total;
  }
  
  public void add (int value) {
    /**
    * This method will be set to add the imported
    *  value to our total and record it in the history
    * @param value, which will be added into our total
    * @return none
    */
	  val = val + "+ " + value + " ";
	  total = total + value;
	  return;
  }

  public void subtract (int value) {
    /**
    * This method will be set to subtract the imported
    *  value from our total and record it in the history
    * @param value, which will be added into our total
    * @return none
    */
	  val = val + "- " + value + " ";
	  total = total - value;
	  return;
  }

  public String toString () {
    /**
    * This method will be our print statement which will
    *  return the total and the history of interactions
    * @param none
    * @return string that contains our total and the history
    *  of interactions
    */
    return val + "\nTotal: " + getTotal();
  }

  public void clear() {
    /**
    * This method will revert our total back to 0 and
    * clear the history of all previous interactions
    * @param none
    * @return none
    */
	  val = 0 + " ";
	  total = 0;
  }
}
