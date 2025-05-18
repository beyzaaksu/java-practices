public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MATH101", "MATH", 0.20);
        Course physics = new Course("Physics", "PHY101", "PHY", 0.10);
        Course chem = new Course("Chem", "CHEM101", "CHEM", 0.40);

        Teacher t1 = new Teacher("Prof. Dr. Pisagor", "90550000000", "MATH");
        Teacher t2 = new Teacher("Prof. Dr. Newton", "90550000001", "PHY");
        Teacher t3 = new Teacher("Prof. Dr. Curie", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chem.addTeacher(t3);


        Student s1 = new Student("Alan Turing", 4, "140144015", math, physics, chem);
        s1.addBulkExamNote(50,20,40,100,20,70);
        s1.isPass();

        Student s2 = new Student("Ada Lovelace", 4, "2211133", math, physics, chem);
        s2.addBulkExamNote(100,50,40,100,100,40);
        s2.isPass();

        Student s3 = new Student("John Dalton", 4, "221121312", math, physics, chem);
        s3.addBulkExamNote(50,20,40,90,30,100);
        s3.isPass();

    }
}
