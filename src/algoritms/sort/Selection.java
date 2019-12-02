package algoritms.sort;

public class Selection implements Sort {
    @Override
    public void sort(int[] element) {
        int min;
        for(int i = 0; i < element.length -1; i++){
            min = i;
           for (int j = min+1; j< element.length-1; j++){
               if (element[j] < element[min])
                   min = j;
               int tmp = element[i];
               element[i] = element[min];
               element[min] = tmp;
           }
        }

    }
}
