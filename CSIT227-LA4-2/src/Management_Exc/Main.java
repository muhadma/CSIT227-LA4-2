package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        Manager a = null;
        Employee b = null;

        for (Person s : persons) {
            if(s.getName() == manager) {
                if(s instanceof Manager) {
                    a = (Manager) s;
                } else {
                    throw new ClassCastException();
                }
            }
        }

        for (Person s : persons) {
            if(s.getName() == employee) {
                if(s instanceof Employee) {
                    b = (Employee) s;
                } else {
                    throw  new ClassCastException();
                }
            }
        }

        if(a == null || b == null) {
            throw new NoSuchElementException();
        }

        if(salary < 0) {
            throw new IllegalArgumentException();
        }

        a.giveRaise(b, salary);
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {
        Developer c = null;
        Manager d = null;

        for(Person s : persons) {
            if(s.getName() == developer) {
                if(s instanceof Developer) {
                    c = (Developer) s;
                } else {
                    throw new ClassCastException();
                }
            }
        }

        for (Person s : persons) {
            if (s.getName() == manager) {
                if (s instanceof Manager) {
                    d = (Manager) s;
                } else {
                    throw new ClassCastException();
                }
            }
        }

        if(c == null || d == null) {
            throw new NoSuchElementException();
        }

        if(c.getProjectManager() != null) {
            c.setProjectManager(d);
        } else {
            throw new IllegalStateException();
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Customer e = null;
        Employee f = null;

        for(Person s : persons) {
            if(s.getName() == customer) {
                if(s instanceof Customer) {
                    e = (Customer) s;
                } else {
                    throw new
                }
            }
        }
        return null;
    }
}