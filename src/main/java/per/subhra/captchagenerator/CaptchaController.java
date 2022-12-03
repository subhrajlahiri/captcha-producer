package per.subhra.captchagenerator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    private CaptchaService captchaService;

    public CaptchaController(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }

    @GetMapping("/get-captcha-image")
    public ResponseEntity<CaptchaResponse> createCaptcha() {
        CaptchaResponse response = new CaptchaResponse();
        try {
            String[] imgText = captchaService.produceImage();
            response = new CaptchaResponse(imgText[0], imgText[1], null, false);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            ex.getStackTrace();
            response = new CaptchaResponse(null, null,
                    "Error: " + ex.getLocalizedMessage(), true);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
