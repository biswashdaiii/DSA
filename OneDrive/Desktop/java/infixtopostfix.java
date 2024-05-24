public class infixtopostfix {
    int precedence(char ch){
        if(ch=='^'){
            return 3;
        }
        if (ch=='*' || ch == '/'){
            return 2;
        }
        if (ch=='+' || ch =='-'){
            return 1;
        }
        return -1;
    }   



    String  convertpostfix(String exp){
        stacksss stk=new stacksss(exp.length());
        String postfix="";
        for (int i=0; i<exp.length();i++){
            char ch =exp.charAt(i);
            if (precedence(ch)>0){
                while(!stk.isEmpty() && precedence(ch)<=precedence(stk.peek())){
                    postfix=postfix+stk.pop();
                }
                stk.push(ch);
                
            }else if(ch=='('){
                stk.push(ch);
            }
            else if(ch==')'){
                char x= stk.pop();
                while(x!='('){
                    postfix=postfix+x;
                    x=stk.pop();
                }
            }else{postfix=postfix+ch;
        
        }
        while(!stk.isEmpty()){
            postfix=postfix+stk.pop();
        }
        System.out.println(postfix);

        }



        return postfix;
    }
    
}
//convert infix to postfix,postfix to prefix,prefix to infix using tabular method as well as program
//write a program to evaluate postfix espression