package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.apiPage;
public class apiStep {

    apiPage apiPage;

    public apiStep(){
        this.apiPage = new apiPage();
    }
 @Given ("prepare url valid for {string}")
    public void prepareUrlValidFor(String url) {
     apiPage.prepareUrlValidFor(url);
 }
 @And ("hit api get list users")
    public void hitApiGetListUsers() {
     apiPage.hitApiGetListUsers();
 }
 @Then ("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code){
     apiPage.validationStatusCodeIsEquals(status_code);
 }
 @Then ("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
     apiPage.validationResponseBodyGetListUsers();
 }
 @Then ("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
     apiPage.validationResponseJsonWithJSONSchema(filename);
 }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUsers();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyPostCreateNewUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteNew();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }
}
