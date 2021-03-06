package com.bupt.core.system.dao;

import com.bupt.core.system.model.Department;
import com.bupt.core.system.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int deleteByPrimaryKey(Integer departmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    Department selectByPrimaryKey(Integer departmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_security_department
     *
     * @mbggenerated Mon Jul 22 00:14:59 CST 2013
     */
    int updateByPrimaryKey(Department record);
}