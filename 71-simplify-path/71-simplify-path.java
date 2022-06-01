class Solution {
    public String simplifyPath(String path) {
        //
        Stack<String> stack = new Stack<>();
        String result = "";

        String[] pathArray = path.split("/");
        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i].equals("") || pathArray[i].equals(".")){
                continue;
            } else if (pathArray[i].equals("..")){
                if (stack.isEmpty()){
                    continue;
                } else {
                    stack.pop();
                }

            } else {
                stack.push("/" + pathArray[i]);
            }
        }

        for (String s : stack){
            result += s;
        }


        return stack.isEmpty()? "/" : result;
    
    }
}