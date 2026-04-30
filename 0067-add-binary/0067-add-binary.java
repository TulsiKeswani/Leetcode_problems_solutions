class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        while(i >= 0 && j >= 0){
            int dig1 = a.charAt(i) - '0';
            int dig2 = b.charAt(j) - '0';
            sb.append((dig1 + dig2 + carry) % 2);

            if((dig1 + dig2 + carry) < 2){
                carry = 0;
            }
            else{
                carry = 1;
            }
            i--;
            j--;
        }

        while(j >= 0){
            int dig = b.charAt(j) - '0';
            sb.append((dig + carry) % 2);

            if((dig + carry) < 2){
                carry = 0;
            }
            else{
                carry = 1;
            }
            j--;
        }
        while(i >= 0){
            int dig = a.charAt(i) - '0';
            sb.append((dig + carry) % 2);
            if((dig + carry) < 2){
                carry = 0;
            }
            else{
                carry = 1;
            }
            i--;
        }

        if(carry == 1) sb.append(carry);

        return sb.reverse().toString();
    }
}