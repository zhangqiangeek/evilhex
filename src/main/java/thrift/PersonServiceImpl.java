package thrift;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

/**
 * @Author: evilhex
 * @Date: 2019-04-02 21:17
 */
public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByName(String username) throws DataException, TException {
        System.out.println("Got Client Param:" + username);
        Person person = new Person();
        person.setUsername(username);
        person.setAge(20);
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getUsername());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
    }
}
