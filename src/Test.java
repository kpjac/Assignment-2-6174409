public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Sonia", 3.56);
        Student s2 = new Student("Tim", 3.66);
        Student s3 = new Student("Megan", 3.81);
        Student s4 = new Student("Anthony", 3.83);
        DeansList dl = new DeansList();
        dl.add(s1);
        dl.add(s2);
        dl.add(s3);
        dl.add(s4);
        System.out.println("Students on Dean's list:");
        for (Student s : dl.getStudents()) {
            System.out.println(s);
        }
        ClientService cs = new ClientService(10);
        Client c1 = new Client("Jake");
        Client c2 = new Client("Merrick");
        Client c3 = new Client("Esteban");
        cs.add(c2);
        cs.add(c3);
        cs.add(c1);
        System.out.println("Next client: " + cs.getNext());
        System.out.println("Remaining clients to serve:");
        for (Client c : cs.getClients()) {
            System.out.println(c);
        }
        BagItem i1 = new BagItem("Nice shoes", 129010239);
        BagItem i2 = new BagItem("Jacket", 3823894);
        BagItem i3 = new BagItem("Aviator sunglasses", 48300984);
        ShoppingBag sb = new ShoppingBag(5);
        sb.add(i1);
        sb.add(i2);
        sb.add(i3);
        sb.add(c2);
        System.out.println("First item out of bag: " + sb.getNext());
        System.out.println("Remaining item count: " + sb.getNumItems());
    }
}
