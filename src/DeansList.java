/**
 * Used to track students on the dean's list. Students with GPA >= 3.7
 * are added to the dean's list.
 */

import java.util.ArrayList;

public class DeansList implements ICollection {

    private ArrayList<Student> students;

    /**
     * Parameterized constructor removes any students with GPA less than 3.7
     *
     * @param students pre-existing list of students
     */
    public DeansList(ArrayList<Student> students) {
        this.students = students;
        for (Student s : this.students) {
            if (s.getGpa() < 3.7) {
                this.students.remove(s);
            }
        }
    }

    /**
     * Default constructor
     */
    public DeansList() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Implementation of add(newItem) method for dean's list
     *
     * <p>Checks if the student to add has a GPA of at least 3.7.</p>
     *
     * @param newItem from signature of abstract method
     * @return true if a student is added, false if none is added
     */
    public boolean add(Object newItem) {
        if (newItem instanceof Student) {
            Student studentToAdd = (Student) newItem;
            if (studentToAdd.getGpa() >= 3.7) {
                students.add(studentToAdd);
                return true;
            } else
                return false;
        }
        else
            return false;
    }

    /**
     * Implementation of getNext() method for dean's list
     *
     * <p>This method will get students from the dean's list in order of GPA,
     * starting with the highest.</p>
     *
     * @return the next student
     */
    public Object getNext() {
        if (students.size() > 0) {
            return students.remove(this.highestGpa());
        } else
            return false;
    }

    /**
     * Private method for use by getNext() in determining student with
     * highest GPA, employing a basic max algorithm.
     *
     * @return the student on the dean's list with the highest GPA.
     */
    private Student highestGpa() {
        int index = 0;
        double max = 0.0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGpa() > max) {
                max = students.get(i).getGpa();
                index = i;
            }
        }
        return students.get(index);
    }

}
