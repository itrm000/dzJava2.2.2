public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 72; /* вес */
        float weight = 167;  /* рост */
        float index = service.calculate(growth, weight);
        System.out.println(index);

    }

}
