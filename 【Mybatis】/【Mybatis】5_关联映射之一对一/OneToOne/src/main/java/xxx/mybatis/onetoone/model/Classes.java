package xxx.mybatis.onetoone.model;

public class Classes {
    private Integer id;
    private String name;
    // 用于映射一对一的关联关系
    private HeadTeacher teacher;

    public Classes() {

    }

    public Classes(Integer id, String name, HeadTeacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeadTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(HeadTeacher teacher) {
        this.teacher = teacher;
    }
}