package main;

public class WeekFive {

  public static void do5() {
    // Class Demonstration
    CellPhone myPhone = new CellPhone();
    myPhone.setManufacturer("Apple");
    System.out.println(myPhone.getManufacturer());
  }
}



class CellPhone {

  // field
  private String manufacturer;

  // methods
  // set
  public void setManufacturer(String manufact) {
    manufacturer = manufact;
  }

  // get
  public String getManufacturer() {
    return manufacturer;
  }
}
