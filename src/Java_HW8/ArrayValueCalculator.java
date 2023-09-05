package Java_HW8;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        try {
            System.out.println(doCalc(new String[][]{{"2", "4", "6", "8"}, {"1", "2", "3", "4"}, {"6", "3", "9", "2"}, {"12", "15", "11", "18"}}));
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

    }
    public static int doCalc (String[][] arr) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) throw new ArraySizeException("Error, matrix size isn't 4x4");
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Error, matrix contains incorrect data", e);
                }
            }
        }
        return sum;
    }
}
