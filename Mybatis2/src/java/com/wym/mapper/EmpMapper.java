package com.wym.mapper;

import com.wym.model.Emp;
import com.wym.model.EmpExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EmpMapper {
    @Select({
            "select",
            "eid, name, sex, email, salary, cid",
            "from emp",
            "where cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="eid", property="eid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
            @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
            @Result(column="salary", property="salary", jdbcType=JdbcType.VARCHAR),
            @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER)
    })
    List<Emp> selectEmpsByCid(Integer cid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @SelectProvider(type=EmpSqlProvider.class, method="countByExample")
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @DeleteProvider(type=EmpSqlProvider.class, method="deleteByExample")
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @Delete({
        "delete from emp",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @Insert({
        "insert into emp (eid, name, ",
        "sex, email, salary, ",
        "cid)",
        "values (#{eid,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=CHAR}, #{email,jdbcType=VARCHAR}, #{salary,jdbcType=VARCHAR}, ",
        "#{cid,jdbcType=INTEGER})"
    })
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @InsertProvider(type=EmpSqlProvider.class, method="insertSelective")
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @SelectProvider(type=EmpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="eid", property="eid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="salary", property="salary", jdbcType=JdbcType.VARCHAR),
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER)

    })
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @Select({
        "select",
        "eid, name, sex, email, salary, cid",
        "from emp",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="eid", property="eid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="salary", property="salary", jdbcType=JdbcType.VARCHAR),
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER),
        @Result(column = "cid",property ="company",
            one=@One(select = "com.wym.mapper.CompanyMapper.selectByPrimaryKey"))
    })
    Emp selectByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    @Update({
        "update emp",
        "set name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=CHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "salary = #{salary,jdbcType=VARCHAR},",
          "cid = #{cid,jdbcType=INTEGER}",
        "where eid = #{eid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Emp record);
}