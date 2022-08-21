package Week01;

class SolutionFloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int temp = image[sr][sc];
        image[sr][sc] = color;
        if (sr+1 < image.length && image[sr+1][sc] == temp){
            floodFill(image, sr+1, sc, color);
        }if (sc+1 < image[sr].length &&image[sr][sc+1] == temp){
            floodFill(image, sr, sc+1, color);
        }if (sr-1 >= 0 && image[sr-1][sc] == temp){
            floodFill(image, sr-1, sc, color);
        }if (sc-1 >= 0 && image[sr][sc-1] == temp){
            floodFill(image, sr, sc-1, color);
        }
        return  image;
    }
}
public class FloodFill {
    public static void main(String[] args) {
        SolutionFloodFill sol = new SolutionFloodFill();
        int[][] arr = {{1,1,1}, {1,1,0}, {1,0,1}};
        sol.floodFill(arr, 1 ,1 ,2);
    }
//    Runtime: 1 ms, faster than 90.78% of Java online submissions for Flood Fill.
//    Memory Usage: 48.3 MB, less than 32.02% of Java online submissions for Flood Fill.
}
