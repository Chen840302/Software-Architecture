package Output;

public class UpdateCourseOutputData implements OutputData {
    private boolean isSuccess;

    public UpdateCourseOutputData(boolean isSuccess){
        this.isSuccess = isSuccess;
    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public void setCourseName(String courseName) {

    }

    @Override
    public String getCourseDescription() {
        return null;
    }

    @Override
    public void setCourseDescription(String courseDescription) {

    }

    @Override
    public String getCourseTarget() {
        return null;
    }

    @Override
    public void setCourseTarget(String courseTarget) {

    }

    @Override
    public int getCoursePrice() {
        return 0;
    }

    @Override
    public void setCoursePrice(int coursePrice) {

    }

    @Override
    public String getCourseAttention() {
        return null;
    }

    @Override
    public void setCourseAttention(String courseAttention) {

    }

    @Override
    public String getCourseRemark() {
        return null;
    }

    @Override
    public void setCourseRemark(String courseRemark) {

    }

    @Override
    public boolean getIsSuccess() {
        return this.isSuccess;
    }

    @Override
    public void setIsSuccess(boolean isSuccess) {

    }
}
