import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.squareСalculate(200, 300);
        System.out.println(count);

    }
}
