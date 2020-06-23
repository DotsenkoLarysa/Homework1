import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Task1 task1 = new Task1();
        task1.readStream("input.txt");

        Task2 task2 = new Task2();
        task2.countStream("number.txt");
    }
}
