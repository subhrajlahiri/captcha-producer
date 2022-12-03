package per.subhra.captchagenerator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kaptcha.config")
public class CaptchaConfig {
    private String imageWidth;
    private String imageHeight;
    private String textProducerCharString;
    private String textProducerCharLength;
    private String headerName;
    private String useBorder;
    private String textColor;

    public CaptchaConfig() {
    }

    public CaptchaConfig(String imageWidth,
                         String imageHeight,
                         String textProducerCharString,
                         String textProducerCharLength,
                         String headerName,
                         String useBorder,
                         String textColor) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.textProducerCharString = textProducerCharString;
        this.textProducerCharLength = textProducerCharLength;
        this.headerName = headerName;
        this.useBorder = useBorder;
        this.textColor = textColor;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getTextProducerCharString() {
        return textProducerCharString;
    }

    public void setTextProducerCharString(String textProducerCharString) {
        this.textProducerCharString = textProducerCharString;
    }

    public String getTextProducerCharLength() {
        return textProducerCharLength;
    }

    public void setTextProducerCharLength(String textProducerCharLength) {
        this.textProducerCharLength = textProducerCharLength;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getUseBorder() {
        return useBorder;
    }

    public void setUseBorder(String useBorder) {
        this.useBorder = useBorder;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
