package com.dm.insurance.config;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.dm.insurance.vo.PayVo;
import com.dm.insurance.vo.PayVo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "alipay")
@Component
@Data
public class AlipayTemplate {


//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102900776003";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC4M7fKocq8WLcaTelXMq/A1dS9QJ85tCKw6/F7MtG3ikHmteFWGGqClx+7e3Hv+lMAA7IQqdpGXZsXmwrAJPjaqLHtwf//yUVKdAKWb5nrIldDBCn/ilLYGEGF3c47WCwHtCb5ebCji6Ko7+GFs3WUq3IAcs/je3UVfPidlFol/YUHhesnHj15JlNOEuPEXe0sNBz9+QMGHKvlFVXN5tGhOBhfu7eKJRfnLT0zIN3V0SFFh+sv6VJR8myAHM65CNu5EQEzGT9XrS412DXiffQMPndlN83QfQszv32mskQNlfzIuwEs2VUV4R2N4R80TcI2klEjMUed+We25SnoiMyZAgMBAAECggEAfqMPuD+DIfnb6DmoMkqmiex4VaQX05QERZ3wZsKJa6WhqPth787Zau564mn76wAuD9R6lvovFjFEbvYobfD9JVbU/KBjX3cALC+Vl9ch+oWheHFkbkqqqeYDJgVXw3Ta0HEKWnlO9yEIsxw377NxIsS7m5NTWRGHbT59rdhQIcz+B++lQC4UuD2zP6WdC0q092fB4kfRmkw3HCiWtahoa7gXEzmvN8zHZUFiEaewlQQ5ucbipWPdqVyOrrNVVynTmHXvD+6D9iDTjSpapmDIMbb09O8STWbtbnbMdDycTA6lewc5tA3+ZbMHOxb+L9Wc4J5oXS9FUYSrqGjm8eoAAQKBgQDsDALv4s0mjGn9Jm/Bmd1qjfh2g8V2/ro4c2wQfM4CtHdQJgFwNDwqcipQeBzMeD5Vdp+krZuPXP+2yxZIPzkTGWouGO2lgKP4IuPMFK2DGjx5D32q+Gry8iEiQfmR/8Z+mTjGk/5tdubcCjXDVg7tuEcgxJfB2SBekqNj3N2OxQKBgQDHxcwt53rJ+tAW5a2EEemZg+NTJchX1cK3Nu+G9o50oO6VnaHmsNd6Q4HKzd6Zv3SH0dAdKqFhbVg1pKaAmRbQPzvfbrrCuQI/RGvSzL/QHOv0oYW7Okp83K96DtoOXks2IW+/Web7U8mjEgsIjn8fGCOAZQLH8j7etCPeQcEjxQKBgGEq6KKbOFwf/RlqkyKdFhpg6uDOiaDcZwgJ63g2CA/w/hSOMJVhy0qlyGlrqF87OF2yATGnDZxMai9zFm8TJ4mHMsBbHqi8dcMVibRe5rZLPI2RJOgWbuAncCBMDFJfefRvWoHUNi4Vfh8iTNNmP6r36r/AbcAsgzirIHthVgsJAoGAC4v3PT//7OS+WlR0LwoKAoGJBilM5ybH1mcqeRaPLVaP873kubzG954nRl2X3DMgvSj3angoU8VKL++QYCZ5FxhQkZ2I1fBznMyLnueOvqytRrp/TE8WNxlaWye4mtQAbOSJ3PmJTEWPhglo8dmqp1Vx193+xyfNUnn/CL2sODECgYEAj46YvpYQCw6WyFKS3xVES6lk2zyxGWt7RVc7XbAE7RBr5fQrBwWjWLpiGkBbUWWm4mgdx2taX8bQop3Nmytm1xoKy6v1QajtsZEBGnycW1tMIu6hHfsmFsR/IqCmh0gVdX4mdJGJATigNrbNi/4uQ9iJqupmBx40LvZEr1v4X7E=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuDO3yqHKvFi3Gk3pVzKvwNXUvUCfObQisOvxezLRt4pB5rXhVhhqgpcfu3tx7/pTAAOyEKnaRl2bF5sKwCT42qix7cH//8lFSnQClm+Z6yJXQwQp/4pS2BhBhd3OO1gsB7Qm+Xmwo4uiqO/hhbN1lKtyAHLP43t1FXz4nZRaJf2FB4XrJx49eSZTThLjxF3tLDQc/fkDBhyr5RVVzebRoTgYX7u3iiUX5y09MyDd1dEhRYfrL+lSUfJsgBzOuQjbuREBMxk/V60uNdg14n30DD53ZTfN0H0LM799prJEDZX8yLsBLNlVFeEdjeEfNE3CNpJRIzFHnflntuUp6IjMmQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://store.free.idcfengye.com/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/#/login";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";

    public String pay(PayVo vo) throws AlipayApiException {

        //AlipayClient alipayClient = new DefaultAlipayClient(AlipayTemplate.gatewayUrl, AlipayTemplate.app_id, AlipayTemplate.merchant_private_key, "json", AlipayTemplate.charset, AlipayTemplate.alipay_public_key, AlipayTemplate.sign_type);
        //1、根据支付宝的配置生成一个支付客户端
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl,
                app_id, merchant_private_key, "json",
                charset, alipay_public_key, sign_type);

        //2、创建一个支付请求 //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(return_url);
        alipayRequest.setNotifyUrl(notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = vo.getOut_trade_no();
        //付款金额，必填
        String total_amount = vo.getTotal_amount();
        //订单名称，必填
        String subject = vo.getSubject();
        //商品描述，可空
        String body = vo.getBody();

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String result = alipayClient.pageExecute(alipayRequest).getBody();

        //会收到支付宝的响应，响应的是一个页面，只要浏览器显示这个页面，就会自动来到支付宝的收银台页面
        System.out.println("支付宝的响应：" + result);

        return result;

    }
}
