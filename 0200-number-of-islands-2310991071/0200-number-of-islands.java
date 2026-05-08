class Solution {
    public int numIslands(char[][] grid) {

        int island = 0;

        //explore every cell
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs(int i , int j , char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j] == '0'){
            return; //end the dfs search
        }
        //base case
        if(grid[i][j] != '1'){
            return;
        }
        
        //mark krdo visited
        grid[i][j] = '0';

        //check all dirs
        dfs(i-1  , j , grid);
        dfs(i+1 , j ,  grid);
        dfs(i , j-1 , grid);
        dfs(i , j+1 , grid);


    }
}