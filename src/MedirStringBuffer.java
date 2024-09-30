public class MedirStringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();

        for (int i = 0; i<20000000; i++){
            sb.append("table");
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de StringBuffer " + (end-start));
    }
}
