class Jaggad {
    public static void main(String[] args){
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[5];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[2][0] = 6;
        arr[2][1] = 6;
        arr[2][2] = 6;
        arr[2][3] = 6;
        arr[2][4] = 6;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
