class Solution {
    public String helper(int num){
        String digit[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        String less20[] = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String tenString[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        
        String result = "";

        if(num > 99){
            result = digit[num / 100] + " " + "Hundred ";
            num %=100;
        }

        if(num < 20 && num > 9){
            result+=less20[num - 10]+" ";
        }
        else{
            if(num >= 20){
                result+=tenString[num / 10]+" ";
                num %= 10;
            }
            if(num > 0){
                result+=digit[num]+" ";
            }
        }

        return result;
    }
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String bigDigit[] = {"Thousand","Million","Billion"};

        String result = helper(num % 1000);
        num /= 1000;

        for(int i = 0; i < 3; i++){
            if(num > 0 && num % 1000 > 0){
                result = helper(num % 1000) + bigDigit[i] + " " + result;
            }
            num /= 1000;
        }

        return result.equals("") ? result : result.substring(0,result.length()-1);
    }
}