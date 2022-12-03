package per.subhra.captchagenerator;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class CaptchaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaptchaGeneratorApplication.class, args);
    }

    @Bean(name = "captchaProducer")
    public Producer createCaptchaProducer(CaptchaConfig captchaConfig) {
        DefaultKaptcha captcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.put(Constants.KAPTCHA_IMAGE_HEIGHT, captchaConfig.getImageHeight());
        properties.put(Constants.KAPTCHA_IMAGE_WIDTH, captchaConfig.getImageWidth());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, captchaConfig.getTextProducerCharLength());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, captchaConfig.getTextProducerCharString());
        properties.put(Constants.KAPTCHA_BORDER, captchaConfig.getUseBorder());
        properties.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, captchaConfig.getTextColor());
        properties.put(Constants.KAPTCHA_NOISE_COLOR, captchaConfig.getTextColor());
        captcha.setConfig(new Config(properties));
        return captcha;
    }
}
