package com.example.springbootconfig.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
/*
   yaml格式：
   字面量： key: value
        注意： 双引号中 的转义字符会作为本身的意思，单引号中的转义字符会被当成一个字符串
   对象，map：key: value形式，注意缩进，也可以采用行内写法 friends: {lastname: zhangshan,age: 15}
   数组：用短横杆  也可以行内写法 pets：[cat,dog,pig]

   将配置文件中的数据绑定到java bean中，注意需要放到容器中才能使用这个特性，可以使用JSR303数据校验
   @component
   @ConfigurationProperties(prefix = "person")
   @Validated
   优点：
        可以批量注入配置文件中的属性
        松散绑定
        驼峰命名
        支持数据校验


   第二种：
    @value   跟在xml方式中的配置一样
    优点
        支持spel，只支持基本数据

   @PropertySource(value = {"clathpath:person.properties"})  注解可以应用其他的配置文件
   注意优先级：application.properties > application.yaml > @propertySource引入的其他文件
   @ImportResource(locations = {"classpath:defaultSpring.xml"}) 映入外部的spring配置文件
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//Validated
public class Person {

    //@Value("${person.name}")
   // @Email
    private String name;
    //@Value("#{11*2}")
    private Integer age;
    private Boolean isman;
    private Date birthday;
    private Map<String,Object> maps;
    private ArrayList<String> list;
    private Dog dog;

    private Logger logger = LoggerFactory.getLogger(getClass());

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

    public Boolean getIsman() {
        return isman;
    }

    public void setIsman(Boolean isman) {
        this.isman = isman;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isman=" + isman +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
