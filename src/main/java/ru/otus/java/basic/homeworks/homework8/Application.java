package ru.otus.java.basic.homeworks.homework8;

public class Application {
    public static void main(String[] args) {

        try {
            checkArray(new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}});
        } catch (AppArraySizeException size){
            System.out.println(size.getMessage());
        } catch (AppArrayDataException data){
            System.out.println(data.getMessage());
        }
    }

    public static int checkArray(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int[][] result = new int[arr.length][arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new AppArraySizeException(arr);
                }
                if (!(arr[i][j].matches("[0-9]+"))){
                    throw new AppArrayDataException(arr,i,j);
                }
                result[i][j] = Integer.parseInt(arr[i][j]);
                sum += result[i][j];
            }
        }
        System.out.println("Массив корректен, сумма элементов массива равна: " + sum);
        return sum;

    }
}


