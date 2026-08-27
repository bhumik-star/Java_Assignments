/*Student requirements:

- private String name
- private String studentId
- private int mark
- a constructor receiving all three values
- name and studentId must be non-null and non-blank
- mark must remain between 0 and 100
- getters for all fields
- boolean setMark(int newMark), preserving the old mark when invalid
- boolean hasPassed()
- String getClassification()
- a useful toString()
 */

public class Student{
    private String name;
    private String studentId;
    private int mark;
    Student(String name,String studentId,int mark){
        boolean c1 = check_string(name);
        boolean c2 = check_string(studentId);
        boolean n1 = check_num(mark);
        if(c1 && c2 && n1){
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;}
        else{System.out.println("Error!");}
    }
    private boolean check_string(String s){
        if(s == null){
            return false;
        }
        else if(s.trim() == ""){
            return false;
        }
        else{return true;}
    }
    private boolean check_num(int n){
        if(n>=0 && n<=100){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean setMark(int newMark){
        if(check_num(newMark)){
            mark = newMark;
            return true;
        }
        return false;
    }

    public boolean hasPassed(){
        return mark >= 40;
    }

    public String getClassification(){
        if(mark >= 70){
            return "Great";
        }
        else if(mark >= 60){
            return "Good";
        }
        else if(mark >= 40){
            return "Pass";
        }
        return "Fail";
    }

    @Override
    public String toString(){
        return "Student{name='" + name + "', studentId='" + studentId
                + "', mark=" + mark + ", classification='" + getClassification() + "'}";
    }

    public void getinfo(){
        System.out.print("Name: "+ name+" Id: "+studentId+" marks: "+mark);
    }
}
