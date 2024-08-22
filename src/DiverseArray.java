public class DiverseArray {
    public static int arraySum(int[] array){
        int sum = 0;
        for (int x: array){
            sum+= x;
        }
        return sum;
    }

    public static int[] rowSums(int[][] array){
        int[] rowSums = new int[array.length];
        for (int i=0; i<array.length; i++){
            int[] currentRow = array[i];
            rowSums[i] = arraySum(currentRow);
        }
        return rowSums;
    }

    public static boolean isDiverse(int[][] array){
        boolean isUnique = true;
        int[] rowSums = rowSums(array);
        for (int i=0; i<rowSums.length; i++){
            int currentVal = rowSums[i];
            for (int j=0; j<rowSums.length; j++){
                if (i!=j && rowSums[j]==currentVal){
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }




}
