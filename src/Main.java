public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0;i < arr.length ; i ++){
            arr[i] = i;

            int[] scores = new int[]{100,90,66};
            for (int p = 0 ; p < scores.length ; p ++){
                System.out.println(scores[p]);

            for (int score: scores)
                System.out.println(score);
            }
        }

    }
}
