### Info

This project exercises [testng dataProviders](http://testng.org/doc/documentation-main.html#parameters-dataproviders)

  * Excel 2003 OLE documents - Horrible SpreadSheet Format [org.apache.poi.hssf.usermodel.*)](http://shanmugavelc.blogspot.com/2011/08/apache-poi-read-excel-for-use-of.html)
  * Excel 2007 OOXML (.xlsx) - XML SpreadSheet Format [org.apache.poi.xssf.usermodel.*](http://howtodoinjava.com/2013/06/19/readingwriting-excel-files-in-java-poi-tutorial/)
  * OpenOffice SpreadSheet (.ods) [example1](http://www.programcreek.com/java-api-examples/index.php?api=org.jopendocument.dom.spreadsheet.Sheet) ,[example 2]http://half-wit4u.blogspot.com/2011/05/read-openoffice-spreadsheet-ods.html
  * Custom JSON [org.json.JSON](http://www.docjar.com/docs/api/org/json/JSONObject.html)
  * csv [testnt csv file](http://stackoverflow.com/questions/26033985/how-to-pass-parameter-to-data-provider-in-testng-from-csv-file)
  * fillo [fillo](http://codoid.com/fillo/)

### Testing

For testing the data providers a Selenium test case is run with every supported data provider. The test inputs are defined as table with colums

| ID |  SEARCH | COUNT |
|----|---------|-------|
| 1  | junit   | 100   |

which are the test `ID`, the seach term and expected minimum number of articles found on the forum.
 
### Links

 * [MySQL testng dataprovider](https://github.com/sskorol/selenium-camp-samples/tree/master/mysql-data-provider)
 * [xml testng DataProviders](http://testngtricks.blogspot.com/2013/05/how-to-provide-data-to-dataproviders.html)
 * [javarticles.com](http://javarticles.com/2015/03/example-of-testng-dataprovider.html)
 * [testng-users forum](https://groups.google.com/forum/#!topic/testng-users/J437qa5PSx8)
 * [passing parameters to provider via Method](http://stackoverflow.com/questions/666477/possible-to-pass-parameters-to-testng-dataprovider)
 * [JUnitPatams](https://github.com/Pragmatists/JUnitParams) - TestNg-style `JUnitParamsRunner` and `ParametersProvider` classes.
 * [testng samples](https://habrahabr.ru/post/121234/)
 * [barancev/testng_samples](https://github.com/barancev/testng_samples)
 * [ahussan/DataDriven](https://github.com/ahussan/DataDriven)
 * [poi ppt](https://www.tutorialspoint.com/apache_poi_ppt/apache_poi_ppt_quick_guide.htm)
 * [paypal/SeLion data providers](https://github.com/paypal/SeLion/tree/develop/dataproviders/src/main/java/com/paypal/selion/platform/dataprovider)
 * [RestAPIFramework-TestNG/.../ExcelLibrary](https://github.com/hemanthsridhar/RestAPIFramework-TestNG/blob/master/src/main/java/org/framework/utils/ExcelLibrary.java)
 * [GladsonAntony/WebAutomation_Allure ExcelUtils.java](https://github.com/GladsonAntony/WebAutomation_Allure/blob/master/src/main/java/utils/ExcelUtils.java)
 * [sskorol/tesst-data-supplier](https://github.com/sskorol/test-data-supplier)
 * [converting gradle to pom](https://stackoverflow.com/questions/12888490/gradle-build-gradle-to-maven-pom-xml)
 * [using gradle maven plugin to produce pom.xml](https://stackoverflow.com/questions/17281927/how-to-make-gradle-generate-a-valid-pom-xml-file-at-the-root-of-a-project-for-ma)

### Author
[Serguei Kouzmine](kouzmine_serguei@yahoo.com)
