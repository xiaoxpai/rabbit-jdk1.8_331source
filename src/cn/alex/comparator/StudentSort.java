package cn.alex.comparator;

import cn.alex.comparator.entity.StudentEntity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 一种查询树结构
 * @author Alex
 */
public class StudentSort {
    public static void main(String[] args) {

        StudentEntity s1 = new StudentEntity(1, "Alex", 18, "123456789",0L,null);
        StudentEntity s2 = new StudentEntity(2,"Bob",24,"123456789",1L,null);
        StudentEntity s3 = new StudentEntity(3,"Dancity",23,"123456789",0L,null);
        StudentEntity s4 = new StudentEntity(4,"Jack",23,"123456789",1L,null);
        StudentEntity s5 = new StudentEntity(5,"Sharry",27,"123456789",0L,null);
        StudentEntity s6 = new StudentEntity(6,"Haidi",25,"123456789",1L,null);
        StudentEntity s7 = new StudentEntity(7,"Deep",28,"123456789",0L,null);
        StudentEntity s8 = new StudentEntity(8,"Yayoo",30,"123456789",1L,null);

        //创建一个ArrayList集合
        List<StudentEntity> list = new ArrayList<>();
        list.add(s1);  list.add(s2);
        list.add(s3);  list.add(s4);
        list.add(s5);  list.add(s6);
        list.add(s7);  list.add(s8);

        List<StudentEntity> studentEntities = studentTree(list);

    }

    private static List<StudentEntity> studentTree(List<StudentEntity> list) {
        //创建一个ArrayList集合
        List<StudentEntity> result = new ArrayList<>();

        //创建一个LinkedHashMap集合
        LinkedHashMap<Integer,StudentEntity> map = new LinkedHashMap<>(list.size());
        //  遍历所有学生列表，将学生主键id 按照插入顺序添加到map集合,以sid为key，学生对象为value
        list.forEach(e->map.put(e.getSid(),e));
        Set<Map.Entry<Integer, StudentEntity>> entries = map.entrySet();
        entries.forEach(e->{
                //获取所有的value:学生对象
            StudentEntity value = e.getValue();
            if (value!=null){
                //从map中获取父节点id
                StudentEntity objParent = map.get(0);
                //判断是否存在父节点
                if (objParent != null) {
                    //获取父节点的子节点集合
                    List<StudentEntity> children = objParent.getChildren();
                    //判断子节点集合是否为空
                    if (children == null) {
                        //创建一个新的子节点集合
                        children = new ArrayList<>();
                        //将子节点集合添加到父节点中
                        objParent.setChildren(children);
                    }
                    //将当前学生对象添加到父节点的子节点集合中
                    children.add(value);
                }else {
                    result.add(value);
                }
            }

        });

        return result;
    }
}
