package org.functional;

public  class Students {


    public Students(String name, Integer age, Gender gender, Double marks){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }


    private  String name;

    private  Integer age;

    private  Gender gender;

    private  Double marks;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Double getMarks() {
        return marks;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                '}';
    }

    public enum Gender{
        MALE,FEMALE;
    }

}
