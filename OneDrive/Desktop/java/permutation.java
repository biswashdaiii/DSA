public class permutation {
    void findPermutation( String str ,String perm){

        if (perm.length()>1){
            return;
        }
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i<str.length(); i++){
            char newchar=str.charAt(i);
            String newstr=str.substring(0, i) + str.substring(i+1);
            findPermutation(str,perm+newchar);
        }

    }
    public static void main(String[] args) {
        permutation p = new permutation();
        String str="ABC";
        p.findPermutation(str,"");
    }
    
}


