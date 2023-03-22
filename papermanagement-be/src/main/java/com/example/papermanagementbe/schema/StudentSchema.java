package com.example.papermanagementbe.schema;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
@Data
public class StudentSchema implements Serializable {
    /**
     * 
     */
    @TableId(value = "Id")
    private Integer id;

    /**
     * 学生用户名
     */
    @TableField(value = "StudentName")
    private String studentName;

    /**
     * 学生编码
     */
    @TableField(value = "StudentNo")
    private String studentNo;

    /**
     * 学生账号
     */
    @TableField(value = "StudentAccount")
    private String studentAccount;

    /**
     * 学生密码
     */
    @TableField(value = "StudentPassword")
    private String studentPassword;

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
        StudentSchema other = (StudentSchema) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStudentName() == null ? other.getStudentName() == null : this.getStudentName().equals(other.getStudentName()))
            && (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getStudentAccount() == null ? other.getStudentAccount() == null : this.getStudentAccount().equals(other.getStudentAccount()))
            && (this.getStudentPassword() == null ? other.getStudentPassword() == null : this.getStudentPassword().equals(other.getStudentPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStudentName() == null) ? 0 : getStudentName().hashCode());
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getStudentAccount() == null) ? 0 : getStudentAccount().hashCode());
        result = prime * result + ((getStudentPassword() == null) ? 0 : getStudentPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentNo=").append(studentNo);
        sb.append(", studentAccount=").append(studentAccount);
        sb.append(", studentPassword=").append(studentPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}