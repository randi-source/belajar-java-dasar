public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // number overflow, setelah dikonversi, mentok 127, balik ke -127 sampai mentok lagi dan begitu terus sampai angka nya habis
    }
}
