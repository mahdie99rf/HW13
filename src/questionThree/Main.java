package questionThree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(new Address("12345", "Bahar", "5", "Tehran"), "Mahdie", "Rasooli",23));
        personList.add(new Person(new Address("423456", "Seraj", "4", "Tehran"), "Rezvan", "faqihi",20));
        personList.add(new Person(new Address("623457", "lavasani", "1", "Tehran"), "Mohsen", "Bahrani",48));
        personList.add(new Person(new Address("223458", "valayian", "4", "Tehran"), "Morteza", "Fazel",19));
        personList.add(new Person(new Address("923459", "chamran", "5", "Tehran"), "Mohadese", "Kahe",21));
        personList.add(new Person(new Address("623450", "Nasim", "5", "Tehran"), "Sadra", "Jalalinia",15));
        personList.add(new Person(new Address("925450", "Nami", "1", "Tehran"), "Motahare", "Mahdavi",23));
        personList.add(new Person(new Address("526450", "Korosh", "1", "Tehran"), "Ali", "Khodayi",38));
        personList.add(new Person(new Address("428450", "Golestan", "5", "Tehran"), "Paria", "Jamshidi",29));
        personList.add(new Person(new Address("729450", "Shahbazi", "4", "Tehran"), "Kosar", "Toloyi",25));

        // sort people by age
        System.out.println("sorting people by age: ");
        List<Person> sortByAge = personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        sortByAge.forEach(System.out::println );
        System.out.println("---------------------------");

        //sort people by postalCode
        System.out.println("sorting people by postalCode: ");
        List<Person> sortByPostalCode = personList.stream()
                .sorted(Comparator.comparing(p -> p.getAddress().getPostalCode())).collect(Collectors.toList());
        sortByPostalCode.forEach(System.out::println);
        System.out.println("-----------------------------");

        //sort lastName by length
        System.out.println("sorting lastName by length: ");
        List<String> sortLastName = personList.stream()
                .map(Person::getLastName)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        sortLastName.forEach(System.out::println);
        System.out.println("--------------------------------");

        //people who live in Tehran and zone 5
        System.out.println("people who live in Tehran and zone 5: ");
        List<Person> tehranzone5 = personList.stream()
                .filter(p -> p.getAddress().getCity().equals("Tehran") &&
                        p.getAddress().getZone().equals("5"))
                .collect(Collectors.toList());
        tehranzone5.forEach(System.out::println);
    }

}
