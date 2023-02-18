public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.5;          // рост в м
        double weight = 52;           // вес в кг
        int bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi);

    }
}
