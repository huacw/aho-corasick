package org.ahocorasick.trie;

/**
 * 关键字对象
 *
 * @author chengwu.hua
 * @Date 2018/8/30 14:16
 * @Version 1.0
 */
public class Keyword implements Comparable<Keyword> {
    private String keyword;
    private int pos;
    private int level;

    public Keyword() {
    }

    public Keyword(String keyword, int pos, int level) {
        this.keyword = keyword;
        this.pos = pos;
        this.level = level;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int compareTo(Keyword o) {
        String thatKeyword = o.keyword;
        if (StringUtils.isEmptyStr(this.keyword) && StringUtils.isEmptyStr(thatKeyword)) {
            return 0;
        } else if (StringUtils.isEmptyStr(this.keyword)) {
            return -1;
        } else if (StringUtils.isEmptyStr(thatKeyword)) {
            return 1;
        }
        return this.getKeyword().compareTo(o.getKeyword());
    }

}
