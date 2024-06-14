public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "qw"},
                {"5", "6", "7", "8"},
                {"1", "3", "2", "0"},
                {"3", "1", "0", "0"}
        };

        try {
            int sum = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}
