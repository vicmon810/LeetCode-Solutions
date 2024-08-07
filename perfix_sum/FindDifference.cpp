#include <iostream>
#include <vector>
#include <unordered_set>
fda

using namespace std;

class Solution
{
public:
    vector<vector<int>> findDifference(vector<int> &nums1, vector<int> &nums2)
    {
        unordered_set<int> set1(nums1.begin(), nums1.end());
        unordered_set<int> set2(nums2.begin(), nums2.end());

        vector<int> distinct_num1, distinct_num2;

        for (int num : set1)
        {
            if (set2.count(num) == 0)
                distinct_num1.push_back(num);
        }

        for (int num : set2)
        {
            if (set1.count(num) == 0)
                distinct_num2.push_back(num);
        }

        return {distinct_num1, distinct_num2};
    }
};

int main()
{
    Solution solution;
    vector<int> nums1 = {1, 2, 3};
    vector<int> nums2 = {2, 4, 6};

    vector<vector<int>> result = solution.findDifference(nums1, nums2);

    // Print the result
    for (const auto &v : result)
    {
        for (int num : v)
        {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
