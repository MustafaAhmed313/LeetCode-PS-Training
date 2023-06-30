#include <iostream>
#include <map>
#include <vector>

using namespace std;

bool containsDuplicate(vector<int>& nums) {
    map<int , int> m;
    for (auto e : nums) m[e]++;
    for (auto e : m) if (e.second > 1) return true;
    return false;   
}