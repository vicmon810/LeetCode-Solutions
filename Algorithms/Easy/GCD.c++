//including essential libraries 
#include <iostream>
#include <string>


class Solution
{
public:
    std::string gcdOfStrings(std::string str1, std::string str2)
    {
        return (str1 + str2 == str2 + str1) ? str1.substr(0, gcd(str1.size(), str2.size())) : "";
    }
};

int main()
{
    Solution solution;
    std::string result = solution.gcdOfStrings("ABC", "ABCABC");
    std::cout << "GCD of Strings: " << result << std::endl;
    return 0;
}
