package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentInfoPojo {
    private Integer absentee;
    private Integer educationTermId;
    private Integer finalExam;
    private String infoNote;
    private Integer lessonId;
    private Integer midtermExam;
    private Integer studentId;

    public StudentInfoPojo() {
    }
    public StudentInfoPojo(Integer absentee, Integer educationTermId, Integer finalExam, String infoNote, Integer lessonId, Integer midtermExam, Integer studentId) {
        this.absentee = absentee;
        this.educationTermId = educationTermId;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.lessonId = lessonId;
        this.midtermExam = midtermExam;
        this.studentId = studentId;

    }

    public Integer getAbsentee() {
        return absentee;
    }

    public void setAbsentee(Integer absentee) {
        this.absentee = absentee;
    }

    public Integer getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(Integer educationTermId) {
        this.educationTermId = educationTermId;
    }

    public Integer getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Integer finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(Integer midtermExam) {
        this.midtermExam = midtermExam;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Studentinfo{" +
                "absentee=" + absentee +
                ", educationTermId=" + educationTermId +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                ", lessonId=" + lessonId +
                ", midtermExam=" + midtermExam +
                ", studentId=" + studentId +

                '}';
    }

}