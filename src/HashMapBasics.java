import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Employee> employees = new HashMap<>();
        employees.put("Adam", new Employee("Adam"));
        employees.put("Kasia", new Employee("Kasia"));
        employees.put("Bartek", new Employee("Bartek"));
        employees.put("Wojetek", new Employee("Wojtek"));
        System.out.println(employees.get("Kasia"));

        Iterator i = employees.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            String key = (String) entry.getKey();
            Employee employee = (Employee) entry.getValue();
            System.out.println("key: " + key + " - employee: " + employee);
        }
        System.out.println("Petla foreach");
        for (Map.Entry<String, Employee>  e : employees.entrySet())
        {
            String key = e.getKey();
            Employee employee = e.getValue();
            System.out.println("key: " + key + " - employee: " + employee);
        }
    }
}
