#include <iostream>
#include <map>
#include <vector>

using namespace std;

int singleNumber(vector<int>& nums) {
    int ans = 0;
    map<int , int>m;
    for (auto e : nums) m[e]++;
    for (auto e : m) {
        if (e.second == 1) {
            ans = e.first;
            break;
        }
    }
    return ans;
}