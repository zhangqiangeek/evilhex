package easycode;

/**
 * @Author: evilhex
 * @Date: 2019-05-23 15:12
 */

public class EqualsObject {
    private int id;
    private String name;

    public EqualsObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        EqualsObject temp = (EqualsObject) obj;
        if (temp.getId() == this.id && name.equals(temp.getName())) {
            return true;
        }
        return super.equals(obj);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
