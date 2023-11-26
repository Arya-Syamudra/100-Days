class Dcoder {
    public static void main(String args[]) {
        int[] data = {2, 4, 1, 1, 2, 0, 2, 3};
        int length = data.length;
        int[] stack = new int[length];

        int top = -1;
        stack[++top] = 0;
        stack[++top] = length - 1;

        while (top >= 0) {
            int h = stack[top--];
            int l = stack[top--];

            int pivot = data[h];
            int i = l - 1;

            for (int j = l; j <= h - 1; j++) {
                if (data[j] < pivot) {
                    i++;

                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }

            int temp = data[i + 1];
            data[i + 1] = data[h];
            data[h] = temp;

            int p = i + 1;

            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }

        for (int x = 0; x < length; x++) {
            System.out.print(data[x]);
            if (x < length - 1) {
                System.out.print(", ");
            }
        }
    }
}
