class Solution {
    public int romanToInt(String s) {
        int lastChar=s.length()-1;
        HashMap<Character,Integer> roman=new HashMap<>(7); 
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int answer=0;
        for(int i=0;i<lastChar;i++){
            if(roman.get(s.charAt(i))>=roman.get(s.charAt(i+1))){
                answer+=roman.get(s.charAt(i));
            }else if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                answer-=roman.get(s.charAt(i));
            }
        }
        answer=answer+roman.get(s.charAt(lastChar));
        return answer;
    }
}