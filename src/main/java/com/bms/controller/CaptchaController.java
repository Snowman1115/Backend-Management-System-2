package com.bms.controller;

import cn.hutool.core.codec.Base64Encoder;
import com.bms.common.result.Result;
import com.google.code.kaptcha.Producer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * Captcha Controller
 * @author Sn0w_15
 * @since 2024-07-24
 */
@RestController
public class CaptchaController {

    @Resource
    private Producer producer;

    /**
     * Generate Verification Code
     * @return Result
     */
    @RequestMapping("/captcha")
    public Result getCaptcha() throws IOException {
        String key= UUID.randomUUID().toString(); // Generate Unique Key
        String code = producer.createText();

        /*log.info("code--->{}",code);*/

        BufferedImage image = producer.createImage(code);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outputStream);

        Base64Encoder encoder = new Base64Encoder();
        String str = "data:image/jpeg;base64,";

        String base64Img = str + encoder.encode(outputStream.toByteArray());

        /*redisUtil.hset(Constant.CAPTCHA_KEY,key,code,60*5);*/

        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("captchaImg",base64Img);
        resultMap.put("uuid",key);
        return Result.success(resultMap);
    }

}
