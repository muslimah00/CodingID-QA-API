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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.io.File as File

response = WS.sendRequest(findTestObject('Postman/Login', [('email') : 'cihek19445@hempyl.com', ('password') : 'P@ssw0rd']))

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String token = parsedJson.success.token

auth_token = token

String uploadFilePath = '/Include/Resources/'

String uploadFileName = 'cat01.jpeg'

File file = new File(RunConfiguration.getProjectDir(), uploadFilePath + uploadFileName)

println(file.getAbsolutePath())

updateProfileResponse = WS.sendRequest(findTestObject('Postman/Update Profile', [('name') : 'update name', ('whatsapp') : '1234567890'
            , ('birth_date') : '1995-05-04', ('photo') : 'C:\\Users\\ACER\\Pictures\\ProfilePic.jpg', ('bio') : 'Software Dev'
            , ('position') : 'mobile dev', ('auth_token') : 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiNDcwMDdlNThiZTFiNjcxNThhNDMyZmIwOTBkOWMwMjcyYTU1ZjA2NzM1MzQ4ZjcwMDAzZjZlYmZiY2ZlYmRmMTYzOGI5MTFiZjM0MTkyNDQiLCJpYXQiOjE2NjcyNjc1MzEuNDMzNTQ3LCJuYmYiOjE2NjcyNjc1MzEuNDMzNTUxLCJleHAiOjE2OTg4MDM1MzEuNDMyMDM4LCJzdWIiOiI2NCIsInNjb3BlcyI6W119.Yp4ktnm01YeJj7GzAL8gdQqIatRaTpwEC5bELXCfJHSzMcSWBLR9vDY4yGA6aLo7mUfMPNHtr9wAWpJDygVzsAZwDi7f-HiUFgfz3YRDLRm2DZVFboVUCxe5lY2al-8iHEvNVhYJY3M7C__ZkACbpcry9wygNtpxOrfIRTz6B7E4neXQOSFf8uV7kDWfzrJWuWb0zNw0Oq_9PGAuxQZYsd41d-7AP7vkD8Z1guVCvxa5PHtUdSRPevWMbAXn3red01iJqApgA9KMTAcjlNMUFuT5zhBW0XALxX_b4blG_uK1XkW7D3ayEo9pr6rAcQO5cZUR7dMM9yK5mbkr6c-gmFPzr5c41lvKAgekOp0QWk66EADibrpo0x2CwnMnmMb7M4zeLqMhJRg0K4FCLTXOJUlBTWiN3ZMJRqyowvHfpEXF7Zuan8cPk456H9jRMYO7CYy9WmdiVi0y890wDKOxufuIW6miGtolBBWcZ2vZ3HHIhAzXeLXia42M8TYEY_GZ6xpk1xgQRdnTM1p-4TwFi2yULIEZP3SVQrahyesXpynNV2yz_eA7X18afuw7htnWsdd6rgmAhZ_ZS6HJqIgykbvNFDnfnsb73VLhguNshUYstgEclaZxBF8nVmvxjvcjlMjxY1PcLkEdKWswYqiZ-oJ0Vlr9rdBTHctBdGyruLM']))

WS.verifyResponseStatusCode(updateProfileResponse, 200)

