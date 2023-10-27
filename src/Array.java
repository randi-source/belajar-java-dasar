public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        String[] stringAray2 = new String[3];

        String[] namaNama = {
                "Eko","Kurniawan","Khannedy"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0]);
        System.out.println(members[1][0]);
        // https://www.youtube.com/watch?v=jiUxHm9l1KY&list=PL-CtdCApEFH-p_Q2GyK4K3ORoAT0Yt7CX
        // 1.42.35

    }
}
