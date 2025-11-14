 class BiggestAndSecondBiggest {
    public static void main(String[] args) {
        int a[] = {80, 80, 43, 50, 38, 63, 58, 80};
        printBiggestAndSecondBiggest(a);
    }

    public static void printBiggestAndSecondBiggest(int a[]) {
        int biggest = Integer.MIN_VALUE;
        int sBiggest = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > biggest) {
                sBiggest = biggest;
                biggest = x;
            } else if (x > sBiggest && x != biggest) {
                sBiggest = x;
            }
        }

        System.out.println("The Biggest Element is: " + biggest);
        System.out.println("The Second Biggest Element is: " + sBiggest);
    }
}
