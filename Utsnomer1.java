package utsnomer1;
/**
 *
 * @author Seftiani Ayu L
 */
public class Utsnomer1 {
    private String name;
    private int idNumber;
    private String department;
    private String position;


public Utsnomer1(String name, int idNumber, String department, String position) {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getIdNumber() {
    return idNumber;
}

public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

public String getPosition() {
    return position;
}

public void setPosition(String position) {
    this.position = position;
}

@Override
public String toString() {
    return String.format("data: %s %s %s %s", name, idNumber, department, position);
}

public static void main(String[] args) {
  Utsnomer1 first = new Utsnomer1("Susan Meyers", 47899, "Marketing", "Sales Rep");
  Utsnomer1 second = new Utsnomer1("Mark Jones", 39119, "IT",  "Programmer");
  Utsnomer1 third = new Utsnomer1("Joy Rogers", 81774, "Manufacturing", "Engineer");
  System.out.println(first);
  System.out.println(second);
  System.out.println(third);

}
}