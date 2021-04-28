package homework2;

public class Main {
    public static void main(String[] args) {
        String[][] strArr = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "c", "3", "4"},
                //{"1", "2", "3", "4"},
        };

        try {
            checkArray(strArr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArray(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        if (strArr.length != 4 || strArr[0].length != 4) {
            throw new MyArraySizeException("The size of the array is not 4x4!");
        }
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Can't convert String \"" + strArr[i][j] + "\" to type int in cell " + (j + 1) + "x" + (i + 1));
                }
            }
        }
        System.out.println("The sum is " + sum);
    }
}