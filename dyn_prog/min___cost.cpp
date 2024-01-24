#include <stdio.h>
#include <string.h>
#include <vector>
#include <iostream>
#include <vector>
using namespace std;
class Solution
{
public:
    int minCostClimbingStairs(vector<int> &cost)
    {
        int n = cost.size();
        for (int i = 2; i < n; i++)
        {
            cost[i] += min(cost[i - 1], cost[i - 2]);
        }
        return min(cost[n - 1], cost[n - 2]);
    }
};

int main()
{
    Solution solution; // Create an instance of the Solution class
    int arr[] = {1, 2, 1, 100};
    vector<int> test(arr, arr + sizeof(arr) / sizeof(arr[0]));

    int result = solution.minCostClimbingStairs(test);

    cout << "Minimum cost: " << result << endl;

    return 0;
}