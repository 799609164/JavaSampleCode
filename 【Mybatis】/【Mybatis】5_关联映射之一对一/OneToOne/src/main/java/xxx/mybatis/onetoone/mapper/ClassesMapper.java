package xxx.mybatis.onetoone.mapper;

import xxx.mybatis.onetoone.model.Classes;

public interface ClassesMapper {
    /*
     * 根据 id 查询班级 Classes
     * @param id
     * @return
     * @throws Exception
     */
     // 返回 Classes 类，Classes 类中包含了一个 HeadTeacher 类的对象
    public Classes selectClassById(Integer id) throws Exception;
}