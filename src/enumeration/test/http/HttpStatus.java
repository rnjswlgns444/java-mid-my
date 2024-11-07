package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "internal Sever Error");

    private final int code;
    private final String message;
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    public static HttpStatus findByCode(int code) {
        //HttpStatus[] values = values(); // 원래 HttpStatus.values()인데 어짜피 내꺼니까 생략 가능
        for (HttpStatus status : values()) { //위 문장을 굳이 쓸 필요가 없으니까 합쳐서 한번에!
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

/*    public static HttpStatus findByCode(int code) {
        if (code == HttpStatus.OK.code) {
            return HttpStatus.OK;
        } else if (code == HttpStatus.BAD_REQUEST.code) {
            return HttpStatus.BAD_REQUEST;
        } else if (code == HttpStatus.NOT_FOUND.code) {
            return HttpStatus.NOT_FOUND;
        } else if (code == HttpStatus.INTERNAL_SERVER_ERROR.code) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            return null;
        }
    }*/


}
