public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("KIm Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                           + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i =0;i< course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + " , ");
        }

        System.out.println();
        System.out.print("Number of students in course2: "
                         + course2.getNumberOfStudents());
    }
}

class Course{  //创建Course类
    private String courseName;  //课程名称
    private String[] students = new String[100]; //存储选课学生的数组，人数最多是100.
    private int numberOfStudents;  //学生人数

    public Course(String courseName){  //构造方法
        this.courseName = courseName;
    }

    public void addStudent(String student){  //向这门课添加新的学生
        students[numberOfStudents] = student ;
        numberOfStudents++;
    }

    public String[] getStudents(){ //返回选课的学生
        return students;
    }

    public int getNumberOfStudents(){ //返回选课的学生人数
        return numberOfStudents;
    }

    public String getCourseName(){   //返回课程名称
        return courseName;
    }

    public void dropStudent(String student){ //从这门课退掉一个学生
        if(numberOfStudents > 100){   //如果人数大于100，就退掉多余的学生
            students[numberOfStudents] =student;
            numberOfStudents--;

        }
    }

}
