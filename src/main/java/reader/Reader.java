package reader;

import java.util.Scanner;

/**
 * Используется для чтения текста из консали
 */
public class Reader {
    /**
     * Метод чтения текста из консоли
     * @return
     */
    public String readString() {

        Scanner in = new Scanner(System.in);
        return in.next();

    }
}
