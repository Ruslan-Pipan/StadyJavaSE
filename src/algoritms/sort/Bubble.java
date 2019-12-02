package algoritms.sort;

public class Bubble implements Sort {
    @Override
    public void sort(int[] element) {
        for (int i = 0; i < element.length; i++){
            for(int j = 0; j < element.length - 1; j++){
                if (element[j] > element[j+1]){
                    int box = element[j];
                    element[j] = element[j+1];
                    element[j+1] = box;
                }
            }
        }
    }
}
