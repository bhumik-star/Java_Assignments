package college.app;

import college.model.Student;
import college.util.TextUtils;

public class Week7Lab {
    public static void main(String[] args) {
        Student student = new Student("  BHU  mik  ");
        System.out.println(student.getName());
        System.out.println(TextUtils.normalizeName("BHUMIK"));
        System.out.println("Successful normalizations: "
                + TextUtils.getSuccessfulNormalizations());
    }
}
