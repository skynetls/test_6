import java.io.*;

public class task_17 {
    public static void main(String[] args) {
        String s;
        int j = 0;
        int i = 1;
        try (BufferedReader r = new BufferedReader(new FileReader("text.txt"))) {
            while ((s = r.readLine()) != null) {
                System.out.println(s);
                j++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Запишите количество строк = " + j);
        try (FileWriter w = new FileWriter("text.txt")) {
            while (i <= j) {
                System.out.print(i + ": ");
                s = rr.readLine();
                ++i;
                w.write(s + "\r\n");
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}
