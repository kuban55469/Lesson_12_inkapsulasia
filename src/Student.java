public class Student {
    private String name;
    private String surname;
    private int age;
    private String [] courses;


    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setSurname(String surname){
        this.surname= surname;
    }
    String getSurname(){
        return surname;
    }

    void setAge (int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setCourses(String[] courses){
        this.courses=courses;
    }

    String [] getCourses(){
        return courses;
    }



}
