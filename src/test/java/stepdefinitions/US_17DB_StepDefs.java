package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class US_17DB_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("get student info via to id {string}")
    public void get_student_info_via_to_id(String id) throws SQLException {

        //Create connection
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");
        //Create Statement
        statement = connection.createStatement();

        //Create ResultSet
        String sqlQuery = "SELECT * FROM \"public\".student_info WHERE id='"+id+"'";
        resultSet = statement.executeQuery(sqlQuery);



    }
    @Then("body contains exam_average {string} , final_exam {string}, info_note {string}, letter_grade {string}, midterm_exam {string} , education_term_id {string}, lesson_lesson_id {string}, student_id {string}, teacher_id {string}")
    public void body_contains_exam_average_final_exam_info_note_letter_grade_midterm_exam_education_term_id_lesson_lesson_id_student_id_teacher_id(String exam_average, String final_exam, String info_note, String letter_grade, String midterm_exam, String education_term_id, String lesson_lesson_id, String student_id, String teacher_id) throws SQLException {

        resultSet.next();

        String actExamAverage = resultSet.getString("exam_average");
        String actFinalExam = resultSet.getString("final_exam");
        String actInfoNote = resultSet.getString("info_note");
        String actLetterGrade = resultSet.getString("letter_grade");
        String actMidtermExam = resultSet.getString("midterm_exam");
        String actEducationTermId = resultSet.getString("education_term_id");
        String actLessonLessonId = resultSet.getString("lesson_lesson_id");
        String actStudentId = resultSet.getString("student_id");
        String actTeacherId = resultSet.getString("teacher_id");

        assertEquals(exam_average,actExamAverage);
        assertEquals(final_exam,actFinalExam);
        assertEquals(info_note,actInfoNote);
        assertEquals(letter_grade,actLetterGrade);
        assertEquals(midterm_exam,actMidtermExam);
        assertEquals(education_term_id,actEducationTermId);
        assertEquals(lesson_lesson_id,actLessonLessonId);
        assertEquals(student_id,actStudentId);
        assertEquals(teacher_id,actTeacherId);


    }

}
