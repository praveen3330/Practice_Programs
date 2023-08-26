enum Course {
    JAVA,PYTHON,C;
    private int course_id;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
   
}

public class Enum3 {

    public static void main(String[] args) {
        Course.JAVA.setCourse_id(1);
        Course.PYTHON.setCourse_id(2);
        Course.C.setCourse_id(3);

		int id_JAVA = Course.JAVA.getCourse_id();
		int id_PYTHON = Course.JAVA.getCourse_id();
		int id_C = Course.JAVA.getCourse_id();
		System.out.println(id_JAVA + ":" + Course.JAVA.name());
		System.out.println(id_PYTHON + ":" + Course.PYTHON.name());
		System.out.println(id_C + ":" + Course.C.name());
    }

}
