public class Exe06 {
    public static void main (String[] args) {

        int m, s;

        for (m = 0; m <= 2; m++) {
            for (s = 0; s < 60; s++){
                 if (s < 10) {
                    System.out.println (m + ":0" + s);
                 }
                 else {
                    System.out.println (m + ":" + s);
                 }
            }
        }

    }
}
