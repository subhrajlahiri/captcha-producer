package per.subhra.captchagenerator;

import com.google.code.kaptcha.Producer;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Service
public class CaptchaService {

    private Producer captchaProducer;

    public CaptchaService(Producer captchaProducer) { this.captchaProducer = captchaProducer; }

    public String[] produceImage() throws IOException {

        String capText = captchaProducer.createText();

        BufferedImage image = captchaProducer.createImage(capText);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ImageIO.write(image, "jpg", byteArrayOutputStream);

        return new String[] {
                Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray()),
                capText
        };
    }
}
