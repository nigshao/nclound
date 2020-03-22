package ns.clound.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class ResponseEntity extends HashMap<String, Object> {
    private static final long serialVersionUID = 5840782391054671990L;

    public ResponseEntity() {
        put("code", 0);
        put("msg", "success");
    }

    public static ResponseEntity error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static ResponseEntity error(String msg) {
        return error(500, msg);
    }

    private static ResponseEntity error(int code, String msg) {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.put("code", code);
        responseEntity.put("msg", msg);
        return responseEntity;
    }

    public static ResponseEntity ok(String msg) {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.put("msg", msg);
        return responseEntity;
    }

    public static ResponseEntity ok(Map<String, Object> map) {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.putAll(map);
        return responseEntity;
    }

    public static ResponseEntity ok() {
        return new ResponseEntity();
    }

    @Override
    public ResponseEntity put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
