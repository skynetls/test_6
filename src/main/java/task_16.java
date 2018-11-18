import java.io.*;

class task_16 {
    public static void main(String[] args) {
        String s;
        int i;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, по окончание ввода текста обозначте строкой 'stop'");

        try (FileWriter w = new FileWriter("text.txt"))
        {
            do {
                System.out.print(": ");
                s = r.readLine();

                i = s.trim().compareTo("stop");

                if (i == 0)
                    break;

                s = s + "\r\n";
                w.write(s);
            }
            while (i != 0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}
