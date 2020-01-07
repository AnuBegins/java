import java.lang.Math;

public class Pythagorean{
    public double calcHypotnuse(int legA, int legB) {

        int sumSquares = (legA * legA) + (legB * legB);

        double hyp = (double) Math.sqrt(sumSquares);
        return hyp;
    }

}