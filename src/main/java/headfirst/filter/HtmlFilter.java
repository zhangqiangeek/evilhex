package headfirst.filter;

/**
 * @author evilhex.
 * @date 2018/3/30 上午10:37.
 */
public class HtmlFilter extends Filter {
    @Override
    String doFilter(String string) {
        //处理敏感符号
        string = string.replace('<', '(');
        string = string.replace('>', ')');
        return string;
    }
}
