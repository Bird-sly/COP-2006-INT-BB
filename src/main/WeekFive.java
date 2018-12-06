package main;

public class WeekFive {

  public static void do5() {
    // Class Demonstration
    CellPhone myPhone = new CellPhone();
    myPhone.setManufacturer("Motorola");
    System.out.println(myPhone.getManufacturer());
  }
}


// class, really should be in a separate file
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
