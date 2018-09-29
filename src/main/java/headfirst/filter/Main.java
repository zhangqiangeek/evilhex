package headfirst.filter;

/**
 * 过滤器链设计模式
 *
 * @author evilhex.
 * @date 2018/3/30 上午10:23.
 */
public class Main {

    public static void main(String[] args) {
        String msg = "<<<被就业<<<被就业>>>被就业>>>>";
        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);
        FilterChain filterChain = new FilterChain();
        //链条式的加入过滤器
        filterChain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        msgProcessor.setFilterChain(filterChain);
        String result = msgProcessor.processor();
        System.out.println(result);
    }
}
