/*Required filename: MatrixOperations.java

Implement:

    static int[] rowSums(int[][] matrix)
    static int[] columnSums(int[][] matrix)
    static int[][] add(int[][] first, int[][] second)
    static int[][] transpose(int[][] matrix)
    static int[][] multiply(int[][] first, int[][] second)
    static void printMatrix(int[][] matrix)

Requirements:

- Validate dimensions before addition and multiplication.
- Test a non-square transpose.
- Explain all three loops in multiplication.
- State complexity for each operation.
 */
public class MatrixOperations{
    public static void main(){
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{6,7,1},{7,8,2},{8,9,3}};
        int[] res1=rowSums(arr1);
        System.out.println("Row sums: ");
        for(int i=0;i<res1.length;i++){
            System.out.println("Index " + i + ": " + res1[i]);
        }

        int[] res2=columnSums(arr1);
        System.out.println("Column sums: ");
        for(int i=0;i<res2.length;i++){
            System.out.println("Index " + i + ": " + res2[i]);
        }

        int [][] res3=add(arr1, arr2);
        System.out.println("Added Matrix: ");
        printMatrix(res3);

        int[][] res4=transpose(arr1);
        System.out.println("Transposed Matrix: ");
        printMatrix(res4);

        int[][] res5=multiply(arr1, arr2);
        System.out.println("Multiplied Matrix: ");
        printMatrix(res5);
    }
    static int[] rowSums(int[][] matrix){
        int[] sumres = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int sum=0;    
            for(int j=0;j<matrix[i].length;j++){
                sum += matrix[i][j];
            }
            sumres[i] = sum;
            
        }
        return sumres;
    }
    static int[] columnSums(int[][] matrix){
        int[] sumres = new int[matrix[0].length];
        for(int j=0;j<matrix[0].length;j++){
            int sum=0;
            for(int i=0;i<matrix.length;i++){
                sum += matrix[i][j];
            }
            sumres[j] = sum;
        }
        return sumres;
    }
    static int[][] add(int[][] first, int[][] second){
        if(first.length != second.length || first[0].length != second[0].length){
            System.out.println("Error: Matrices must have same dimensions");
            return null;
        }
        int[][] result = new int[first.length][first[0].length];
        for(int i=0;i<first.length;i++){
            for(int j=0;j<first[i].length;j++){
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
    static int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] multiply(int[][] first, int[][] second){
        if(first[0].length != second.length){
            System.out.println("Error: first matrix columns must equal second matrix rows");
            return null;
        }
        int[][] result = new int[first.length][second[0].length];
        for(int i=0;i<first.length;i++){
            for(int j=0;j<second[0].length;j++){
                int mult=0;
                for(int k=0;k<second.length;k++){
                    mult += first[i][k] * second[k][j];
                }
                result[i][j] = mult;
            }
        }
        return result;
    }

}