package college.app;

import college.model.InvalidStudentDataException;
import college.model.Student;
import college.util.TextUtils;

public class Week7Lab {
    public static void main(String[] args) {
        Student student = new Student("  BHU  mik  ");
        String result = TextUtils.normalizeName("  Mi  ke  ");
        System.out.println(result);
        String[] markValues = {"85", "a", "105","99"};

        for (String markValue : markValues) {
            try {
                student.setMark(Integer.parseInt(markValue));
                System.out.println("Valid mark: " + student);
            } catch (NumberFormatException exception) {
                System.out.println("Invalid mark '" + markValue + "': enter a whole number");
            } catch (InvalidStudentDataException exception) {
                System.out.println("Invalid mark '" + markValue + "': " + exception.getMessage());
            } finally {
                System.out.println("Validation attempt complete");
            }
        }
    }
}
