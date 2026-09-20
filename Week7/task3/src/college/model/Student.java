package college.model;

import college.util.TextUtils;

public class Student {
    private final String name;
    private int mark;

    public Student(String name) {
        this.name = TextUtils.normalizeName(name);
    }

    public String getName() {
        return name;
    }

    public void setMark(int mark) throws InvalidStudentDataException {
        if (mark < 0 || mark > 100) {
            throw new InvalidStudentDataException("Mark must be between 0 and 100");
        }
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}
