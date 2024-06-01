public
class Solution
{
public
    int EqualPairs(int[][] g)
    {
        
        int ans = 0;
        for (int i = 0; i < g.Length; i++)
            for (int j = 0; j < g.Length; j++)
            {
                int check = 0;
                for (int k = 0; k < g.Length; k++)
                    if (g[i][k] == g[k][j])
                        check++;
                if (check == g.Length)
                    ans++;
            }
        return ans;
    }
}
