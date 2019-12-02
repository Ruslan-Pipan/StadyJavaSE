package algoritms.sort;

public class Insertion implements Sort {

    @Override
    public void sort(int[] element) {
        for (int i = 0; i < element.length -1; i++){
            int key = element[i];
            int j = i-1;
            while (j >=0 && key < element[j]){
                element[j+1] = element[j];
                j--;
            }
            element[j+1] = key;
        }
    }
}
