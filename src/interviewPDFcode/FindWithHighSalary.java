package interviewPDFcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindWithHighSalary {
 List<Mason> masons = Arrays.asList(new Mason("Fiber",45),
         new Mason("Rubber",65),
         new Mason("Flash",95));

    public void main(String[] args) {
        Optional<Mason> maxSalaryEmp =
                masons.stream().max(Comparator.comparing(Mason::getSalary));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));


    }
}

// Pojo class
class Mason{
    String name;
    int salary;

    public Mason(String material, int price) {
        this.name = material;
        this.salary = price;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "material='" + name + '\'' +
                ", price=" + salary+
                '}';
    }

    public static <U extends Comparable<? super U>, T> U getSalary(T t) {
        return (U)"Value of U";
    }
}