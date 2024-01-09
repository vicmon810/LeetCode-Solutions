#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    int maxOperations(vector<int> &nums, int k)
    {
        sort(nums.begin(), nums.end());

        int i = 0, j = nums.size() - 1;
        int ans = 0;

        while (j >= 0 && nums[j] >= k)
            j--;

        while (i < j)
        {
            if ((nums[i] + nums[j]) == k)
            {
                ans++;
                i++;
                j--;
            }
            else if ((nums[i] + nums[j]) >= k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
};

int main()
{
    Solution solution;

    vector<int> nums;
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(3);
    nums.push_back(4);
    nums.push_back(5);
    int k = 6;

    int result = solution.maxOperations(nums, k);

    cout << "Maximum number of operations: " << result << endl;

    return 0;
}
