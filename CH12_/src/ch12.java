import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class ch12 {
    void p1(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
        System.out.println("현재시간: "+now.format(formatter));

        LocalDateTime now2 = now.plusYears(1);
        System.out.println("1년 덧셈: "+now2.format(formatter));

        LocalDateTime now3 = now2.minusMonths(2);
        System.out.println("2월 뺄셈: "+now3.format(formatter));

        LocalDateTime now4 = now2.plusDays(7);
        System.out.println("7일 덧셈: "+now4.format(formatter));

    }

    void p2(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");

        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("시작일: " + startDateTime.format(formatter));

        LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
        System.out.println("시작일: " + startDateTime.format(formatter));

        if(startDateTime.isBefore(endDateTime)){
            System.out.println("진행 중입니다.");
    } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 해: " + remainYear);
        System.out.println("남은 월: " + remainMonth);
        System.out.println("남은 일: " + remainDay);
        System.out.println("남은 시간: " + remainHour);
        System.out.println("남은 분: " + remainMinute);
        System.out.println("남은 초: " + remainSecond);
    }

    void p3(){
        double num = 1234567.89;

        DecimalFormat df;

        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
    }
}
