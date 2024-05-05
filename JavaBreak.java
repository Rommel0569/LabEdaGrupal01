public class JavaBreak {
    public static void main(String[] args) {
        //java break example
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
        }
        //java continue example
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
        }
    }
}
