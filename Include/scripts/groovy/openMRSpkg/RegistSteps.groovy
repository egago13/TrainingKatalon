package openMRSpkg
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class RegistSteps {

	@Given ("As a user that succeeds in Login")
	def loginSucceed() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.urlOpenMRS)
		WebUI.setText(findTestObject('Object Repository/LoginObject/LoginUname'), GlobalVariable.validUsername)
		WebUI.setText(findTestObject('Object Repository/LoginObject/LoginPwd'), GlobalVariable.validPassword)
		WebUI.click(findTestObject('Object Repository/LoginObject/SessionLocation'))
		WebUI.click(findTestObject('Object Repository/LoginObject/LoginBtn'))
	}
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("the user is on Home Page")
	def isInHP() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/HpObject/Homepage'), 5)
	}

	@When("I click on Register a Patient menu")
	def clickRegister() {
		WebUI.click(findTestObject('Object Repository/RegisterObject/RegistMenu'))
	}

	@And("I input the First Name (.*)")
	def inputFirstName(String FirstName) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/GiveName'), FirstName)
	}

	@And("Input the Family Name (.*)")
	def inputFamilyName(String FamilyName) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/FamilyName'), FamilyName)
	}

	@And("I click on Next button")
	def clickNextBtn() {
		WebUI.click(findTestObject('Object Repository/RegisterObject/NextBtn'))
	}

	@And("I select the Gender")
	def selectGender() {
		WebUI.click(findTestObject('Object Repository/RegisterObject/GenderOpt'))
	}

	@And("I input the Day of Birthday (.*)")
	def inputDBday(String DBday) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/BdayField'), DBday)
	}

	@And("I select the Month of Birthday")
	def selectMBday() {
		TestObject dropdownMBday = findTestObject('Object Repository/RegisterObject/BmonthFiled')
		WebUI.selectOptionByIndex(dropdownMBday, 7)
	}

	@And("I input the Year of Birthday (.*)")
	def inputYBday(String YBday) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/ByearField'), YBday)
	}

	@And("I input the Address (.*)")
	def inputAddress(String Address) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/Address1'), Address)
	}

	@And("I input the Phone Number (.*)")
	def inputPHNum(String PHNum) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/PhNum'), PHNum)
	}

	@And("I select the Relation")
	def selectRelation() {
		TestObject dropdownRlt = findTestObject('Object Repository/RegisterObject/Relation')
		WebUI.selectOptionByValue(dropdownRlt, "8d91a210-c2cc-11de-8d13-0010c6dffd0f-A", false)
	}

	@And("I input the Person Name (.*)")
	def inputPName(String PName) {
		WebUI.setText(findTestObject('Object Repository/RegisterObject/PName'), PName)
	}

	@And("I click on Confirm button")
	def clickConfirmBtn() {
		WebUI.click(findTestObject('Object Repository/RegisterObject/SubmitBtn'))
	}

	@Then("I verify the Patient Name (.*)")
	def verifyPatName(String FirstName) {
		WebUI.verifyElementText(findTestObject('Object Repository/RegisterObject/PatName'), FirstName)
		WebUI.closeBrowser()
	}
}