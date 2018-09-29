package headfirst.filter;

/**
 * @author evilhex.
 * @date 2018/3/30 上午10:28.
 */
public class MsgProcessor {
    private String msg;

    //Filter[] filters = { new HtmlFilter(), new SensitiveFilter() };

    FilterChain filterChain;

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String processor() {
        return filterChain.doFilter(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
