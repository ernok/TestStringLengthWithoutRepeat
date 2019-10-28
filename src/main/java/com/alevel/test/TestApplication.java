package com.alevel.test;


public class TestApplication {


    static final int NO_OF_CHARS = 256;

    public static int lengthOfLongestSubstring(String s) {

        int sLength = s.length();
        int curLen = 1; // length of current substring
        int maxLen = 1; // result
        int prevIndex; // previous index
        int visited[] = new int[NO_OF_CHARS];


        for (int i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }

        visited[s.charAt(0)] = 0;

        for (int i = 1; i < sLength; i++) {
            prevIndex = visited[s.charAt(i)];


            if (prevIndex == -1 || i - curLen > prevIndex){
                curLen++;}


            else {
                if (curLen > maxLen){
                    maxLen = curLen;}

                curLen = i - prevIndex;
            }

            visited[s.charAt(i)] = i;
        }

        if (curLen > maxLen){
            maxLen = curLen;}

        return maxLen;


    }


}
