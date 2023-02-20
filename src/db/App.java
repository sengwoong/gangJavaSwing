package db;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        EmpService empService = EmpService.getInstance();
        List<EmpDto> empDtoList = empService.getEmpDtoList();

       System.out.println(empDtoList);
       
    }
 
    }

