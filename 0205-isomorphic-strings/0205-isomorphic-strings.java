class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character,Character> hs=new HashMap<>();
        HashMap<Character,Character> hs1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
           if(hs.containsKey(c1))
           {
            if( hs.get(c1)!=c2)
            {
                return false;


            }
            
           }
           else{
                hs.put(c1,c2);
            }

           if(hs1.containsKey(c2)){
            if(hs1.get(c2)!=c1){
                return false;
            }
            
           }
           else{
                hs1.put(c2,c1);
            }
        }
        return true;

       

    }
}