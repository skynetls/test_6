import java.io.*;

class task_16 {
    public static void main(String[] args) {
        String s;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, по окончание ввода текста обозначте строкой 'stop'");

        try (FileWriter w = new FileWriter("text.txt")) {
            do {
                System.out.print(": ");
                s = r.readLine();

                if (s.trim().compareTo("stop") == 0)
                    break;

                w.write(s + "\r\n");
            }
            while (s.trim().compareTo("stop") != 0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}
