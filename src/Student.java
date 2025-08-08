
public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;


    public Student(String studentName, int studentAge, String studentCourse, double studentGrade1, double studentGrade2, double studentGrade3) {
        this.name = studentName;
        this.age = studentAge;
        this.course = studentCourse;
        this.grade1 = studentGrade1;
        this.grade2 = studentGrade2;
        this.grade3 = studentGrade3;
    }

    public void displayInfo() {
        System.out.println("Student's Information:");
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + (isPassing() ? "PASSING" : "FAILING"));
        System.out.println();
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90){
            return "A";
        }
        else if (avg >= 80) {
            return "B";
        }
        else if (avg >= 70) {
            return "C";
        }
        else if (avg >= 60) {
            return "D";
        }
        else return "F";
    }

    boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
