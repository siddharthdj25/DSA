class Solution {
    public int countVowelSubstrings(String word) {
       int count =0;
       int n = word.length();
       for(int i=0;i<word.length();i++){
          int[] freq = new int[5];

        for(int j=i;j<n;j++){
            char s= word.charAt(j);
            if(s=='a'){
                freq[0]++;
            }
            else if(s=='e'){
                freq[1]++;
            }
            else if(s=='i'){
                freq[2]++;
            }
            else if(s=='o'){
                freq[3]++;
            }
            else if(s=='u'){
                freq[4]++;
            }
            else break;

        
        if(freq[0]>0 && freq[1]>0 && freq[2]>0 && freq[3]>0 && freq[4]>0){
            count++;
        }
       }
       }
          return count;
    
        
       } 
  
    }
    