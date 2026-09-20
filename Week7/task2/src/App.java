public class App {
    public static void main(String[] args) {
        Person[] people = {new Person(), new student(), new Instructor()};

        for (Person person : people) {
            person.describeRole();

            // person.submitAssignment();
            // This does not compile: a Person reference only exposes Person methods.
            if (person instanceof student student) {
                student.submitAssignment();
            } else if (person instanceof Instructor instructor) {
                instructor.conductClass();
            }
        }

    }
}
