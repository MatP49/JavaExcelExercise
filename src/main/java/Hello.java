import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;


public class Hello {

    private static Workbook wb;
    private static Sheet sh;
    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static Row row;
    private static Cell cell;


    public static void main (String []args) throws Exception {
        Map clients = new HashMap();
        ArrayList myList = new ArrayList();
        fis = new FileInputStream("/home/spike/Desktop/matthis_example.xlsx");
        wb = WorkbookFactory.create(fis);
        sh = wb.getSheet("Sheet1");
        int noOfRows = sh.getLastRowNum();
        int noOfColumns = sh.getRow(0).getPhysicalNumberOfCells();
        System.out.println(noOfRows);
        System.out.println(noOfColumns);
        for (int i = 0; i < noOfRows; i++){

            for (int j = 0; j < noOfColumns; j++){
                try {
                    clients.put(sh.getRow(0).getCell(j),  sh.getRow(i+1).getCell(j));
                }
                catch (Exception e) {
                }
            }
            myList.add(clients);
            clients = new HashMap();

        }







        System.out.println(myList);
        System.out.println("Done");

    }
    }

