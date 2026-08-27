public class StudentRecord {
    public static void main(String arg[]){
        Student s1 = new Student("Bhumik", "25CSSU052", 49);
        Student s2 = new Student("Aarav", "25CSSU053", 50);
        Student s3 = new Student("Meera", "25CSSU054", 79);

        s3.setMark(80);
        boolean invalidUpdate = s1.setMark(101);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Invalid update accepted: " + invalidUpdate);
    }
}
