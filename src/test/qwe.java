package test;

/**
 * Класс сортирует массива целых чисел
 * Включает вывод неотсортированного и отсортированного массива
 * @author Vasilyev Timofey
 * @version 1.0
 */
public class qwe {

    /**
     * Главный метод программы. Создает и сортирует массив целых чисел
     *
     * @param args не используется
     */
    public static void main(String[] args) 
    {
        // Инициализация массива
        int[] arr = {19, 2, -2, 9082374, 124, -2, 47};

        // Вывод неотсортированного массива
        System.out.println("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        System.out.println("\n");

        // Сортировка массива
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
    }
}
