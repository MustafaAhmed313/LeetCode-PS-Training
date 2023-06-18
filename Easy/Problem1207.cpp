#include <iostream>
#include <map>
#include <vector>

using namespace std;

bool uniqueOccurrences(vector<int>& arr) {
    map<int , int>m;
    for (int i = 0 ; i < arr.size() ; i++) m[arr[i]]++;
    vector<int> occur;
    for (auto e : m) {
        for (int i = 0 ; i < occur.size() ; i++)
            if (occur[i] == e.second) return false;
        occur.push_back(e.second);
    }
    return true;       
}

int main() {
    vector<int>v = {1,2,2,1,1,3};
    cout << uniqueOccurrences(v);
}

