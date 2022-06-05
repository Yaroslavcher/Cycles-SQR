import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        long min = 100;
        long max = 10001;
        long HowMny = service.HowMnySqrsWithin(min, max);
        System.out.println(HowMny + " квадрата(-ов) в диапазоне от " + min + " до " + max);
    }
}
