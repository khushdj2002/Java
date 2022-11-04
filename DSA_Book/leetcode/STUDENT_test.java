import java.util.Scanner;

public class STUDENT_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        STUDENT s1 = new STUDENT(sc.nextInt());
        //System.out.println(s1.students);

        STUDENT arr[] = new STUDENT[s1.students];

        for (int i = 0; i < s1.students; i++) {
            arr[i]=new STUDENT(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
        }

        double max = 0;
        String a="";
        for (int i = 0; i < s1.students; i++) {
            if(arr[i].cut_off>max){
                max=arr[i].cut_off;
                a=arr[i].name;
            }
        }
        System.out.println("Student name : "+a+"\n"+"Student cutoff mark : "+max);
    }
}
