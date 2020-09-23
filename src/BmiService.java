public class BmiService {
    public float calculate(float growth, float weight) {
        float index = growth/((weight * weight)/100/100); /* указываем рост в см, соответственно делим на 100  */

        return  index;
    }
}

//
//
//
//public class BonusMilesService {
//    public int calculate (int cost) {
//        int miles = cost / 20;
//
//        return  miles;
//    }
//
//}
//
//public class BonusService {
//
//    public long calculate(long amount, boolean registered) {
//
//        int percent = registered ? 3 : 1; /* тернарный оператор */
//        long bonus = amount * percent/ 100 / 100;
//        long limit = 500;
//        if (bonus > limit) {
//            bonus = limit;
//        }
//
//        return  bonus;
//    }
//
//}