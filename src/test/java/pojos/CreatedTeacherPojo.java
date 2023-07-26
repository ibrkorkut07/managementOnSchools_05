package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTeacherPojo {
    public Integer userId;
    public String username;
    public String password;
    public String lessonsIdList;
    public String name;
    public String surname;
    public String birthDay;
    public String ssn;
    public String birthPlace;
    public String phoneNumber;
    public String gender;
    public String email;

    public CreatedTeacherPojo() {
    }

    public CreatedTeacherPojo(Integer userId, String username, String password, String lessonsIdList, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.lessonsIdList = lessonsIdList;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.ssn = ssn;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLessonsIdList() {
        return lessonsIdList;
    }

    public void setLessonsIdList(String lessonsIdList) {
        this.lessonsIdList = lessonsIdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CreatedTeacherPojo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lessonsIdList='" + lessonsIdList + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


