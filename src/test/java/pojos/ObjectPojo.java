package pojos;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectPojo {
        private Integer userId;
        private String username;
        private String name;
        private String surname;
        private String birthDay;
        private String ssn;
        private String birthPlace;
        private String phoneNumber;
        private String gender;





        public ObjectPojo() {
        }

        public ObjectPojo(Integer userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
                this.userId = userId;
                this.username = username;
                this.name = name;
                this.surname = surname;
                this.birthDay = birthDay;
                this.ssn = ssn;
                this.birthPlace = birthPlace;
                this.phoneNumber = phoneNumber;
                this.gender = gender;
        }

        public String getBirthDay() {
                return birthDay;
        }

        public void setBirthDay(String birthDay) {
                this.birthDay = birthDay;
        }

        public String getBirthPlace() {
                return birthPlace;
        }

        public void setBirthPlace(String birthPlace) {
                this.birthPlace = birthPlace;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getSsn() {
                return ssn;
        }

        public void setSsn(String ssn) {
                this.ssn = ssn;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
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

        @Override
        public String toString() {
                return "ObjectPojo{" +
                        "userId=" + userId +
                        ", username='" + username + '\'' +
                        ", name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", birthDay='" + birthDay + '\'' +
                        ", ssn='" + ssn + '\'' +
                        ", birthPlace='" + birthPlace + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", gender='" + gender + '\'' +
                        '}';
        }


}
