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
            
        //��r���নascii
        for(int i = 0; i < len; i++){
            int sAscii = (int)s.charAt(i);
            int tAscii = (int)t.charAt(i);

            sMap.put(sAscii, sMap.get(sAscii) + 1); 
            tMap.put(tAscii, tMap.get(tAscii) + 1); 
        }
        
        //�Ҧ��r���]�@�M
        for(int i = 97; i <= 122; i++){
            
            while(sMap.get(i) > tMap.get(i)){   //s �j�� t �N���t�h
                
                for(int j = 97; j <= 122; j++){
                    
                    if(tMap.get(j) > sMap.get(j)){  // t �� s�h t�
                        tMap.put(j, tMap.get(j) - 1);   //����t�h��
                        tMap.put(i, tMap.get(i) + 1);   //�[�W��s�֪��r��
                        count ++;   //���ʧ@�n+1
                        break;
                    }
                    
                }
                
            }
            
     
        }
        return count;

    }
    
}