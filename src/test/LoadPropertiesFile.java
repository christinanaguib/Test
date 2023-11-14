import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {

    String dir = System.getProperty("user.dir");

    static String ContentDir = System.getProperty("user.dir") + "\\src\\resources\\";

    FileReader reader = new FileReader(dir + "\\src\\resources\\Data.properties");

    FileReader readerAPI = new FileReader(dir + "\\src\\resources\\API.properties");
    static Properties Userdata = new Properties();

    static Properties APIdata = new Properties();


    static int APIIterator = 0;

    static int SheetIterator = 0;

    static int JsonIterator = 0;

    static String[] APiURL;
    static String[] SheetName;


    static String[] JsonFileName;


    public LoadPropertiesFile() throws IOException {
        Userdata.load(reader);
        APIdata.load(readerAPI);
    }

    public static String getAPIURL() {
        APiURL = APIdata.getProperty("APIURL").split(",");
        return APiURL[APIIterator];

    }

    public static String getSheetName() {
        SheetName = APIdata.getProperty("SheetName").split(",");
        return SheetName[SheetIterator];

    }


    public static String getJsonFileName() {
        JsonFileName = APIdata.getProperty("JsonFileName").split(",");
        return JsonFileName[JsonIterator];

    }


    public static void setIndex(String index) {
        APIIterator = Integer.parseInt(index)-1;
        SheetIterator = Integer.parseInt(index)-1;
        JsonIterator = Integer.parseInt(index)-1;

    }

}
