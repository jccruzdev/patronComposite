/*1. Clase Cliente:  

Se encarga de trabajar con todos los elementos a travez de la interfaz
ComponentInterface.java

Esta clase se encarga de instanciar a cada clase tipo 'employee',
utilizar su constructor y finalmente poder agregar empleados al directorio
de la compañia.


El container (contiene sub-elementos y otros container):
Composite.java


Las clases leaf (no tienen sub-elementos): 

1. Developer.java
2. Manager.java


*/

public class Company 
{ 
    public static void main (String[] args) 
    { 
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
        CompanyDirectory engDirectory = new CompanyDirectory(); 
        engDirectory.addEmployee(dev1); 
        engDirectory.addEmployee(dev2); 
          
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
          
        CompanyDirectory accDirectory = new CompanyDirectory(); 
        accDirectory.addEmployee(man1); 
        accDirectory.addEmployee(man2); 
      
        CompanyDirectory directory = new CompanyDirectory(); 
        directory.addEmployee(engDirectory); 
        directory.addEmployee(accDirectory); 
        directory.showEmployeeDetails(); 
    } 
} 