package Lec51;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            int [] alpha = new int[26];
            String s1 = new String("");
            for (int j = 0; j < s.length(); j++) {
                alpha[s.charAt(j)-'a']++;
            }
            for(int j = 0; j < alpha.length ;j++){
                s1+=(((char) j+'a')+alpha[j]);
            }
            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }else{
                ArrayList<String > as = new ArrayList<>();
                as.add(s);
                map.put(s1,as);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String a : map.keySet()){
            ans.add(map.get(a));
        }
        return ans;
    }


    public static List<List<String>> groupAnagrams01(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            String [] charS = s.split("");
            Arrays.sort(charS,new Comparator<String> (){
                @Override
                public int compare(String o1 , String o2){
                    return o1.compareTo(o2);
                }
            });
            String s1 ="";

            for(int j = 0; j < charS.length ;j++){
                s1+=charS[i];
            }
            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }else{
                ArrayList<String > as = new ArrayList<>();
                as.add(s);
                map.put(s1,as);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String a : map.keySet()){
            ans.add(map.get(a));
        }
        return ans;
    }

}
