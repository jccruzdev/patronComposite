/* 4. Developer.java

Corresponde a un 'leaf', lo cual significa que no puede tener sub-elementos

Esta clase almacena tanto el  nombre, id empleado y posición de un empleado Developer
además implementa la interfaz Employee con el fin de ajustar el método 
showEmployeeDetails().

En este tipo de clases 'leaf' es donde se realiza la mayoria de trabajo (Código) ya que 
no tienen el deber de delegar el trabajo a sub-elementos.
*/

public class Developer implements Employee 
{ 
    private String name; 
    private long empId; 
    private String position; 
  
    public Developer(long empId, String name, String position) 
    { 
        this.empId = empId; 
        this.name = name; 
                this.position = position; 
    } 
      
    @Override
    public void showEmployeeDetails()  
    { 
        System.out.println(empId+" " +name+); 
    } 
} 