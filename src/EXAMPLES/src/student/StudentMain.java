package student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);
        //createStudent()로 이름, 나이, 성적을 넣어 생성, 반환된 값 student1, student2에 저장
        printStudent(student1);//printStudent()로 출력하기
        printStudent(student2);//printStudent()로 출력하기
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();//student 생성
        student.name = name;//받아온 이름 넣기
        student.age = age;//받아온 나이 넣기
        student.grade = grade;//받아온 성적 넣기
        return student;//student 반환
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
    //받아온 참조값에 저장되어 있는 이름, 나이, 성적 출력하기
}
