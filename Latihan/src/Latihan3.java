public class Latihan3 {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 50; i++){
            if (i % 3 == 0) continue;
            if (i % 5 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
