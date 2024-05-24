public class checkparenthesis {
    boolean isBalanced(String exp){
        stacksss stk= new stacksss(exp.length());
        String openingbraces="[{(";
        String closingbraces=")}]";

        for (int i=0; i<exp.length();i++){
            char bracket=exp.charAt(i);
            //checking bracket is opening
            if(bracket=='[' || bracket=='{' || bracket=='(' ){
               //confirmed opening bracket
                stk.push(bracket);
            }
            else{
                //confirmed the bracket is closed
                int indx =closingbraces.indexOf(bracket);
                char crossopeningbracket= openingbraces.charAt(indx);
                if(stk.isEmpty()){
                    return false;  //expression is not balanced

                }
                else{
                    char stkchar=stk.pop();//removing top element of stack and checking it with current character
                    if (stkchar!=crossopeningbracket){
                        return false;   
                    }
                }
            }
        }
        if (!stk.isEmpty()) {
            return false;

        } 
         return true;

    }
    public static void main(String[] args) {
        checkparenthesis chk=new checkparenthesis();
        System.out.println(chk.isBalanced(exp:"{[()]}"));   //return
    }

    
}
