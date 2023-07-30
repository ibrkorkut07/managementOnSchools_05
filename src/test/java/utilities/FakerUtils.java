package utilities;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FakerUtils {

    static Faker faker = new Faker();
    private static final int PHONE_MIN = 100;
    private static final int PHONE_MAX = 999;
    private static final int AREA_CODE_MIN = 1000;
    private static final int AREA_CODE_MAX = 9999;
    private static final int SSN_GROUP_MIN = 10;
    private static final int SSN_GROUP_MAX = 99;
    private static List<String> ssnList = new ArrayList<>();
    private static List<String> phoneNumberList = new ArrayList<>();
    private static List<String> dateListAPI = new ArrayList<>();
    private static List<String> dateListUI = new ArrayList<>();
    public static String phoneNumberFaker(){
        addSsnPhoneList();
        System.out.println("phoneNumberList = " + phoneNumberList);
        return phoneNumberList.get(faker.number().numberBetween(0,50));
    }

    public static String ssnFaker(){
        addSsnPhoneList();
        System.out.println("ssnList = " + ssnList);
        return ssnList.get(faker.number().numberBetween(0,50));

    }

    public static void addSsnPhoneList(){
        while (ssnList.size() < 50 && phoneNumberList.size() < 50) {
            ssnList.add(ssnCreate());
            phoneNumberList.add(phoneNumberCreate());
        }
        if (ssnList.size() == 100 || phoneNumberList.size() == 100){
            ssnList.clear();
            phoneNumberList.clear();
            addSsnPhoneList();
        }
    }

    public static String phoneNumberCreate(){
        int firstPart = (int) (Math.random() * (PHONE_MAX - PHONE_MIN + 1) + PHONE_MIN);
        int secondPart = (int) (Math.random() * (PHONE_MAX - PHONE_MIN + 1) + PHONE_MIN);
        int thirdPart = (int) (Math.random() * (AREA_CODE_MAX - AREA_CODE_MIN + 1) + AREA_CODE_MIN);
        return String.format("%03d-%03d-%04d", firstPart, secondPart, thirdPart);
    }

    public static String ssnCreate(){
        int firstPart = (int) (Math.random() * (PHONE_MAX - PHONE_MIN + 1) + PHONE_MIN);
        int secondPart = (int) (Math.random() * (SSN_GROUP_MAX - SSN_GROUP_MIN + 1) + SSN_GROUP_MIN);
        int thirdPart = (int) (Math.random() * (AREA_CODE_MAX - AREA_CODE_MIN + 1) + AREA_CODE_MIN);
        return String.format("%03d-%02d-%04d", firstPart, secondPart, thirdPart);
    }


    public static String nameFaker(){
        String name = faker.name().firstName();
        return name;
    }
    public static String surnameFaker(){
        String surname = faker.name().lastName();
        return surname;
    }

    public static String usernameFaker(){
        String username = (faker.name().username()+"team01").substring(0,10);
        return username;
    }

    public static String emailFaker(){
        String email = faker.name().username() + "@gmail.com";
        return email;
    }

    public static String passwordFaker(){
        String password = faker.internet().password(8,10).substring(0,8);
        return password;
    }
    public static String birthPlaceFaker(){
        String birthPlace = faker.country().capital();
        return birthPlace;
    }
    public static String birthDayCreateAPI(Integer startYear, Integer maxYear) {
        // Generate a random year within the given range
        int randomYear = ThreadLocalRandom.current().nextInt(startYear, maxYear + 1);

        // Generate random month and day within their valid ranges
        int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
        int randomDay = ThreadLocalRandom.current().nextInt(1, LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth() + 1);

        // Create a LocalDate object with the random day, month, and year
        LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);

        // Format the random date as a string in the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = randomDate.format(formatter);

        return dateString;
    }
    public static String birthDayCreateAPI() {
        int startYear = 1970;
        int maxYear = 2000;

        // Generate a random year within the given range
        int randomYear = ThreadLocalRandom.current().nextInt(startYear, maxYear + 1);

        // Generate random month and day within their valid ranges
        int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
        int randomDay = ThreadLocalRandom.current().nextInt(1, LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth() + 1);

        // Create a LocalDate object with the random day, month, and year
        LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);

        // Format the random date as a string in the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = randomDate.format(formatter);

        return dateString;
    }

    public static String birthDayFakerAPI() {
        addBirthDayListAPI();
        System.out.println("dateListAPI = " + dateListAPI);
        return dateListAPI.get(faker.number().numberBetween(0,50));
    }


    public static void addBirthDayListAPI(){
        while (dateListAPI.size() < 50) {
            dateListAPI.add(birthDayCreateAPI());
        }
        if (dateListAPI.size() == 100){
            dateListAPI.clear();
            addBirthDayListAPI();
        }
    }  public static String birthDayCreateUI() {
        int startYear = 1970;
        int maxYear = 2000;

        // Generate a random year within the given range
        int randomYear = ThreadLocalRandom.current().nextInt(startYear, maxYear + 1);

        // Generate random month and day within their valid ranges
        int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
        int randomDay = ThreadLocalRandom.current().nextInt(1, LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth() + 1);

        // Create a LocalDate object with the random day, month, and year
        LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);

        // Format the random date as a string in the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateString = randomDate.format(formatter);

        return dateString;
    }
    public static String birthDayFakerUI() {
        addBirthDayListUI();
        System.out.println("dateListUI = " + dateListUI);
        return dateListUI.get(faker.number().numberBetween(0,50));
    }

    public static void addBirthDayListUI(){
        while (dateListUI.size() < 50) {
            dateListUI.add(birthDayCreateUI());
        }
        if (dateListUI.size() == 100){
            dateListUI.clear();
            addBirthDayListUI();
        }
    }


    // Method to convert date from database format to UI format
    public static String convertDateToUIFormat(String databaseDate) {
        DateTimeFormatter databaseFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter uiFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date = LocalDate.parse(databaseDate, databaseFormatter);
        return date.format(uiFormatter);
    }

    // Method to convert date from UI format to database format
    public static String convertDateToDatabaseFormat(String uiDate) {
        // Convert the date from "dd-MM-yyyy" to "yyyy-MM-dd"
        DateTimeFormatter uiFormatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        DateTimeFormatter databaseFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(uiDate, uiFormatter);
        return date.format(databaseFormatter);
    }


    // Method to convert date from any format to required format
    public static String convertDateToRequiredFormat(String databaseDate) {
        // Define a DateTimeFormatter with flexible parsing patterns
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("MM.dd.yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        DateTimeFormatter uiFormatter = builder.toFormatter();

        try {
            LocalDate date = LocalDate.parse(databaseDate, uiFormatter);
            return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            // If parsing fails, return the original input as is
            return databaseDate;
        }
    }



    public static int getRandomNumberInRange(int min, int max) {
        return faker.number().numberBetween(min,max);
    }


    public static Integer creditScoreFaker(){
        return Faker.instance().number().numberBetween(1,100);
    }
    public static String lessonFaker(){
        return Faker.instance().programmingLanguage().name() + "lesson";
    }

    public static Integer lessonIDFaker(){
        return Faker.instance().number().numberBetween(1,20);
    }
    public static Integer teacherIDFaker(){
        return Faker.instance().number().numberBetween(1,20);
    }
    public static String startTimeFaker(){
        return  generateRandomTime("13:00", "16:00");
    }
    public static String stopTimeFaker(){
        return  generateRandomTime("16:00", "23:00");
    }

    public static String generateRandomTime(String minTime, String maxTime) {
        String[] minTimeParts = minTime.split(":");
        String[] maxTimeParts = maxTime.split(":");
        int minHour = Integer.parseInt(minTimeParts[0]);
        int minMinute = Integer.parseInt(minTimeParts[1]);
        int maxHour = Integer.parseInt(maxTimeParts[0]);
        int maxMinute = Integer.parseInt(maxTimeParts[1]);

        int randomHour = getRandomNumberInRange(minHour, maxHour);
        int randomMinute = getRandomNumberInRange(minMinute, maxMinute);

        return String.format("%02d:%02d", randomHour, randomMinute);
    }

    public static String randomDayFaker() {
        String[] days = {
                "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"
        };
        int randomIndex = getRandomNumberInRange(0, days.length - 1);
        return days[randomIndex];
    }

    public static void main(String[] args) {


        System.out.println("passwordFaker() = " + passwordFaker());
        System.out.println("emailFaker() = " + emailFaker());
        System.out.println("usernameFaker() = " + usernameFaker());
        System.out.println("birthPlaceFaker() = " + birthPlaceFaker());
        System.out.println("nameFaker() = " + nameFaker());
        System.out.println("surnameFaker() = " + surnameFaker());
        System.out.println("===============================");
        System.out.println("startTimeFaker() = " + startTimeFaker());
        System.out.println("stopTimeFaker() = " + stopTimeFaker());
        System.out.println("phoneNumberFaker() = " + phoneNumberFaker());
        System.out.println("ssnFaker() = " + ssnFaker());
        System.out.println("birthDayFakerAPI() = " + birthDayFakerAPI());
        System.out.println("birthDayFakerUI() = " + birthDayFakerUI());

        System.out.println("===========================");

        System.out.println("phoneNumberList = " + phoneNumberList);
        System.out.println("ssnList = " + ssnList);
        System.out.println("dateList = " + dateListAPI);
        System.out.println("dateListUI = " + dateListUI);


    }

}
