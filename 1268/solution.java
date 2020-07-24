class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) { 
       List<List<String>> word2 = new ArrayList<List<String>>();
        for(int i = 1; i< searchWord.length()+1; i++){
            String string = searchWord.substring(0,i);
            ArrayList<String> a1 = new ArrayList<String>();
            ArrayList<String> word = new ArrayList<String>();

            //��r��۲Ū�
            for(String str : products)
                if(str.indexOf(string) == 0)
                    word.add(str);
    
            Collections.sort(word);
               
            //�u�L�X�r��Ƨǫe�T��
            int len;
            if(word.size() > 3)
                len = 3;
            else
                len = word.size();
            
            for(int j = 0; j < len; j++)
                a1.add(word.get(j));
             
            word2.add(a1);
        }
        return word2;
    }
}