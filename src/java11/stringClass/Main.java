package java11.stringClass;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("1".repeat(10));
        System.out.println("test".isBlank());
        System.out.println("".isBlank());
        System.out.println("test\rtest2".lines().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("   te st ".strip());
        System.out.println("   te st ".stripLeading());
        System.out.println("   te st ".stripTrailing());


        // trim 같은 경우 \u0020 이하의 공백만 제거한다.
        // strip 은 모든 유니코드 공백 제거
        // 앞뒤로 공백이 있는 문자열
        String str = "\u2003 te st \u2003";

        // 공백 제거
        String trimStr = str.trim();
        String stripStr = str.strip();

        // 공백 제거 문자열 출력
        System.out.println("원본 문자열 : '" + str + "'");
        System.out.println("trim 문자열 : '" + trimStr + "'");
        System.out.println("strip 문자열 : '" + stripStr + "'");
    }
}
