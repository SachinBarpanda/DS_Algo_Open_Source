package Lec28;

public class Word_Search {
    public static void main(String[] args) {
        char [][] ch = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        for (int row = 0; row <ch.length; row++) {
            for (int col = 0; col < ch[0].length; col++) {
                if(ch[row][col] == word.charAt(0)) {
                    boolean f = wordSearch(ch,row,col,0,word);
                    if(f){
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
//        return false;
    }
    public static boolean wordSearch(char [][]ch , int cr , int cc,int idx, String word){
        if(idx==word.length()){
            return true;
        }

        if (cr < 0 || cr >= ch.length || cc < 0 || cc >= ch[0].length || ch[cr][cc] != word.charAt(idx)) {
            return false;
        }

        int[] set1 = {-1,1,0,0};
        int[] set2 = {0,0,1,-1};
        ch[cr][cc] = '*';
        for(int i = 0 ; i < set1.length;i++){
            boolean cond = wordSearch(ch,cr+set1[i],cc+set2[i],idx+1,word);
            if(cond){
                return true;
            }
        }
        ch[cr][cc] = word.charAt(idx);
        return false;
    }
}
