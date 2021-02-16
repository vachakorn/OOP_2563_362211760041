package LAB8;

public class person {
    //Class Attributes
    private  String pid; //เลขบัตรประชาชน
    private  String name; // ชื่อ
    private  int    age; //อายุ
    private  String gender;//เพศ
    private  String tel;//เบอร์โทร
    //Constuctors

    public person() {
    }

    public person(String pid, String name, int age, String gender, String tel) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
    }
    //getter and setter

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    //toString

    @Override
    public String toString() {
        return "person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
