package java8;

/**
 * @Author: evilhex
 * @Date: 2019-01-16 10:34
 */
public class People {
    private String data;
    private Integer channel;
    private String num;

    People(String data, Integer channel, String num) {
        this.data = data;
        this.channel = channel;
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
