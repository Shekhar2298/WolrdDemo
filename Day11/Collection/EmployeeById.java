package Collection;

import java.util.Comparator;

public class EmployeeById  implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        //return Integer.compare(o1.getId(), o2.getId());
 return o1.getName().compareTo(o2.getName());
    }
}
