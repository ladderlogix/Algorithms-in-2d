public class Algo2d {
    public static int FindHighest(int[][] array){
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

    public static int Accumulate(int[][] array){
        int sum = 0;
        for(int[] x : array){
            for(int y : x){
                sum += y;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] testArray = {{2,1,3,4,12},{1,2,3,4,5,3,4,3,3}};
        System.out.println(FindHighest(testArray));
        System.out.println(Accumulate(testArray));
    }
}
