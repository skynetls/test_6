import java.io.*;

public class task_15 {
    public static void main(String[] args) {
    String S;
    try (BufferedReader t = new BufferedReader(new FileReader("text.txt"))) {
     while ((S=t.readLine()) != null) {
         System.out.println(S);
     }
    }
    catch (IOException exc){
        System.out.println("Ошибка вводв/вывода: " + exc);
    }
    }
}
