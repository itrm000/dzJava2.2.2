public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 86; /* вес */
        float weight = 178;  /* рост */
        float index = service.calculate(growth, weight);
        System.out.println(index);

    }

}
