package pojos;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePersonnelPojo {
    private ObjectPojo object;
    private String message;
    private String httpStatus;



    public ResponsePersonnelPojo() {
    }

    public ResponsePersonnelPojo(ObjectPojo object, String message, String httpStatus) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectPojo getObject() {
        return object;
    }

    public void setObject(ObjectPojo object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "PostResponsePersonnelPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
