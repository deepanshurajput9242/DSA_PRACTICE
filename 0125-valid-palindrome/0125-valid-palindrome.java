class Solution {
    public boolean isPalindrome(String s) {
        if(s==" ")return true;
        String t=s.toLowerCase();
       
        int i=0;
        int j=s.length()-1;
        while(i<j){


            char ch1=t.charAt(i);
            char ch2=t.charAt(j);
            if(!Character.isLetterOrDigit(ch1)){ i++;
            continue;
            }


            if(!Character.isLetterOrDigit(ch2)){j--;
            continue;
            }




            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;

        
       

        }
        return true;
        
    }
}