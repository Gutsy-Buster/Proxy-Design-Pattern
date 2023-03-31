public class ProxyMain {
    public static void main(String[] args) throws Exception {
        EmployeeInterface proxy = new Proxy();

        proxy.create("ADMIN", new EmployeeDAO(1, "Srishti"));
        EmployeeDAO emp = proxy.get("ADMIN", 1);
        System.out.println(emp.getName());
        // proxy.delete("USER", 1);
        proxy.delete("ADMIN", 1);
    }
}
