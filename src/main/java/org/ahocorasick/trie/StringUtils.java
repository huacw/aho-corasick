package org.ahocorasick.trie;

/**
 * @author chengwu.hua
 * @Date 2018/8/30 17:43
 * @Version 1.0
 */
public class StringUtils {
    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmptyStr(String str) {
        return str == null || str.length() == 0;
    }
}
