public class BonusMilesService {
    public int calculate(int cost) {
        int oneMile = 20;
        int bonusMiles = cost / oneMile;
        return bonusMiles;
    }
}
