package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber (float numberToBeRounded) {
        int roundToFloor = (int) Math.floor(numberToBeRounded);
        System.out.println(roundToFloor);
        int roundToCeil = (int) Math.ceil(numberToBeRounded);
        System.out.println(roundToCeil);
    }


    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        float number = 19.5F;
        floatTypeCasting.roundNumber (number);

    }
}
