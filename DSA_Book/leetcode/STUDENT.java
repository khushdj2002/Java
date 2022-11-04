public class STUDENT {
    int students;
    String name;
    String roll_no;
    String course;
    String branch;
    String gender;
    double cut_off;

    STUDENT(int students){
        this.students=students;
    }

    STUDENT(String name,String roll_no,String course,String branch,String gender,double cut_off){
        //this.students=students;
        this.name=name;
        this.roll_no=roll_no;
        this.course=course;
        this.branch=branch;
        this.gender=gender;
        this.cut_off=cut_off;

    }

//    public double Highest(){
//        double max=0;
//        for (int i = 0; i < students; i++) {
//            if(max>cut_off){
//                max=cut_off;
//            }
//        }
//        return max;
//    }

}
