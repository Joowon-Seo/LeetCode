class Solution {
    public boolean isValid(String s) {
         if (s.length()%2 != 0){
            return false;
        }
        Stack<String> stack = new Stack<>();
        for (String str : s.split("")){
            if (str.equals(")") || str.equals("]") || str.equals("}")){
                if (stack.isEmpty()){
                    return false;
                }
            }
            if (str.equals(")")){
                String data = stack.pop();
                if (!data.equals("(")){
                    return false;
                }
            } else if (str.equals("}")){
                String data = stack.pop();
                if (!data.equals("{")){
                    return false;
                }
            } else if (str.equals("]")){
                String data = stack.pop();
                if (!data.equals("[")){
                    return false;
                }
            } else {
                stack.add(str);
            }

        }

        return stack.isEmpty();
        
    }
}