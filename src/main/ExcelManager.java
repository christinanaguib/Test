import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class ExcelManager {

    public List<List<String>> ReadFromExcel(String Path, String sheetname) throws IOException {

        List<List<String>> Data = new ArrayList<>();
//        function to read from Excel
        FileInputStream fileInputStream = new FileInputStream(Path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetname);


// Iterate over the rows in the sheet
        for (Row row : sheet) {
            List<String> DataRow = new ArrayList<String>();
            int rowNum = row.getRowNum();
//            check if the row is empty
            if (row.getPhysicalNumberOfCells() == 0) {
                continue;
            }
            // Skip the row if the row number is zero
            if (rowNum == 0) {
                continue;
            }
            // Iterate over the cells in the row
            for (Cell cell : row) {
//               Get the value of the cell as a string
                if (cell.getCellType() == CellType.STRING) {
                    try {
                        var ImageData = getImageData(cell.getStringCellValue());
                        DataRow.add(ImageData[0]);
                        DataRow.add(ImageData[1]);
                        DataRow.add(ImageData[2]);
                    } catch (FileNotFoundException e) {
                        String value = cell.getStringCellValue();
                        // Do something with the value
                        DataRow.add(value);
                    }
                } else if (cell.getCellType() == CellType.NUMERIC) {
//                  without the .0 so 2 -> 2.0 should be 2
                    String value = String.format("%.0f", cell.getNumericCellValue());


                    // Do something with the value
                    DataRow.add(value);
                }


            }

            DataRow.add(String.valueOf(rowNum));
            Data.add(DataRow);


        }
        workbook.close();
        return Data;
    }

    public String generateRandomNumber(int digits, String txtBefore, String txtAfter) {
//    this function generates random number with specific digits and add text before and after the number
        long min = (long) Math.pow(10, digits - 1);
        long max = (long) Math.pow(10, digits) - 1;
        long range = max - min + 1;
        long fraction = (long) (range * Math.random());
        long randomNumber = fraction + min;
        String randomNum = "" + randomNumber;
        return txtBefore + randomNumber + txtAfter;
    }

    public static String[] getImageData(String name) throws IOException {
        File image = new File("src/resources/Attachment/" + name);
        FileInputStream ImageInputStream = new FileInputStream(image);
        byte[] imageBytes = IOUtils.toByteArray(ImageInputStream);
        String base64 = Base64.getEncoder().encodeToString(imageBytes);
//    get file type and name and return them in array
        String[] fileType = name.split("\\.");
        String[] data = new String[3];
        data[0] = base64;
        data[1] = image.getName();
        data[2] = fileType[1];

        return data;

    }

    public void WriteStatusCode(String Path, String StatusCode, int RowNum, String sheetName) throws IOException {
//        function to write to Excel
        FileInputStream fileInputStream = new FileInputStream(Path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(RowNum);
        int lastCell = row.getLastCellNum();
        Cell cell = row.createCell(lastCell);
//       get index of last cell in header row
        Row headerRow = sheet.getRow(0);
        int lastCellIndex = headerRow.getLastCellNum();
        if (lastCellIndex == lastCell) {
            cell = row.createCell(lastCell - 1);
            cell.setCellValue(StatusCode);
        } else {
            cell.setCellValue(StatusCode);
        }


//save changes
        workbook.write(new FileOutputStream(Path));
        workbook.close();

    }
}
