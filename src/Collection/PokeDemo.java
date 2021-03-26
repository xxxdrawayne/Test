package Collection;

import java.util.*;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/10/16 13:09
 */
public class PokeDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        String[] color = {"♣","♠","♥","♦"};
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int xuhao = 1;
        for(String num:number) {
            for(String col:color) {
                hashMap.put(xuhao,col+num);
                list.add(xuhao);
                xuhao++;
            }
        }
        hashMap.put(53,"joker"); hashMap.put(54,"Jorker");
        list.add(53); list.add(54);

        Collections.shuffle(list);  //洗牌

        TreeSet<Integer> Player1 = new TreeSet<Integer>();
        TreeSet<Integer> Player2 = new TreeSet<Integer>();
        TreeSet<Integer> Player3 = new TreeSet<Integer>();
        TreeSet<Integer> dipai = new TreeSet<Integer>();

        for(int i=0; i<list.size(); i++) {
            if(i>=list.size()-3) {
                dipai.add(list.get(i));
            }else if(i%3==0) {
                Player1.add(list.get(i));
            }else if(i%3==1) {
                Player2.add(list.get(i));
            }else  {
                Player3.add(list.get(i));
            }
        }

        LookPoke(hashMap,Player1);
        LookPoke(hashMap,Player2);
        LookPoke(hashMap,Player3);
        LookPoke(hashMap,dipai);
    }

    public static void LookPoke(HashMap<Integer,String> hashMap,TreeSet<Integer> treeSet) {
        for(Integer i:treeSet) {
            System.out.print(hashMap.get(i)+"  ");

        }
        System.out.println();
    }
}
