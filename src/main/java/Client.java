import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;

public class Client {

        @ExcelRow
        private int rowIndex;

        @ExcelCell(0)
        private String firstName;

        @ExcelCell(1)
        private String surname ;

        @ExcelCell(2)
        private int age;

        @ExcelCell(3)
        private int size ;

        @ExcelCell(4)
        private String status ;

        @ExcelCell(5)
        private String submittedDate ;


        @Override
        public String toString() {

            return "Client{" +
                    "rowIndex=" + rowIndex +
                    ", firstName=" + firstName +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", size=" + size +
                    ", status='" + status + '\'' +
                    ", submittedDate='" + submittedDate + '\'' +
                    '}';
        }
    }

