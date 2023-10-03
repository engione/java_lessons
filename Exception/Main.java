public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"9", "2", "1", "0"},
                                        {"2", "5", "10", "3"},
                                        {"1", "4", "2", "6"},
                                        {"3", "5", "7", "1"}};
        try {
            try {
                int result = arrSize(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива");
            }
        }catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

    public static int arrSize(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;

    }

}