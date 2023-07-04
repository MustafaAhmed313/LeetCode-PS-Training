#include <iostream>
#include <map>
#include <string>

using namespace std;

bool canConstruct(string ransomNote, string magazine) {
    map<char , int> m1;
    map<char , int> m2;
    for (int i = 0 ; i < ransomNote.length() ; i++) m1[ransomNote[i]]++;
    for (int i = 0 ; i < magazine.length() ; i++) m2[magazine[i]]++;
    bool flag = true;
    for (int i = 0 ; i < ransomNote.length() ; i++) {
        char c = ransomNote[i];
        if (m1[c] > m2[c]) {
            flag = false;
            break;
        }
    }
    return flag;
}