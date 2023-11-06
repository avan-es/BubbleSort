import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {
    int[] array;

    BubbleSort (int size) {
        this.array = new int[size];
        for (int i = 0; i < size-1; i++) {
            this.array[i] = ThreadLocalRandom.current().nextInt(-1000, 1000);
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    //Метод сортировки
    public void bubbleSort() {
        //Внешний цикл - обратный - отвечает за количество проходов для сортировки
        for (int i = array.length - 1; i > 0; i--) {
            //Внутренний цикл. За каждый проход отсортировывает ровно 1 элемент (перемещает его в правую часть массива)
            for (int j = 0; j < i; j++) {
                //Если текущий элемент больше следующего, то поменять их местами
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
