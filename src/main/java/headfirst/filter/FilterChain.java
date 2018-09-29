package headfirst.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链装各种过滤器
 *
 * @author evilhex.
 * @date 2018/3/30 上午11:00.
 */
public class FilterChain {

    List<Filter> filters = new ArrayList<>();

    /**
     * 添加过滤器
     *
     * @param filter
     */
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public String doFilter(String string) {
        String r = string;
        for (Filter f : filters) {
            r = f.doFilter(r);
        }
        return r;
    }

}
