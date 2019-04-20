package matrix;

public class MatrixSnake {
    public void createMatr(int size){
        int[][] array = new int[size][size];

        int i = 1, j, k, p = size/2;
        for(k = 1; k <= p; k++)                 /*Цикл по номеру витка*/
        {
            for (j = k-1; j < size-k+1; j++) {
                array[k - 1][j] = i++;          /*Определение значений верхнего гор столбца*/
            }
            for (j = k; j < size-k+1; j++) {
                array[j][size - k] = i++;       /* --//-- По правому вертикальному столбцу*/
            }
            for (j = size-k-1; j>= k-1; --j) {
                array[size - k][j] = i++;       /* --//-- по нижнему горизонтальному столбцу*/
            }
            for (j = size-k-1; j >= k; --j) {
                array[j][k - 1] = i++;          /* --//-- по левому вертикальному столбцу*/
            }
        }

        if (size%2 == 1) array[p][p]=size*size;

        for(i=0;i<size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
