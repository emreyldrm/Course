package org.example;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    int studentNo;
    int grade;
    double average;
    boolean isPass;

    public Student(String name, int studentNo, int grade, Course course1, Course course2, Course course3){
        this.name = name;
        this.studentNo = studentNo;
        this.grade = grade;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int course1Note,int course1PerformanceNote, int course2Note, int course2PerformanceNote, int course3Note, int course3PerformanceNote){
        this.course1.note = this.checkNote(course1Note);
        this.course2.note = this.checkNote(course2Note);
        this.course3.note = this.checkNote(course3Note);
        this.course1.performanceNote = this.checkNote(course1PerformanceNote);
        this.course2.performanceNote = this.checkNote(course2PerformanceNote);
        this.course3.performanceNote = this.checkNote(course3PerformanceNote);

    }
    public void isPass(){
        System.out.println("=========");
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0 ){//default value
            System.out.println("Notes not fully entered.");
        }else {
            this.calcAverage();
            System.out.println("Average: " + this.average);
            printNote();
            if (this.average > 55){
                System.out.println("Passed the class!");
            }else{
                System.out.println("Failed!");
            }
        }
    }

    private void printNote() {
        System.out.println("Student: " + this.name);
        System.out.println(this.course1.name + ": " + this.course1.note);
        System.out.println(this.course2.name + ": " + this.course2.note);
        System.out.println(this.course3.name + ": " + this.course3.note);
    }

    public void calcAverage(){
        double c1 = (this.course1.note * (1 - this.course1.performanceNotePercent)) + (this.course1.performanceNote * this.course1.performanceNotePercent);
        double c2 = (this.course2.note * (1 - this.course2.performanceNotePercent)) + (this.course2.performanceNote * this.course2.performanceNotePercent);
        double c3 = (this.course3.note * (1 - this.course3.performanceNotePercent)) + (this.course3.performanceNote * this.course3.performanceNotePercent);
        this.average = (c1 + c2 +c3) / 3;
    }

    public int checkNote(int note){
        if (note >= 0 && note <= 100){
            return note;
        }else {
            return 0;
        }
    }


}
