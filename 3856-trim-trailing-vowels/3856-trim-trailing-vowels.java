class Solution {
    public String trimTrailingVowels(String s) {
        int j = s.length() - 1;
        while(j >= 0){
            char ch = s.charAt(j);

            if(
                !(ch == 'a') && 
                !(ch == 'e') && 
                !(ch == 'i') && 
                !(ch == 'o') && 
                !(ch == 'u')) 
                break;
            j--;
        }
        return j == -1 ? "" : s.substring(0,j+1);
    }
}