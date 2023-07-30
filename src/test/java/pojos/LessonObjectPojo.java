package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonObjectPojo {

    /*
     {
   "httpStatus": "100 CONTINUE",
   "message": "string",
   "object": {
     "compulsory": true,
     "creditScore": 0,
     "lessonId": 0,
     "lessonName": "string"
   }
 }

      */
    private int creditScore;

    private String lessonName;
    private boolean compulsory;


    public LessonObjectPojo() {
    }

    public LessonObjectPojo(int creditScore, String lessonName, boolean compulsory) {
        this.creditScore = creditScore;
        this.lessonName = lessonName;
        this.compulsory = compulsory;
    }


    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }



    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "LessonObjectPojo{" +
                "creditScore=" + creditScore +

                ", lessonName='" + lessonName + '\'' +
                ", compulsory=" + compulsory +
                '}';
    }
}
