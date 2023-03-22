package com.example.papermanagementbe.schema;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName teacher
 */
@TableName(value ="teacher")
@Data
public class TeacherSchema implements Serializable {
    /**
     * 
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer id;

    /**
     * 教师编码
     */
    @TableField(value = "TeacherNo")
    private String teacherNo;

    /**
     * 教师账号
     */
    @TableField(value = "TeacherAccount")
    private String teacherAccount;

    /**
     * 教师用户名
     */
    @TableField(value = "TeacherName")
    private String teacherName;

    /**
     * 教师密码
     */
    @TableField(value = "TeacherPassword")
    private String teacherPassword;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TeacherSchema other = (TeacherSchema) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherNo() == null ? other.getTeacherNo() == null : this.getTeacherNo().equals(other.getTeacherNo()))
            && (this.getTeacherAccount() == null ? other.getTeacherAccount() == null : this.getTeacherAccount().equals(other.getTeacherAccount()))
            && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()))
            && (this.getTeacherPassword() == null ? other.getTeacherPassword() == null : this.getTeacherPassword().equals(other.getTeacherPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherNo() == null) ? 0 : getTeacherNo().hashCode());
        result = prime * result + ((getTeacherAccount() == null) ? 0 : getTeacherAccount().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        result = prime * result + ((getTeacherPassword() == null) ? 0 : getTeacherPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherNo=").append(teacherNo);
        sb.append(", teacherAccount=").append(teacherAccount);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherPassword=").append(teacherPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}