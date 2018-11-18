import java.io.*;

public class task_15 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader t = new BufferedReader(new FileReader("text.txt"))) {
            while ((s=t.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException exc){
            System.out.println("Ошибка вводв/вывода: " + exc);
        }
    }
}
