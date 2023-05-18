package cn.alex.comparator.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Alex
 */
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 学生ID
     */
    private int sid;
    /**
     * 姓名
     */
    private String sname;
    /**
     * 年龄
     */
    private int sage;
    /**
     * 身份证号
     */
    private String idcard;
    /**
     * 父节点ID
     * 0 本科生
     *   1,2,3
     * 1 大专生
     *   4,5,6
     */
    private Long parentId;

    private List<StudentEntity> children;

    public StudentEntity() {
    }

    public StudentEntity(int sid, String sname, int sage, String idcard, Long parentId, List<StudentEntity> children) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.idcard = idcard;
        this.parentId = parentId;
        this.children = children;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<StudentEntity> getChildren() {
        return children;
    }

    public void setChildren(List<StudentEntity> children) {
        this.children = children;
    }
}
