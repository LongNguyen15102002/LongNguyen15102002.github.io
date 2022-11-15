package com.example.demobean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.servlet.http.PushBuilder;
import java.util.Random;

@SpringBootApplication
public class DemoBeanApplication {
    // Tạo bean bằng cách dấu annotation lên class:
    // Controller, RestController, Service, Repository,...
    // -> Tạo ra 1 đối tượng duy nhất (Singleton Pattern)   -> Được đưa vào application context để quản lí
    // -> Khi muốn sử dụng 1 bean (inject bean):
    // 1. Sử dụng @Autowired
    // 2. Sử dụng constructor (recommend)
    // 3. Sử dụng setter

    // Tạo bean bằng cách dấu anotation lên method:
    // @Bean : trả về 1 đối tượng -> @Configuration, @SpringBootApplication
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoBeanApplication.class, args);

        User user = context.getBean(User.class);
        user.hello();

//        Student student = context.getBean(Student.class);
//        student.showInfo();

        Student student1 = context.getBean("Student1", Student.class);
        student1.showInfo();
        student1.showVehicle();

        Student student2 = context.getBean("Student2", Student.class);
        student2.showInfo();

        Student student3 = context.getBean("Student3", Student.class);
        student3.showInfo();

        Random random = context.getBean(Random.class);
        System.out.println(random.nextInt(1000));
    }
    @Bean("Student1")
    public Student createStudent(){
        return new Student(" Nguyen Van A", "a@gmail.com");
    }

    @Bean("Student2")
    public Student createStudent1(){
        return new Student(" Tran Van B", "b@gmail.com");
    }

    @Bean
    public Random random() {
        return new Random();
    }
}
