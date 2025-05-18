public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int grade;
    int quiz;
    double quizPercentage;

    public Course(String name, String code, String prefix, double quizPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.quiz=0;
        this.quizPercentage=quizPercentage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Succeeded");
        } else {
            System.out.println(t.name + " Academician can not choose this course");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " course's Academician is : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " course does not have an Academician");
        }
    }
}


