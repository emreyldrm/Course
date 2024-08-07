package org.example;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Mathematics","MAT101","MAT",20);
        Course phy = new Course("Physics","PHY101","PHY",25);
        Course che = new Course("Chemistry","CHEM101","CHEM",30);

        Teacher t1 = new Teacher("Jaydon Dillon","12345","MAT");
        Teacher t2 = new Teacher("Jerry Watts","22223","PHY");
        Teacher t3 = new Teacher("Dafydd Gates","55542","CHEM");

        mat.addTeacher(t1);
        phy.addTeacher(t2);
        che.addTeacher(t3);

        Student s1 = new Student("Luc Gomez",911,3,mat,phy,che);
        Student s2 = new Student("Janet Calhoun",921,2,mat,phy,che);
        Student s3 = new Student("Eryn Dale",931,4,mat,phy,che);

        s1.addBulkExamNote(50,100,20,100,40,100);
        s1.isPass();
        s2.addBulkExamNote(100,0,50,0,70,0);
        s2.isPass();
        s3.addBulkExamNote(25,25,75,75,80,80);
        s3.isPass();
    }
}