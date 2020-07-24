class Solution {
    private HashMap<Integer, Integer> tMap = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> sMap = new HashMap<Integer, Integer>();
    
    public int minSteps(String s, String t) {
        int len = s.length();
        int count = 0;
        
        //reset
        for(int i = 97; i <= 122; i++){
            sMap.put(i, 0);
            tMap.put(i, 0);
        }
            
        //把字串轉成ascii
        for(int i = 0; i < len; i++){
            int sAscii = (int)s.charAt(i);
            int tAscii = (int)t.charAt(i);

            sMap.put(sAscii, sMap.get(sAscii) + 1); 
            tMap.put(tAscii, tMap.get(tAscii) + 1); 
        }
        
        //所有字母跑一遍
        for(int i = 97; i <= 122; i++){
            
            while(sMap.get(i) > tMap.get(i)){   //s 大於 t 代表比t多
                
                for(int j = 97; j <= 122; j++){
                    
                    if(tMap.get(j) > sMap.get(j)){  // t 比 s多 t減掉
                        tMap.put(j, tMap.get(j) - 1);   //扣掉t多的
                        tMap.put(i, tMap.get(i) + 1);   //加上比s少的字母
                        count ++;   //有動作要+1
                        break;
                    }
                    
                }
                
            }
            
     
        }
        return count;

    }
    
}