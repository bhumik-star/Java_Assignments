/*Course requirements:

- course code, title, capacity, and enrolled count
- constructor establishes a positive capacity and zero enrollment
- boolean enroll()
- boolean withdraw()
- boolean isFull()
- int getAvailableSeats()
- no direct setter for enrolled count
- readable toString()
 */
public class Course {
    String course_code;
    String title;
    int capacity;
    int enrolled_count;
    public Course(String course_code,String title, int capacity){
        this.course_code = course_code;
        this.title = title;
        if(capacity>0){
            this.capacity = capacity;
        }
        else{
            throw new IllegalArgumentException("Capacity must be positive");
        }
    }
    public boolean enroll(){
        if(capacity>enrolled_count){
            enrolled_count +=1;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw(){
        if(enrolled_count>0){
            enrolled_count -=1;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(capacity==enrolled_count){
            return true;
        }
        else{
            return false;
        }
    }
    public int getAvailableSeats(){
        int seats = capacity-enrolled_count;
        return seats;
    }
    @Override
    public String toString(){
        return "Course{" +
                "course_code='" + course_code + '\'' +
                ", title='" + title + '\'' +
                ", capacity=" + capacity +
                ", enrolled_count=" + enrolled_count +
                '}';
    }
}
