public class Main {
    public static void main(String[] args) {
//        int[] array = new int[] {3905, 3740, 3071, 3417, 3826, 3719, 3130, 3192, 3078, 3276};
        sortVoids sv = new sortVoids();

        sv.bubbleSort(sv.genArray());
        sv.insertSort(sv.genArray());
        sv.selectSort(sv.genArray());

    }
}