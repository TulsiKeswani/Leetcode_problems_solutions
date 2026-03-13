class Solution {
    public String interpret(String c) {
       String s = "";
        String ans = "";
       for(int i = 0; i < c.length(); i++){
            char ch = c.charAt(i);
            s+=ch;
            if(s.equals("G")){
                ans+="G";
                s = "";
            }
            else if(s.equals("()")){
                ans+="o";
                s = "";
            }
            else if(s.equals("(al)")){
                ans+="al";
                s = "";
            }
       }

       return ans;
    }
}