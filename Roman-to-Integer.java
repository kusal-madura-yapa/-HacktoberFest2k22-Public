class Solution {
    int value(char ch){
            switch(ch){
                case 'I':{
                    return 1;
                    
                }
                case 'V':{
                    return 5;
                    
                }
                case 'X':{
                    return 10;
                    
                }
                case 'L':{
                    return 50;
                    
                }
                case 'C':{
                    return 100;
                    
                }
                case 'D':{
                    return 500;

                }
                case 'M':{
                    return 1000;
                }
            }
        return -1;
    }
    public int romanToInt(String s) {
        int s1,s2;
        int result=0;
        
        for(int i=0;i<s.length();i++){
            s1=value(s.charAt(i));
            if(i<s.length()-1){
                s2=value(s.charAt(i+1));
                
                if(s2>s1){
                    result=result+(s2-s1);
                    i++;
                }
                else{
                    result+=s1;
                }
            }
            else{
                result+=s1;
            }
            
        }
        
        return result;
    }
}