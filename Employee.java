package akanksha.labassignment4;
import java.io.*; 

class Address implements Serializable
{
	String city;
	String district;
	String pincode;
	public Address(String city, String district, String pincode) {
		super();
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
class EmployeeDetails implements Serializable {  
	private static final long serialversionUID = 1293548932L; 
	String name;
    String id;
    Address address;
    transient double salary;
	public EmployeeDetails(String name, String id, Address address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialversionUID;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", id=" + id + ", address=" + address.city+" "+address.district+" "+address.pincode + ", salary=" + salary + "]";
	}
	
  
} 
public class Employee { 
  
public static void main(String[] args) 
    { 
		Address address=new Address("muradnagar","GZB","201206");
        EmployeeDetails employee = new EmployeeDetails("Akanksha Tyagi", "YM238", address, 48950.50); 
        String filename = "C:\\Users\\ve00ym238\\Desktop\\javal_lab_assignments\\ymsli_core_java\\src\\Akanksha\\labassignment4\\Employee.ser"; 
        
      
        try { 
  
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file);
  
            out.writeObject(employee); 
  
            out.close(); 
            
            System.out.println("Employee Data has been serialized .Data before Deserialization."); 
            System.out.println(employee.toString());
        } 
  
        catch (IOException ex) { 
        	ex.printStackTrace();
            System.out.println("IOException is caught"); 
        } 
  
        EmployeeDetails employee1 = null; 
  
      
        try { 
  
        	FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
  
            employee1 = (EmployeeDetails)in.readObject(); 
  
            in.close(); 
    
            System.out.println("EmployeeDetails has been deserialized.Data after Deserialization."); 
            System.out.println(employee1.toString());
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
    } 
} 
