import java.util.Arrays;
public class Problem1491 {
    public double average(int[] salary) {
        double average = 0;
        Arrays.sort(salary);
        for (int i = 1 ; i < salary.length - 1 ; i++) average += salary[i];
        average /= salary.length - 2;
        return average;
    }
}
