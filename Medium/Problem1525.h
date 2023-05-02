//
// Created by Mostafa on 5/2/2023.
//

#ifndef MEDIUM_PROBLEM1525_H
#define MEDIUM_PROBLEM1525_H


class Problem1525 {
    int numSplits(string s) {
        int answer = 0;
        vector<int> prefix(s.length() + 1 , 0);
        vector<int> suffix(s.length() + 1 , 0);
        set<char>st;
        for (int i = 0 ; i < s.length() ; i++) {
            st.insert(s[i]);
            prefix[i] = st.size();
        }
        st.clear();
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            st.insert(s[i]);
            suffix[i] = st.size();
        }
        for (int i = 1 ; i < s.length() ; i++)
            if (prefix[i-1] == suffix[i]) answer++;
        return answer;
    }
};


#endif //MEDIUM_PROBLEM1525_H
