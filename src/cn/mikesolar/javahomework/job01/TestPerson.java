/**
 * PersonTest.java
 */

package cn.mikesolar.javahomework.job01;

public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person("小明", 20, "male");

        System.out.println(person.toString());

        person.setName("Hatsune Miku");
        person.setAge(16);
        person.setGender("female");

        System.out.printf("%s is a %d-year-old %s\n", person.getName(),
                person.getAge(), person.getGender());
    }
}