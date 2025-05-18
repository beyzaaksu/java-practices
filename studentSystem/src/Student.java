public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chem;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physics,Course chem) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chem = chem;
        calcAverage();
        this.isPass = false;

    }

    public void addBulkExamNote(int math, int physics, int chem, int mathQuiz, int physicsQuiz, int chemQuiz) {

        if (math >= 0 && math <= 100) {
            this.math.grade = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.grade = physics;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.grade = chem;
        }
        if (mathQuiz >= 0 && mathQuiz <= 100) {
            this.math.quiz = mathQuiz;
        }
        if (physicsQuiz >= 0 && physicsQuiz <= 100) {
            this.physics.quiz = physicsQuiz;
        }
        if (chemQuiz >= 0 && chemQuiz <= 100) {
            this.chem.quiz = chemQuiz;
        }

    }

    public void isPass() {
        if (this.math.grade == 0 || this.physics.grade == 0
                || this.chem.grade == 0 || this.math.quiz == 0 || this.physics.quiz == 0 || this.chem.quiz == 0) {
            System.out.println("Not all grades are entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed. ");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.physics.grade * (1-this.physics.quizPercentage) +
                this.chem.grade* (1-this.physics.quizPercentage) +
                this.math.grade* (1-this.physics.quizPercentage)+
                this.math.quiz * this.math.quizPercentage +
                this.physics.quiz * this.physics.quizPercentage +
                this.chem.quiz * this.chem.quizPercentage
        ) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + this.math.grade);
        System.out.println("Physics Grade : " + this.physics.grade);
        System.out.println("Chem Grade : " + this.chem.grade);
        System.out.println("Math Quiz Grade : " + this.math.quiz);
        System.out.println("Physics Quiz Grade : " + this.physics.quiz);
        System.out.println("Chem Quiz Grade : " + this.chem.quiz);
    }

}
