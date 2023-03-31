import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequest(findTestObject('Postman/Login', [('email') : 'cihek19445@hempyl.com', ('password') : 'P@ssw0rd']))

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String token = parsedJson.success.token

auth_token = token

updateProfileResponse = WS.sendRequest(findTestObject('Postman/Update Profile one by one/Update Profile - Name only', [('name') : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia dicta aut exercitationem a nostrum beatae ex praesentium inventore facere ea nesciunt id, maiores, animi rem nisi? Eaque fugit, quaerat alias ullam earum voluptatibus sit numquam commodi eos excepturi sint! Amet possimus magni suscipit dolorem, facilis voluptatibus culpa corrupti quod quisquam distinctio quidem minus autem eaque consectetur, non reprehenderit maiores quo soluta quos et nisi ipsam? Eos omnis officiis ex expedita dolor nemo? Nihil, aut sunt. Consequatur laboriosam perspiciatis sunt voluptatem recusandae obcaecati consectetur odio quae animi praesentium quaerat, amet est architecto dolore dolores mollitia deserunt. Libero eaque sequi quibusdam dolorum! Nihil nisi, minima dolores sunt expedita temporibus voluptatibus debitis voluptas ratione deleniti autem eius est quasi obcaecati voluptatum quae, velit sit nulla praesentium laborum voluptates aspernatur corrupti? Facilis expedita ut quod adipisci aspernatur ratione, eaque, earum, rerum error molestias maxime ipsum voluptatem deserunt velit dolores. Accusamus voluptate, eos, cumque laborum ipsum facere doloremque ratione ea exercitationem quam perferendis debitis delectus est placeat incidunt eligendi nam, vero et voluptatum. Fugit quibusdam explicabo aliquam! Voluptatum quis quidem cupiditate excepturi amet dignissimos architecto non, eos magnam distinctio, dicta perspiciatis nulla laudantium saepe, adipisci ut? Asperiores veniam ea, in cum qui obcaecati voluptates tenetur labore, fuga aspernatur modi voluptas saepe rem? Dolorum animi alias veritatis natus, unde enim ad cumque explicabo dolor odit quasi iste quam laborum facere rem nisi cum blanditiis commodi ducimus, impedit rerum magnam? Minus, mollitia fuga libero, possimus nulla adipisci qui totam, accusantium est exercitationem reiciendis deleniti repellat. Qui voluptas nisi quas eos ipsa expedita cumque!']))
 
WS.verifyResponseStatusCode(updateProfileResponse, 200)

