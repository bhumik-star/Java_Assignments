public class CourseEnrollment {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Intro", 3);
        System.out.println("Empty course: " + c1);
        System.out.println("Available seats = " + c1.getAvailableSeats());
        System.out.println("Full? " + c1.isFull());

        Course c2 = new Course("CS102", "Java", 1);
        System.out.println(c2.enroll());
        System.out.println(c2.enroll());
        System.out.println("One seat remaining test: " + c2);

        Course c3 = new Course("CS103", "C++", 2);
        c3.enroll();
        c3.enroll();
        System.out.println("Full course: " + c3.isFull());

        Course c4 = new Course("CS104", "DB", 2);
        c4.enroll();
        c4.enroll();
        System.out.println("Over-enroll: " + c4.enroll());

        Course c5 = new Course("CS105", "Math", 2);
        c5.enroll();
        c5.enroll();
        System.out.println("Withdraw: " + c5.withdraw());
        System.out.println(c5);

        Course c6 = new Course("CS106", "Physics", 2);
        System.out.println("Withdraw empty: " + c6.withdraw());
    }
}
