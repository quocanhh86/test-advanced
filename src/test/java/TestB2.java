import org.example.Person;
import org.example.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestB2 {
    PersonService personService = new PersonService();
    @Test
    public void testAddNhanVien(){
        String exp = "Tuổi nhân viên phải lớn hơn 18";
        Person person = new Person("id","quocanh", 2, 200f,3,"It");
        String act = personService.addPerson(person);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAddNhanVien3(){
        String exp = "Thêm nhân viên thành công";
        Person person = new Person("id","quocanh", 22, 200f,3,"It");
        String act = personService.addPerson(person);
        Assertions.assertEquals(exp, act);

    }
    @Test
    public void testAddNhanVien4(){
        Person person = new Person("  ","quocanh", 22, 200f,3,"It");
        Assertions.assertThrows(NullPointerException.class, () -> personService.addPerson(person));
    }

    @Test
    public void testAddNhanVien1(){
        Person person = new Person(null,"quocanh", 22, 200f,3,"It");
        Assertions.assertThrows(NullPointerException.class, () -> personService.addPerson(person));
    }
    @Test
    public void testAddNhanVien2(){
        String exp = "Lương nhân viên phải lớn hơn 0";
        Person person = new Person("id","quocanh", 22, -200f,3,"It");
        String act = personService.addPerson(person);
        Assertions.assertEquals(exp, act);
    }
}
