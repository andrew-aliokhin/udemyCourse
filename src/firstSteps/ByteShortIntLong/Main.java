package firstSteps.ByteShortIntLong;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted MAX value = "+(++myMaxIntValue));
        int myMaxIntTest = 2_147_483_647;

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("My Byte Minimum Value = " + myByteMinValue);
        System.out.println("My Byte Maximum Value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("My short Minimum Value = " + myShortMinValue);
        System.out.println("My short Maximum Value = " + myShortMaxValue);

        long myLongValue = 1000L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("My long Minimum Value = " + myLongMinValue);
        System.out.println("My long Maximum Value = " + myLongMaxValue);

        byte byteValue = 52;
        short shortValue = 5445;
        int intValue = 159845;
        long longValue = 50_000L + 10L*(byteValue+shortValue+intValue);
        System.out.println("Sum = " + longValue);

    }

}
