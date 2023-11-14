import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.apache.commons.compress.utils.IOUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CreateInheritanceTest extends TestBase {


    static ExcelManager excelManager = new ExcelManager();


//    validate the API call and return the response
//    given - prepare the request
//    when - send the request
//    then - validate the response

    //    creat main method
    @Parameters({"ApiIndex"})
    @Test()
    public void SetIndex(String index) {
        LoadPropertiesFile.setIndex(index);
    }

    @DataProvider(name = "Inheritance-provider")
    public Object[][] dataProviderMethod() throws IOException {
        excelManager = new ExcelManager();

        var lists = excelManager.ReadFromExcel(LoadPropertiesFile.ContentDir + LoadPropertiesFile.APIdata.getProperty("ExcelFileName"),
                LoadPropertiesFile.getSheetName());
        String[][] Data = new String[lists.size()][];
        String[] blankArray = new String[0];
        for (int i = 0; i < lists.size(); i++) {
            Data[i] = lists.get(i).toArray(blankArray);
        }
        return Data;
    }


    @Test(dataProvider = "Inheritance-provider")
    public static void sendApi(String[] val) throws IOException {
//         map for headers

//        read file create inheritance1.json

//read json from file as string

        String Emptyjson = new String(IOUtils.toByteArray(new FileInputStream(LoadPropertiesFile.ContentDir + LoadPropertiesFile.getJsonFileName())));
        for (String jsonValue : val) {
            Emptyjson = Emptyjson.replaceFirst("\"\"", "\"" + jsonValue + "\"");

        }

        //  destination url
        RestAssured.baseURI = LoadPropertiesFile.getAPIURL();
        String response = given().headers("Authorization", "Basic U0E6UEBzc3cwcmRAMTIzNjU0",
                        "Content-Type", "application/json",
                        "Connection", "keep-alive",
                        "Accept-Encoding", "gzip, deflate, br",
                        "Accept", "*/*")
                .body(Emptyjson)
                .when().post("")
                .then().extract().response().asString();
//        write response to properties file
        JsonPath js = new JsonPath(response);
//        pretty print the response
        System.out.println(js);
        String code = js.getString("code");

        int Rownumber = Integer.parseInt(val[val.length - 1]);

          excelManager.WriteStatusCode(LoadPropertiesFile.ContentDir +LoadPropertiesFile.APIdata.getProperty("ExcelFileName"), code, Rownumber , LoadPropertiesFile.getSheetName());

    }


}


