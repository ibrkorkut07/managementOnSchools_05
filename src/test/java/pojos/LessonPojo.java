package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class LessonPojo {
    public LessonPojo() {

    }

/*
      {
         "compulsory": true,
         "creditScore": 0,
         "lessonName": "string"
       }

     */
private LessonObjectPojo object;
    private String message;
    private String httpStatus;

    public LessonPojo(LessonObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;

    }

    public LessonObjectPojo getObject() {
        return object;
    }

    public void setObject(LessonObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }

}
