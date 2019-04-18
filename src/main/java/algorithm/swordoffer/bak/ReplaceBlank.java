package algorithm.swordoffer.bak;

/**
 * 替换空格,nowcoder运行通过
 *
 * @author evilhex.
 * @date 2018/11/13 11:43 AM.
 */
public class ReplaceBlank {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        char[] chars = str.toString().toCharArray();
        if (str != null) {
            for (char curChar : chars) {
                if (curChar == ' ') {
                    result.append("%20");
                } else {
                    result.append(curChar);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        System.out.println(replaceSpace(str));
    }
}
