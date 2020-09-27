public class BmiService {
    public float calculate(float growth, float weight) {
        float index = growth / ((weight * weight) / 100 / 100);

        return index;
    }
}

