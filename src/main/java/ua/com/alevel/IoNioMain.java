package ua.com.alevel;

import ua.com.alevel.crud.CrudFileService;
import ua.com.alevel.crud.JsonTest;
import ua.com.alevel.crud.ReadWriteFile;
import ua.com.alevel.crud.SerialUser;

public class IoNioMain {

    private static final String FILE_NAME = "test.txt";
    private static final String DIR_NAME = "test1";
    private static final String ROOT_DIR_NAME = "test1/test2/test3";

    public static void main(String[] args) {
//        CrudFileService service = new CrudFileService();
//        service.createIO(ROOT_DIR_NAME);
//        service.createNIO(ROOT_DIR_NAME);
//        service.readAllFiles(DIR_NAME);

//        ReadWriteFile readWriteFile = new ReadWriteFile();
//        readWriteFile.readFile(FILE_NAME);

//        SerialUser serialUser = new SerialUser();
//        serialUser.test();

        JsonTest jsonTest = new JsonTest();
        jsonTest.someJson();
    }
}
