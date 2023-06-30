#include <iostream>
#include <string>
#include <map>

using namespace std;

bool isAnagram(string s, string t) {
    if (s.length() != t.length()) return false;
    map<char , int> ms;
    map<char , int> mt;
    for (int i = 0 ; i < s.length() ; i++) ms[s[i]]++;
    for (int i = 0 ; i < t.length() ; i++) mt[t[i]]++;
    for (int i = 0 ; i < s.length() ; i++) 
        if (ms[s[i]] != mt[s[i]]) return false;
    return true;
}