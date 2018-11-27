package main;

public class CollegeClass {

  // fields
  private String name;
  private int credits;
  private String[] roster;

  // methods


  // Constructor

  public CollegeClass() {
    name = "Not set";
    credits = 0;
    roster = new String[6];
  }

  // overloaded
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }
  // Accessory

  public String getName() {
    return name;
  }

  // mutator
  public void setName(String name) {
    this.name = name;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public String[] getRoster() {
    return roster;
  }

  public void setRoster(String[] roster) {
    this.roster = roster;
  }

  public void printInfo() {
    System.out.println("College Class");
    System.out.println(name);
    System.out.println(credits);
    for(int i = 0; i < roster.length; i++)
    {    System.out.println(roster[i]);}
  }

}
