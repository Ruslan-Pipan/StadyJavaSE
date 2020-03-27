package tasks.regx;

public class Main {
    public static void main(String[] args) {
        Decoder decoder = new Decoder("D:\\Флешка\\test\\ДЛЯФЛЕШМОБУ.txt");
        System.out.println(decoder.getDecoded());
    }
}
