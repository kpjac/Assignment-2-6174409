public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Sonia", 3.56);
        Student s2 = new Student("Tim", 3.66);
        Student s3 = new Student("Megan", 3.81);
        DeansList dl = new DeansList();
        dl.add(s1);
        dl.add(s2);
        dl.add(s3);
        for (Student s : dl.getStudents()) {
            System.out.println(s);
        }
    }
}
