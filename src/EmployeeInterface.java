public interface EmployeeInterface {
    public void create(String client, EmployeeDAO obj) throws Exception;
    public void delete(String client, int id) throws Exception;
    public EmployeeDAO get(String client, int id) throws Exception;
}
