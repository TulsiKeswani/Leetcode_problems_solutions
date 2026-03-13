class Solution {
    public String interpret(String c) {
        // String s = "";
        // String ans = "";
        // for(int i = 0; i < c.length(); i++){
        //     char ch = c.charAt(i);
        //     s+=ch;
        //     if(s.equals("G")){
        //         ans+="G";
        //         s = "";
        //     }
        //     else if(s.equals("()")){
        //         ans+="o";
        //         s = "";
        //     }
        //     else if(s.equals("(al)")){
        //         ans+="al";
        //         s = "";
        //     }
        // }

        // return ans;

        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(i < c.length()){
            char ch = c.charAt(i);

            if(ch == 'G'){
                sb.append(ch);
                i++;
            }
            else if(c.charAt(i+1) == 'a'){
                sb.append("al");
                i+=4;
            }
            else{
                sb.append("o");
                i+=2;
            }
        }

        return sb.toString();
    }
}