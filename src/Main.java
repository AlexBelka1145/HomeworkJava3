public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77; //масса в кг.
        double height = 1.70; //рост в метрах
        double index = service.calculate(weight, height);


        System.out.println((int) index);
    }
}