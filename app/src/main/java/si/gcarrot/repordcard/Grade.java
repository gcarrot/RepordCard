package si.gcarrot.repordcard;

/**
 * Created by Urban on 6/10/17.
 */

public class Grade {

    /** Default translation fot the word **/
    private String mClassName;

    /** Miwok translation fot the word **/
    private String mClassGrade;


    public Grade(String className, String classGrade){
        mClassGrade = classGrade;
        mClassName = className;
    }

    /**
     * Get the default translation of the word
     */

    public String getClassName(){
        return mClassName;
    }

    /**
     * Get the miwok translation of the word
     */

    public String getClassGrade(){
        return mClassGrade;
    }
}
