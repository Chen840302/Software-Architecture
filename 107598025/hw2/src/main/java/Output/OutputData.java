package Output;

public interface OutputData {
    String getCourseName();

    void setCourseName(String courseName);

    String getCourseDescription();

    void setCourseDescription(String courseDescription);

    String getCourseTarget();

    void setCourseTarget(String courseTarget);

    int getCoursePrice();

    void setCoursePrice(int coursePrice);

    String getCourseAttention();

    void setCourseAttention(String courseAttention);

    String getCourseRemark();

    void setCourseRemark(String courseRemark);

    boolean getIsSuccess();

    void setIsSuccess(boolean isSuccess);
}
