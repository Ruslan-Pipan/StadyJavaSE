package tasks.string.swapWords;
/*
* В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
*
* */
public class Main {
    public static void main(String[] args) {
        String s1 = "Королева Книг. Що трапилося, Книжечко? Хто тебе образив?";
        String s2 = "Що, «він кинув на підлогу книжку «Рідна мова».";
        String s3 = "Що втекло від баби з дідом, не сиділось на вікні,";
        System.out.println(s2);
        System.out.println(swaplasntWordWhihtFirst(s2));
    }

    private static String swaplasntWordWhihtFirst(String str){
        StringBuilder sB = new StringBuilder();
        str.trim();

        boolean flak = true;
        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ") + 1;
        int lastIndex = str.length();

        while (flak){
            flak = false;
            if (str.charAt(firstSpace - 1) == '«' || str.charAt(firstSpace - 1) == '?' || str.charAt(firstSpace - 1) == '.' || str.charAt(firstSpace - 1) == ',' ){
                firstSpace--;
                flak =true;
            }

            if (str.charAt(lastIndex - 1) == '?' || str.charAt(lastIndex - 1) == '.' || str.charAt(lastIndex - 1) == '»'){
                lastIndex--;
                flak =true;
            }
            if (flak == false)
                break;
        }

        sB.append(str.substring(lastSpace,lastIndex)).append(str.substring(firstSpace,lastSpace)).append(str.substring(0,firstSpace));
        if (flak != true)sB.append(str.substring(lastIndex, str.length()));
        return sB.toString();
    }
}
