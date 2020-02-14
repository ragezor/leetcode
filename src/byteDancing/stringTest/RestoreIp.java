package byteDancing.stringTest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
题干
给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

示例:

输入: "25525511135"
输出: ["255.255.11.135", "255.255.111.35"]

想法
这题乍一看很唬人，仔细看其实就是要返回这个string的几种划分情况，并且一定是划分成四块，同时要求每一块都是合法的ip地址即可
啥是合法的ip地址？
首先如果是三位数
必须大于0小于255
只有一位数的开头第一位可以是0
这就叫合法
于是就有很多办法
暴力遍历
或者遍历以后在回溯
很多方法


总结地址：https://blog.csdn.net/qq_43491066/article/details/104277022
 */

public class RestoreIp {


        public List<String> restoreIpAddresses(String s) {
            List<String> res = new ArrayList<String>();
            restore(s, 4, "", res);
            return res;
        }

        public void restore(String s, int k, String out, List<String> res) {
            if (k == 0) {
                if (s.isEmpty())
                    res.add(out);
            } else {
                for (int i = 1; i <= 3; ++i) {
                    if (s.length() >= i && isValid(s.substring(0, i))) {
                        if (k == 1)
                            restore(s.substring(i), k - 1, out + s.substring(0, i), res);
                        else
                            restore(s.substring(i), k - 1, out + s.substring(0, i) + ".", res);
                    }
                }
            }
        }

        //校验函数：主要验证 每段数字是否为 001 022 等这样0开头的数字
        public boolean isValid(String s) {
            if (s.isEmpty() || s.length() > 3 || (s.length() > 1 && s.charAt(0) == '0')) {
                return false;
            } else {
                int resInt = Integer.parseInt(s);
                return resInt <= 255 && resInt >= 0;
            }
        }
    }
