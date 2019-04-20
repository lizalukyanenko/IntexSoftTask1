package matrix;

public class MatrixPyramid {
    public void createMatr(int size){
        int[][] array = new int[size][size];

        int i = 1, j, k, p = size/2;
        for(k = 1; k <= p; k++)                 /*Цикл по номеру витка*/
        {
            for (j = k-1; j < size-k+1; j++) {
                array[k - 1][j] = k;          /*Определение значений верхнего гор столбца*/
            }
            for (j = k; j < size-k+1; j++) {
                array[j][size - k] = k;       /* --//-- По правому вертикальному столбцу*/
            }
            for (j = size-k-1; j>= k-1; --j) {
                array[size - k][j] = k;       /* --//-- по нижнему горизонтальному столбцу*/
            }
            for (j = size-k-1; j >= k; --j) {
                array[j][k - 1] = k;          /* --//-- по левому вертикальному столбцу*/
            }
        }

        if (size%2 == 1) array[p][p]=k;

        for(i=0;i<size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
