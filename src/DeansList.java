import java.util.ArrayList;

public class DeansList implements ICollection {

    private ArrayList<Student> students;

    public DeansList(ArrayList<Student> students) {
        this.students = students;
    }

    public DeansList() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

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

    public Object getNext() {
        if (students.size() > 0) {
            Student next = this.highestGpa();
            students.remove(this.highestGpa());
            return next;
        } else
            return false;
    }

    public Student highestGpa() {
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
