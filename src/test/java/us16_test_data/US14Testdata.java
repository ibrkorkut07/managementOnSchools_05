package us16_test_data;

import java.util.HashMap;
import java.util.Map;

public class US14Testdata {
    public Map<String, String > teacherUsersSetUp(String username, String password, String lessonsIdList, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender, String email){

        Map<String,String> teacherUsersSetUp = new HashMap<>();

        teacherUsersSetUp.put("username", username);
        teacherUsersSetUp.put("password", password);
        teacherUsersSetUp.put("lessonsIdList", lessonsIdList);
        teacherUsersSetUp.put("name", name);
        teacherUsersSetUp.put("surname", surname);
        teacherUsersSetUp.put("birthDay", birthDay);
        teacherUsersSetUp.put("ssn", ssn);
        teacherUsersSetUp.put("birthPlace", birthPlace);
        teacherUsersSetUp.put("phoneNumber", phoneNumber);
        teacherUsersSetUp.put("gender", gender);
        teacherUsersSetUp.put("email", email);


        return teacherUsersSetUp;
    }

}
