public class App {
    public static void main(String[] args) {
        int num = 5;
        int tableValue = 10;

        System.out.printf("Tabela de multiplicação de %d\n", num);

        for (int i = 0; i <= tableValue; i++) {
            System.out.printf("%d x %d = %d \n", num, i, num * i);
        }
    }
}
