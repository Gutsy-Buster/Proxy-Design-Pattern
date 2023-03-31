public class Employee implements EmployeeInterface {
    
    @Override
    public void create(String client, EmployeeDAO obj) throws Exception {
        System.out.println("Employee Created");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        System.out.println("Employee deleted");
    }

    @Override
    public EmployeeDAO get(String client, int id) throws Exception {
        System.out.print("Employee details fetched : ");
        return new EmployeeDAO(1, "Srishti");
    }
}
