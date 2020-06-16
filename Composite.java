/* 3. Composite.java

Tambien conocido como container, es un elemento que puede contener
otros sub-elementos 'leaves' u otros 'container'. 

Este contenedor no sabe de las clases hijas concretamente, además solo
se contecta con todos los sub-elementos a través de ComponentInterface.java

Cuando un contenedor recibe una petición, este delega el trabajo a sus sub-elementos y
el cliente es quien ve el resultado final.

*/


import java.util.ArrayList; 
import java.util.List; 
  
public class CompanyDirectory implements Employee 
{ 
    private List<Employee> employeeList = new ArrayList<Employee>(); 
       
    @Override
    public void showEmployeeDetails()  
    { 
        for(Employee emp:employeeList) 
        { 
            emp.showEmployeeDetails(); 
        } 
    } 
       
    public void addEmployee(Employee emp) 
    { 
        employeeList.add(emp); 
    } 
       
    public void removeEmployee(Employee emp) 
    { 
        employeeList.remove(emp); 
    } 
} 
