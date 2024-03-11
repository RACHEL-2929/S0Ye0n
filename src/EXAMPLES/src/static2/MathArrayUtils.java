package static2;

public class MathArrayUtils {
    private MathArrayUtils(){}
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values)/values.length;
        /*int total = 0;
        for (int value : values) {
            total += value;
        }
        return total/values.length;  이렇게 말고 한줄로 적을 수 있다*/
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

}
