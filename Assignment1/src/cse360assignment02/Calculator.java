package cse360assignment02;

public class Calculator {
  private int total = 0;
  private String val = total + " ";
  
  public Calculator() {
    total = 0;// not needed - included for clarity		
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  val = val + "+ " + value + " ";
	  total = total + value;
	  return;
  }

  public void subtract (int value) {
	  val = val + "- " + value + " ";
	  total = total - value;
	  return;
  }

  public String toString () {
    return val + "\nTotal: " + total;
  }

  public void clear() {
	  val = 0 + " ";
	  total = 0;
  }
}