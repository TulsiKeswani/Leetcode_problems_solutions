class Solution {
    public void reverse(StringBuilder sb){
        int i = 0;
        int j = sb.length()-1;

        while(i < j){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
    }
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            else if(sb.length() > 0){
                if(ch == '*'){
                    sb.deleteCharAt(sb.length()-1);
                }
                else if(ch == '#'){
                    sb.append(sb);
                }
                else{
                    reverse(sb);
                }
            }
        }

        return sb.toString();
    }
}