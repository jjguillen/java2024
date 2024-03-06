package usodefechas;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class IntervalosPeriodDuration {

    public static void main(String[] args) {

        //Tiempo transcurrido entre horas LocalTime
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = lt1.minusHours(1);

        Duration duration = Duration.between(lt1, lt2);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getSeconds() / 60);
        System.out.println(Duration.between(lt1, lt2).getSeconds());
        System.out.println(ChronoUnit.HOURS.between(lt1,lt2));

        //Tiempo transcurrido entre fechas LocalDate
        //Period hace el cálculo total de años, meses y días transcurridos
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = ld1.plusMonths(2).plusDays(2);

        Period periodo = Period.between(ld1, ld2);
        System.out.println(periodo.getDays());
        System.out.println(periodo.getMonths());

        System.out.println(ChronoUnit.DAYS.between(ld1,ld2));

    }
}
