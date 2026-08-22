class Solution {
    public boolean isPalindrome(String s) {
       String str=s.toLowerCase();
       str=str.replaceAll("[^a-z0-9]","");
        str=str.trim();
        int p1=0;
        int p2=str.length()-1;
        while(p1<p2){
            if(str.charAt(p1)!=str.charAt(p2)){
                  return false;
            }
            
                  p1++;
                p2--;
        }
        return true;

        
    }
}