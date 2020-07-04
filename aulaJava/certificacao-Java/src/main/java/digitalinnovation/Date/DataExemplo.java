package digitalinnovation.Date;
import java.time.LocalDateTime;
import java.util.Date;

public class DataExemplo {
        public static void main(String[] args){
            Date novaData = new Date();
            System.out.println("A data no formato antigo é é: " + novaData);

            LocalDateTime agora = LocalDateTime.now();
            System.out.println("A data no formato atual é: " + agora);

            LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
            System.out.println("A soma das datas é: " + futuro);
        }

    }

