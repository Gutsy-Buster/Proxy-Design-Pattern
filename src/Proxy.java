public class Proxy implements EmployeeInterface {

    Employee emp;

    public Proxy() {
        emp = new Employee();
    }

    @Override
    public void create(String client, EmployeeDAO obj) throws Exception {
        if(client.equals("ADMIN")) {
            emp.create(client, obj);
        } else throw new Exception("Access denied");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if(client.equals("ADMIN")) {
            emp.delete(client, id);
        } else throw new Exception("Access denied");
    }

    @Override
    public EmployeeDAO get(String client, int id) throws Exception {
        if(client.equals("ADMIN")) {
            return emp.get(client, id);
        } else throw new Exception("Access denied");
    }
    
}
