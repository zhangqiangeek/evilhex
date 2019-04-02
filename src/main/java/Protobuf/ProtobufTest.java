package Protobuf;

/**
 * Protobuf 测试文件
 *
 * @Author: evilhex
 * @Date: 2019-04-02 15:51
 */
public class ProtobufTest {
    public static void main(String[] args) throws Exception {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setAddress("leshi")
                .setName("zhangsan")
                .setAge(20)
                .build();
        byte[] bytes = student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(bytes);
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());

    }

}
