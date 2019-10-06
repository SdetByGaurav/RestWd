package JSONParser;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = {
	"name",
	"empNo",
	"salary"
})
public class EmpDetails implements Serializable{


	private int empNo;
	private String name;
	private double salary;
	public EmpDetails(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public EmpDetails(){}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
