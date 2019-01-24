package interview;

/**
 * @Author: evilhex
 * @Date: 2018-12-28 20:09
 */
public class People {
    private String name;
    private Integer age;
    private String address;

    People(Integer age){
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public People setAddress(String address) {
        this.address = address;
        return this;
    }
}
