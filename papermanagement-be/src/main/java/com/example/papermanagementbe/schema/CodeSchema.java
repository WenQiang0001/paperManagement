package com.example.papermanagementbe.schema;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName code
 */
@TableName(value ="code")
@Data
public class CodeSchema implements Serializable {
    /**
     * 
     */
    @TableField(value = "Manager")
    private String manager;

    /**
     * 
     */
    @TableField(value = "Teacher")
    private String teacher;

    /**
     * 
     */
    @TableField(value = "Student")
    private String student;

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
        CodeSchema other = (CodeSchema) that;
        return (this.getManager() == null ? other.getManager() == null : this.getManager().equals(other.getManager()))
            && (this.getTeacher() == null ? other.getTeacher() == null : this.getTeacher().equals(other.getTeacher()))
            && (this.getStudent() == null ? other.getStudent() == null : this.getStudent().equals(other.getStudent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManager() == null) ? 0 : getManager().hashCode());
        result = prime * result + ((getTeacher() == null) ? 0 : getTeacher().hashCode());
        result = prime * result + ((getStudent() == null) ? 0 : getStudent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", manager=").append(manager);
        sb.append(", teacher=").append(teacher);
        sb.append(", student=").append(student);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}