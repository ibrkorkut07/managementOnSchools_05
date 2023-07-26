package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.WaitUtils;



import static org.junit.Assert.assertTrue;

public class US_22__UI_StepDefs {

 AdminMngPage adminMngPage = new AdminMngPage();
 AddAdminPage addAdminPage = new AddAdminPage();
 Faker faker = Faker.instance();
 MenuPage menuPage = new MenuPage();


 @Then("user clicks on login button to enter")
 public void user_clicks_on_login_button_to_enter() {
  addAdminPage.LoginButtonToEnter.click();


 }


 @Then("user clicks on menu tab")
 public void user_clicks_on_menu_tab() throws InterruptedException {
  addAdminPage.MenuTab.click();
  WaitUtils.waitFor(3);
 }


 @Then("user clicks on admin management option")
 public void user_clicks_on_admin_management_option() throws InterruptedException {
  adminMngPage.adminManagementLink.click();
  WaitUtils.waitFor(3);
 }


 @Then("click the name box")
 public void click_the_name_box() throws InterruptedException {

  addAdminPage.NameBoxOnAddadmin.click();

  WaitUtils.waitFor(3);


 }

 @Then("fill out the surname")
 public void fill_out_the_surname() throws InterruptedException {

  addAdminPage.SurnameBoxOnAddadmin.click();
  addAdminPage.SurnameBoxOnAddadmin.sendKeys("Sahin");
  WaitUtils.waitFor(3);
 }

 @Then("fill out the birth place")
 public void fill_out_the_birth_place() {

  addAdminPage.BirthPlaceBoxOnAddadmin.sendKeys("Amasya");

 }

 @Then("click the gender")
 public void click_the_gender() {

  addAdminPage.GenderMaleBoxOnAddadmin.click();
  WaitUtils.waitFor(3);


 }

 @Then("fill out the date of birth")
 public void fill_out_the_date_of_birth() {
  addAdminPage.DateOfBirtBoxOnAddadmin.sendKeys("12121993");
  WaitUtils.waitFor(3);

 }

 @Then("fill out the phone number")
 public void fill_out_the_phone_number() {

  addAdminPage.PhoneNumberOnBoxAddadmin.sendKeys("534-643-5431");
  WaitUtils.waitFor(3);
 }

 @Then("fill out the SSN number")
 public void fill_out_the_ssn_number() {

  addAdminPage.SsnNumberBoxOnAddadmin.sendKeys("321-53-4673");
  WaitUtils.waitFor(3);
 }

 @Then("fill out the User Name")
 public void fill_out_the_user_name() {

  addAdminPage.UserNameBoxOnaddadmin.sendKeys(faker.name().username());
  WaitUtils.waitFor(3);
 }

 @Then("fill out the password")
 public void fill_out_the_password() {
  addAdminPage.PasswordBoxOnAddadmin.sendKeys("Ya123456");
  WaitUtils.waitFor(3);
 }

 @Then("fill out the name")
 public void fill_out_the_name() {
  addAdminPage.NameBoxOnAddadmin.click();
  addAdminPage.NameBoxOnAddadmin.sendKeys("Ahmet");
  WaitUtils.waitFor(3);
 }

 @Then("click the surname box")
 public void click_the_surname_box() {

  addAdminPage.SurnameBoxOnAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("click the birth place")
 public void click_the_birth_place() {

  addAdminPage.BirthPlaceBoxOnAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("click the date of birth")
 public void click_the_date_of_birth() {
  addAdminPage.DateOfBirtBoxOnAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("click the phone number")
 public void click_the_phone_number() {
  addAdminPage.PhoneNumberOnBoxAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("click the SSN number")
 public void click_the_ssn_number() {
  addAdminPage.SsnNumberBoxOnAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("fill out with invalid SSN number")
 public void fill_out_with_invalid_ssn_number() {
  addAdminPage.SsnNumberBoxOnAddadmin.sendKeys("12-53-64382");
  WaitUtils.waitFor(3);
 }

 @Then("fill out with invalid SSN number in {string} digits")
 public void fill_out_with_invalid_ssn_number_in_digits(String string) {
  addAdminPage.SsnNumberBoxOnAddadmin.sendKeys("12345678");
  WaitUtils.waitFor(3);

 }

 @Then("click the User Name")
 public void click_the_user_name() {
  addAdminPage.UserNameBoxOnaddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("fill out the password in {string} digits")
 public void fill_out_the_password_in_digits(String string) {
  addAdminPage.PasswordBoxOnAddadmin.sendKeys("1234567");
 }

 @Then("click the password")
 public void click_the_password() {
  addAdminPage.PasswordBoxOnAddadmin.click();
  WaitUtils.waitFor(3);
 }

 @Then("fill out the password without uppercase")
 public void fill_out_the_password_without_uppercase() {
  addAdminPage.PasswordBoxOnAddadmin.sendKeys("ya123456");
 }

 @Then("fill out the password without lowercase")
 public void fill_out_the_password_without_lowercase() {
  addAdminPage.PasswordBoxOnAddadmin.sendKeys("YA123456");
 }

 @Then("fill out the password without number")
 public void fill_out_the_password_without_number() {
  addAdminPage.PasswordBoxOnAddadmin.sendKeys("YunusAhmet");
 }

 @Then("click the submit button to add admin")
 public void click_the_submit_button_to_add_admin() {
  addAdminPage.SubmitButtonOnAddadmin.click();

  WaitUtils.waitFor(3);
 }


}