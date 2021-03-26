package ID3;

import java.util.ArrayList;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/6/15 14:48
 */
public class TreeNode {
    private String name; //节点名（分裂属性的名称）
    private ArrayList<String> rule; //结点的分裂规则
    ArrayList<TreeNode> child; //子结点集合
    private ArrayList<ArrayList<String>> datas; //划分到该结点的训练元组
    private ArrayList<String> candAttr; //划分到该结点的候选属性
    public TreeNode() {
        this.name = "";
        this.rule = new ArrayList<String>();
        this.child = new ArrayList<TreeNode>();
        this.datas = null;
        this.candAttr = null;
    }
    public ArrayList<TreeNode> getChild() {
        return child;
    }
    public void setChild(ArrayList<TreeNode> child) {
        this.child = child;
    }
    public ArrayList<String> getRule() {
        return rule;
    }
    public void setRule(ArrayList<String> rule) {
        this.rule = rule;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<ArrayList<String>> getDatas() {
        return datas;
    }
    public void setDatas(ArrayList<ArrayList<String>> datas) {
        this.datas = datas;
    }
    public ArrayList<String> getCandAttr() {
        return candAttr;
    }
    public void setCandAttr(ArrayList<String> candAttr) {
        this.candAttr = candAttr;
    }
}