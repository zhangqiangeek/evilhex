package headfirst.filter;

/**
 * @author evilhex.
 * @date 2018/3/30 上午10:40.
 */
public class SensitiveFilter extends Filter {
    @Override
    String doFilter(String string) {
        //处理敏感字符
        string = string.replace("被就业", "就业");
        return string;
    }
}
