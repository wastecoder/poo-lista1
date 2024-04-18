public class Exc2 {
    public static void main(String[] args) {
        soma(100);
    }

    public static int soma(int valor){
        return valor + soma(--valor);
    }
}
