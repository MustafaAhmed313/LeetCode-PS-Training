#include <iostream>
#include <vector>
#include <map>

using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    map<int , int>m;
    for (int i = 0 ; i < nums.size() ; i++) m[nums[i]]++;
    int idxa = 0 , idxb = 0;
    for (int i = 0 ; i < nums.size() ; i++) {
        if (target - nums[i] == nums[i] && m[nums[i]] >= 2) {
            idxa = i;
            break;
        }
        if (m[target - nums[i]] > 0 && target - nums[i] !=  nums[i]) { //3 2 4
            idxa = i;
            break;
        }
    }
    for (int i = 0 ; i < nums.size() ; i++) {
        if (i != idxa && nums[i] == target - nums[idxa]) {
            idxb = i;
            break;
        }
    }
    vector<int> v(2);
    v[0] = idxa;v[1] = idxb;
    return v;
}
