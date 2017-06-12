package si.gcarrot.repordcard;

import java.util.ArrayList;

/**
 * Created by Urban on 6/8/17.
 */

public class ReportCard {
    public static final double TOTAL = 5.0d;

    private String mStudentName;
    private String mSchoolName;
    private String mRollNumber;

    private int englishMark, mathMark, socialMark, programmingMark, gameDesignMark;


    public ReportCard(String studentName, String schoolName, String rollNumber, int engMark, int matMark, int socMark, int proMark, int gadMark){
        mSchoolName = schoolName;
        mStudentName = studentName;
        mRollNumber = rollNumber;

        englishMark = engMark;
        mathMark = matMark;
        socialMark = socMark;
        programmingMark = proMark;
        gameDesignMark = gadMark;
    }

    public String getStudentName(){
        return mStudentName;
    }

    public String getSchoolName(){
        return mSchoolName;
    }

    public String getRollNumber(){
        return mRollNumber;
    }

    public void setEnglishMark(int mark){
        this.englishMark = mark;
    }

    public int getEnglishMark(){
        return englishMark;
    }

    public void setMathMark(int mark){
        this.mathMark = mark;
    }

    public int getMathMark(){
        return mathMark;
    }

    public void setSocialMark(int mark){
        this.socialMark = mark;
    }

    public int getSocialMark(){
        return socialMark;
    }

    public void setProgrammingMark(int mark){
        this.programmingMark = mark;
    }

    public int getProgrammingMark(){
        return programmingMark;
    }

    public void setGameDesignMark(int mark){
        this.gameDesignMark = mark;
    }

    public int getGameDesignMark(){
        return gameDesignMark;
    }

    public String getGrade(){
        String grade = "";
        int Sum = this.englishMark + this.gameDesignMark + this.programmingMark + this.socialMark + this.mathMark;
        double percentage = Sum / TOTAL;

        if (percentage >= 95.0) {
            grade = "A+";
        } else if (percentage < 95.0 && percentage >= 80.0) {
            grade = "A";
        } else if (percentage < 90.0 && percentage >= 80.0) {
            grade = "B";
        } else if (percentage < 80.0 && percentage >= 70.0) {
            grade = "C";
        } else if (percentage < 70.0 && percentage >= 60.0) {
            grade = "D";
        } else if (percentage < 60.0) {
            grade = "Fail";
        }

        return grade;
    }

    public ArrayList<Grade> getArrayList(){
        ArrayList<Grade> grade = new ArrayList<Grade>();
        grade.add(new Grade("English", String.valueOf(englishMark)));
        grade.add(new Grade("Math", String.valueOf(mathMark)));
        grade.add(new Grade("Programming", String.valueOf(programmingMark)));
        grade.add(new Grade("Game desing", String.valueOf(gameDesignMark)));
        grade.add(new Grade("Social", String.valueOf(socialMark)));
        grade.add(new Grade("Grade", getGrade()));

        return grade;
    }

    public String displayInfo() {
        return "University: " + mSchoolName + '\n' +
                "Student Name: " + mStudentName + '\n' +
                "Roll Number: " + mRollNumber + '\n' +
                "English Mark: " + englishMark + '\n' +
                "Math Mark: " + mathMark + '\n' +
                "Programming Mark: " + programmingMark + '\n' +
                "Game desing Mark: " + gameDesignMark + '\n' +
                "Social Mark: " + socialMark + '\n' +
                "Grade: " + getGrade();
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "student name='" + mStudentName + '\'' +
                "University='" + mSchoolName + '\'' +
                ", roll number=" + mRollNumber +
                ", english mark=" + englishMark +
                ", math mark=" + mathMark +
                ", programming mark=" + programmingMark +
                ", game desing mark=" + gameDesignMark +
                ", social mark=" + socialMark +
                ", grade='" + getGrade() + '\'' +
                '}';
    }
}
