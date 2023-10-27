public class DoWhileLoop {
    public static void main(String[] args) {

        var counter = 100;

        // Walaupun kondisi tidak terpenuhi di awal, dia akan terpenuhi 1x
        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter<=10);
    }
}
