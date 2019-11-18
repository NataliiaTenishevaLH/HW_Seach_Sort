import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Сортировка методом выбора
        int[] array = {12, 1, 10, 0, 45, 13, 50};
        SelectionSorting selectionSorting = new SelectionSorting(array);
        selectionSorting.selectionSort();
        System.out.println(Arrays.toString(array));

        //Интерполяционный поиск
        int findedElement = Main.interpolationSearch(array, 10);
        System.out.println("Индекс найденного элемента: " + findedElement);
    }


        public static int interpolationSearch(int[] integers, int elementToSearch) {

            int startIndex = 0;
            int lastIndex = (integers.length - 1);

            while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                    (elementToSearch <= integers[lastIndex])) {
                     // Формула интерполяции
                    int pos = startIndex + (((lastIndex-startIndex) /
                        (integers[lastIndex]-integers[startIndex]))*
                        (elementToSearch - integers[startIndex]));

                if (integers[pos] == elementToSearch)
                    return pos;

                if (integers[pos] < elementToSearch)
                    startIndex = pos + 1;

                else
                    lastIndex = pos - 1;
            }
            return -1;
        }

}
