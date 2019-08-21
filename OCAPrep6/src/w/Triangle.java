//created by Fayed Raza
//programs made in order to prepare for the oca exam
package w;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

import javax.swing.text.DateFormatter;
class Triangle{
	//programs made in order to prepare for the oca exam

    
    public static void main(String[] args) {
    LocalTime  r = LocalTime.of(3,4);
    	DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); //prints 000y 
    	System.out.print(f.format(r)); 
   
    	//System.out.println(time); // 11:22

    } 
}