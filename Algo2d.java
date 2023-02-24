public class Algo2d {
    public int FindHighest(int[][] array){
        int highest = array[0][0];
        for(int[] x : array){
            for(int y : x){
                if(y > highest){
                    highest = y;
                }
            }
        }
        return highest;
    }
    
    public int Accumulate(int[][] array){
        int sum = 0;
        for(int[] x : array){
            for(int y : x){
                sum += y;
            }
        }
        return sum;
    }
}
