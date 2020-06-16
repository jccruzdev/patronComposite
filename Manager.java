/*
Es una clase 'leaf'.

Esta clase almacena tanto el nombre, id empleado y posición de un empleado Manager,
implementa la interfaz Employee con el fin de ajustar el método showEmployeeDetails().

*/


public class Manager implements Employee 
{ 
    private String name; 
    private long empId; 
        private String position; 
  
    public Manager(long empId, String name, String position) 
    { 
        this.empId = empId; 
        this.name = name; 
        this.position = position; 
    } 
      
    @Override
    public void showEmployeeDetails()  
    { 
        System.out.println(empId+" " +name); 
    } 
} 