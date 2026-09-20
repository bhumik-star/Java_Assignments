public class student extends Person {
    @Override
    public void describeRole() {
        System.out.println("I am a student.");
    }

    public void submitAssignment() {
        System.out.println("Student submitted an assignment.");
    }
}