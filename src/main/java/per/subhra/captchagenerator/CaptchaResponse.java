package per.subhra.captchagenerator;

public class CaptchaResponse {
    private String imgText;
    private String text;
    private String errorText;
    private Boolean isError;
    public CaptchaResponse() {}
    public CaptchaResponse(String imgText, String text, String errorText, Boolean isError) {
        this.imgText = imgText;
        this.text = text;
        this.errorText = errorText;
        this.isError = isError;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImgText() {
        return imgText;
    }

    public void setImgText(String imgText) {
        this.imgText = imgText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }

    @Override
    public String toString() {
        return "CaptchaResponse{" +
                "imgText='" + imgText + '\'' +
                ", text='" + text + '\'' +
                ", errorText='" + errorText + '\'' +
                ", isError=" + isError +
                '}';
    }
}
