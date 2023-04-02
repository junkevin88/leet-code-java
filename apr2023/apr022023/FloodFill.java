package apr2023.apr022023;

public class FloodFill  {
    private void dfs(int[][] image, int sr, int sc, int oldColor, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr + 1, sc, oldColor, color);
        dfs(image, sr - 1, sc, oldColor, color);
        dfs(image, sr, sc + 1, oldColor, color);
        dfs(image, sr, sc - 1, oldColor, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            dfs(image, sr, sc, oldColor, color);
        }
        return image;



    }
}
