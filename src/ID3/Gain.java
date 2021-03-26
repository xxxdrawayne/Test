package ID3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * @author ywt
 * @version 1.0
 * @date 2020/6/15 18:31
 */
public class Gain {
    private ArrayList<ArrayList<String>> D = null; //训练元组
    private ArrayList<String> attrList = null; //候选属性集
    public Gain(ArrayList<ArrayList<String>> datas, ArrayList<String> attrList) {
        this.D = datas;
        this.attrList = attrList;
    }

    /**
     * 获取最佳侯选属性列上的值域（假定所有属性列上的值都是有限的名词或分类类型的）
     * @param attrIndex 指定的属性列的索引
     * @return 值域集合
     */
    public ArrayList<String> getValues(ArrayList<ArrayList<String>> datas, int attrIndex){
        ArrayList<String> values = new ArrayList<String>();
        String r = "";
        for (int i = 0; i < datas.size(); i++) {
            r = datas.get(i).get(attrIndex);
            if (!values.contains(r)) {
                values.add(r);
            }
        }
        return values;
    }

    /**
     * 获取指定数据集中指定属性列索引的域值及其计数
     * @param d 指定的数据集
     * @param attrIndex 指定的属性列索引
     * @return 类别及其计数的map
     */
    public Map<String, Integer> valueCounts(ArrayList<ArrayList<String>> datas, int attrIndex){
        Map<String, Integer> valueCount = new HashMap<String, Integer>();
        String c = "";
        ArrayList<String> tuple = null;
        for (int i = 0; i < datas.size(); i++) {
            tuple = datas.get(i);
            c = tuple.get(attrIndex);
            if (valueCount.containsKey(c)) {
                valueCount.put(c, valueCount.get(c) + 1);
            } else {
                valueCount.put(c, 1);
            }
        }
        return valueCount;
    }

    /**
     * 求对datas中元组分类所需的期望信息，即datas的熵
     * @param datas 训练元组
     * @return datas的熵值
     */
    public double infoD(ArrayList<ArrayList<String>> datas){
        double info = 0.000;
        int total = datas.size();
        Map<String, Integer> classes = valueCounts(datas, attrList.size());
        Iterator iter = classes.entrySet().iterator();
        Integer[] counts = new Integer[classes.size()];
        for(int i = 0; iter.hasNext(); i++)
        {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer val = (Integer) entry.getValue();
            counts[i] = val;
        }
        for (int i = 0; i < counts.length; i++) {
            double base = DecimalCalculate.div(counts[i], total, 3);
            info += (-1) * base * Math.log(base);
        }
        return info;
    }
    /**
     * 获取指定属性列上指定值域的所有元组
     * @param attrIndex 指定属性列索引
     * @param value 指定属性列的值域
     * @return 指定属性列上指定值域的所有元组
     */
    public ArrayList<ArrayList<String>> datasOfValue(int attrIndex, String value){
        ArrayList<ArrayList<String>> Di = new ArrayList<ArrayList<String>>();
        ArrayList<String> t = null;
        for (int i = 0; i < D.size(); i++) {
            t = D.get(i);
            if(t.get(attrIndex).equals(value)){
                Di.add(t);
            }
        }
        return Di;
    }

    /**
     * 基于按指定属性划分对D的元组分类所需要的期望信息
     * @param attrIndex 指定属性的索引
     * @return 按指定属性划分的期望信息值
     */
    public double infoAttr(int attrIndex){
        double info = 0.000;
        ArrayList<String> values = getValues(D, attrIndex);
        for (int i = 0; i < values.size(); i++) {
            ArrayList<ArrayList<String>> dv = datasOfValue(attrIndex, values.get(i));
            info += DecimalCalculate.mul(DecimalCalculate.div(dv.size(), D.size(), 3), infoD(dv));
        }
        return info;
    }

    /**
     * 获取最佳分裂属性的索引
     * @return 最佳分裂属性的索引
     */
    public int bestGainAttrIndex(){
        int index = -1;
        double gain = 0.000;
        double tempGain = 0.000;
        for (int i = 0; i < attrList.size(); i++) {
            tempGain = infoD(D) - infoAttr(i);
            if (tempGain > gain) {
                gain = tempGain;
                index = i;
            }
        }
        return index;
    }
}
