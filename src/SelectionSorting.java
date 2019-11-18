public class SelectionSorting {

    private int[] array;

    public SelectionSorting(int[] array){
        this.array = array;
    }

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<array.length; out++) // Внешний цикл
        {
            min = out;
            for(in=out+1; in<array.length; in++) // Внутренний цикл
                if(array[in] < array[min] )
                    min = in;
            swap(out, min);
        }
    }


    private void swap(int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

}
