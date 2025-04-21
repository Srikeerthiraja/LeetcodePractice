class Solution {
    public int calculate(String s) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int res=0;
        int num=0;
        int sign=1;
        int n =s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'|| ch=='-'){
                res+=num*sign;
                num=0;
                sign=(ch=='+')?1:-1;
            }
             else if(ch == '('){
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }
            // closing  parenthesis
            else if(ch == ')'){
                res += num * sign;
                res *= stack.pop();
                res += stack.pop();
                num = 0;
            }}
            res+=num*sign;
            return res;}}