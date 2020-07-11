package xxx.mybatis.manytomany.mapper;

import xxx.mybatis.manytomany.model.Student;
import xxx.mybatis.manytomany.model.StudentCourseLink;

import java.util.List;

public interface StudentMapper {
    /*
     * 查询所有学生及他们的选择课程的信息
     * @return
     * @throws Exception
     */
    public List<Student> selectStudentCourse() throws Exception;

    /*
     * 删除指定 id 用户的某门课（根据课程 id）的选课情况
     * @param StudentCourseLink
     * @throws Exception
     */
    public void deleteStudentCourseById(StudentCourseLink scLink) throws Exception;
}