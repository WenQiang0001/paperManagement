package com.example.papermanagementbe.schema;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName manager
 */
@TableName(value ="manager")
@Data
public class ManagerSchema implements Serializable {
    /**
     * 
     */
    @TableId(value = "Id")
    private Integer id;

    /**
     * 老师编号
     */
    @TableField(value = "TeacherNo")
    private String teacherNo;

    /**
     * 学生编号
     */
    @TableField(value = "StudentNo")
    private String studentNo;

    /**
     * 告示编号
     */
    @TableField(value = "AdvertisingNo")
    private String advertisingNo;

    /**
     * 管理员账号
     */
    @TableField(value = "ManagerAccount")
    private String managerAccount;

    /**
     * 管理员用户名
     */
    @TableField(value = "ManagerName")
    private String managerName;

    /**
     * 管理员密码
     */
    @TableField(value = "ManagerPassword")
    private String managerPassword;

    /**
     * 管理员编码
     */
    @TableField(value = "ManagerNo")
    private String managerNo;

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
        ManagerSchema other = (ManagerSchema) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherNo() == null ? other.getTeacherNo() == null : this.getTeacherNo().equals(other.getTeacherNo()))
            && (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getAdvertisingNo() == null ? other.getAdvertisingNo() == null : this.getAdvertisingNo().equals(other.getAdvertisingNo()))
            && (this.getManagerAccount() == null ? other.getManagerAccount() == null : this.getManagerAccount().equals(other.getManagerAccount()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()))
            && (this.getManagerPassword() == null ? other.getManagerPassword() == null : this.getManagerPassword().equals(other.getManagerPassword()))
            && (this.getManagerNo() == null ? other.getManagerNo() == null : this.getManagerNo().equals(other.getManagerNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherNo() == null) ? 0 : getTeacherNo().hashCode());
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getAdvertisingNo() == null) ? 0 : getAdvertisingNo().hashCode());
        result = prime * result + ((getManagerAccount() == null) ? 0 : getManagerAccount().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
        result = prime * result + ((getManagerPassword() == null) ? 0 : getManagerPassword().hashCode());
        result = prime * result + ((getManagerNo() == null) ? 0 : getManagerNo().hashCode());
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
        sb.append(", studentNo=").append(studentNo);
        sb.append(", advertisingNo=").append(advertisingNo);
        sb.append(", managerAccount=").append(managerAccount);
        sb.append(", managerName=").append(managerName);
        sb.append(", managerPassword=").append(managerPassword);
        sb.append(", managerNo=").append(managerNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}