package college.model;

import college.util.TextUtils;

public class Student {
    private final String name;

    public Student(String name) {
        try {
            this.name = TextUtils.normalizeName(name);
        } catch (IllegalArgumentException exception) {
            throw new InvalidStudentDataException(exception.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
