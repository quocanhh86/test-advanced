package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> list = new ArrayList<>();

    public PersonService(){
        list.add(new Person("sv1","quocanh", 22, 200f,3,"It"));
        list.add(new Person("sv2","quocanh", 22, 200f,3,"It"));
        list.add(new Person("sv3","quocanh", 22, 200f,3,"It"));
    }

    public List<Person> getAll(){
        return list;
    }
    public String addPerson(Person person) {
        if (person.getSalary() < 0 || person.getSalary() > 2000000000) {
            throw new IllegalArgumentException("Lương nhân viên phải lớn hơn 0 và bé hơn 2 tỷ");
        }
        if (person.getId().trim().isEmpty() || person.getId().trim() == null || person.getName().trim().isEmpty() || person.getName().trim() == null
                || person.getDepartment().trim().isEmpty() || person.getDepartment().trim() == null
        ) {
            throw new NullPointerException("Không được để trống các thuộc tính của nhân viên");
        }
        if (person.getAge() > 18) {
            list.add(person);
            return "Thêm nhân viên thành công";
        } else {
            return "Tuổi nhân viên phải lớn hơn 18";
        }
    }

    public Person findById(String id){
        for (Person person : list){
            if (person.getId().equalsIgnoreCase(id)){
                return person;
            }
        }
        return null;
    }
    public List<Person> findByName(String firstName) {
        if (firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("Tên nhân viên không được trống");
        }
        List<Person> kq = new ArrayList<>();
        for (Person person : list
        ) {
            if (person.getName().equalsIgnoreCase(firstName)) {
                kq.add(person); // add vô list kết quả tìm kiếm
            }
        }
        return kq;
    }

    public String deleteById(String id){
        for (Person person: list
             ) {
                if (person.getId().equalsIgnoreCase(id)){
                    list.remove(person);
                    return "Xoá nhân viên thành công";
                }
        }
        throw new IllegalArgumentException("Không thể xoá nhân viên vì nhân viên không tồn tại");
    }
}
