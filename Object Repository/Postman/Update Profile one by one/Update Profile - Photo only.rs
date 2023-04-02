<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Profile - Photo only</name>
   <tag></tag>
   <elementGuidId>0747a2a8-ce0d-4e8c-af7e-555a23a83d06</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiNDcwMDdlNThiZTFiNjcxNThhNDMyZmIwOTBkOWMwMjcyYTU1ZjA2NzM1MzQ4ZjcwMDAzZjZlYmZiY2ZlYmRmMTYzOGI5MTFiZjM0MTkyNDQiLCJpYXQiOjE2NjcyNjc1MzEuNDMzNTQ3LCJuYmYiOjE2NjcyNjc1MzEuNDMzNTUxLCJleHAiOjE2OTg4MDM1MzEuNDMyMDM4LCJzdWIiOiI2NCIsInNjb3BlcyI6W119.Yp4ktnm01YeJj7GzAL8gdQqIatRaTpwEC5bELXCfJHSzMcSWBLR9vDY4yGA6aLo7mUfMPNHtr9wAWpJDygVzsAZwDi7f-HiUFgfz3YRDLRm2DZVFboVUCxe5lY2al-8iHEvNVhYJY3M7C__ZkACbpcry9wygNtpxOrfIRTz6B7E4neXQOSFf8uV7kDWfzrJWuWb0zNw0Oq_9PGAuxQZYsd41d-7AP7vkD8Z1guVCvxa5PHtUdSRPevWMbAXn3red01iJqApgA9KMTAcjlNMUFuT5zhBW0XALxX_b4blG_uK1XkW7D3ayEo9pr6rAcQO5cZUR7dMM9yK5mbkr6c-gmFPzr5c41lvKAgekOp0QWk66EADibrpo0x2CwnMnmMb7M4zeLqMhJRg0K4FCLTXOJUlBTWiN3ZMJRqyowvHfpEXF7Zuan8cPk456H9jRMYO7CYy9WmdiVi0y890wDKOxufuIW6miGtolBBWcZ2vZ3HHIhAzXeLXia42M8TYEY_GZ6xpk1xgQRdnTM1p-4TwFi2yULIEZP3SVQrahyesXpynNV2yz_eA7X18afuw7htnWsdd6rgmAhZ_ZS6HJqIgykbvNFDnfnsb73VLhguNshUYstgEclaZxBF8nVmvxjvcjlMjxY1PcLkEdKWswYqiZ-oJ0Vlr9rdBTHctBdGyruLM</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;photo&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <webElementGuid>e4b11d53-e97f-4d7c-a6f7-08a926bea813</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${auth_token}</value>
      <webElementGuid>83feebac-115c-4bf0-b592-c5bffdf13cc6</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://demo-app.online/api/updateprofile</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
