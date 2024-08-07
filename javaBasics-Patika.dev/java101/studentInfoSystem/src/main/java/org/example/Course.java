package org.example;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;
    double performanceNotePercent;

    public Course(String name, String code, String prefix, int performanceNotePercent){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performanceNote = 0;
        this.performanceNotePercent = performanceNotePercent / 100.0;
    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("Teacher successfully added!");
        }else {
            System.out.println("The teacher cannot teach this lesson!");
        }
    }
    public void printTeacher(){
        if (this.teacher != null){
            System.out.println("Teacher name: " + this.teacher.name);
        }else {
            System.out.println("No teacher assigned to" + this.name + "course");
        }

    }

}
