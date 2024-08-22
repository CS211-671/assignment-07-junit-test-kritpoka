package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("6610400001", "aaa", 80);
        studentList.addNewStudent("6610400002", "bbb", 50);
        studentList.addNewStudent("6610400003", "ccc", 60);
    }

    @Test
    void testViewGradeOfId(){
        String student = studentList.viewGradeOfId("6610400001");
        assertEquals("A", student);
    }

    @Test
    void testGiveScoreToId(){
        studentList.giveScoreToId("6610400002", 5.0);
        Student student = studentList.findStudentById("6610400002");
        double score =  student.getScore();
        assertEquals(55.0, score);
    }
}