package race.common;

public class Validation {

    public static boolean isOverThanMaxNameLength(int length) {
        /*
        parameter로 들어오는 length가 int가 맞는지도 검사할 것
        검사를 안 할 거면 int 값이 들어오지 않는 경우 Custom Error Message를 통해 Exception을 발생시켜야 함
        ex) isTypeOfNumber()
         */
//        isTypeOfNumber(length);
        return length > ConstVariable.NAME_LENGTH_LIMIT;
    }

//    예시)
//    private void isTypeOfNumber(여기 제네릭 타입) {
//        try {
//            Integer.parseInt(param)
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            throw new CustomException(errorMessage);
//        }
//    }
}
