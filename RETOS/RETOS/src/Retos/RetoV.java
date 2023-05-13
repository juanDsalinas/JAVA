package Retos;
import java.util.Scanner;
public class RetoV {
    public static void main(String[] args) {
        // declaro las variables e inicializo en cero las que van a almacenar el resultado de una operacion
        int mes,dia;
        // instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        // pido los datos necesarios al usuario, los parceo y los guardo en variables
        System.out.println("bienvenido, este programa te indica mediante tu mes y dia de nacimiento que signo del zodiaco eres, aparte de que muestra una breve descripcion de tu signo");
        System.out.println("Indica tu mes de nacimiento siendo 1 - enero y 12 - diciembre");
        mes = leer.nextInt();
        System.out.println("Indica tu dia de nacimiento ");
        dia = leer.nextInt();
        // voy a mostrar indicar el signo del usuario dependiendo del caso seleccionado y una breve descripcion del mismo
        if(mes == 1){
            if(dia>= 0 && dia<=18){
                System.out.println("tu signo zodiacal es sagitario");
                System.out.println("Los Sagitario tienen una gran confianza en sí mismos y a menudo son el alma de la fiesta. Casi siempre caen bien por la energía positiva que desprenden y su visión optimista del futuro es contagiosa. Los nacidos bajo este signo forjan amistades nuevas con mucha facilidad y son personas muy sociables en quienes, generalmente, se puede confiar");
            }
            else if(dia >= 19 && dia <=30){
                System.out.println("tu signo zodiacal es capricornio");
                System.out.println("Los Capricornio tienen una gran necesidad de sentirse aceptados e incluidos y mantener un buen estatus social. Son personas honestas que no soportan estar rodeados de gente falsa o mentirosa y no dudarán en decir lo que piensan a la cara de nadie");
            } 
        } else if (mes == 2) {
            if(dia >= 0 && dia <= 15){
                System.out.println("tu signo zodiacal es capricornio");
                System.out.println("Los Capricornio tienen una gran necesidad de sentirse aceptados e incluidos y mantener un buen estatus social. Son personas honestas que no soportan estar rodeados de gente falsa o mentirosa y no dudarán en decir lo que piensan a la cara de nadie");
            } else if (dia >=16 && dia <=28){
                System.out.println("tu signo zodiacal es acuario");
                System.out.println("Los Acuario son los más populares del patio y tienen un don de gentes natural que les hace conquistar cualquier evento social. Saben cómo entablar conversación y dar a la gente lo que quiere, y esto les hace sentir muy poderosos pero, cuando se encuentran en situaciones íntimas con una sola persona, tienden a sentirse inseguros y tomárselo con calma");
            } 
        } else if (mes == 3) {
            if(dia>=0 && dia<=10){
                System.out.println("tu signo zodiacal es acuario"); 
                System.out.println("Los Acuario son los más populares del patio y tienen un don de gentes natural que les hace conquistar cualquier evento social. Saben cómo entablar conversación y dar a la gente lo que quiere, y esto les hace sentir muy poderosos pero, cuando se encuentran en situaciones íntimas con una sola persona, tienden a sentirse inseguros y tomárselo con calma");
            }
            else if (dia >= 11 && dia <=30){
                System.out.println("tu signo zodiacal es piscis");
                System.out.println("Los Piscis son idealistas y soñadores de nacimiento. Dados de lleno al mundo de la imaginación, sus deseos suelen ser totalmente imposibles y esto les puede llegar a causar una gran frustración con el mundo real. Pueden llegar a ser un tanto hedonistas y les gusta disfrutar de la vida al máximo sin pararse mucho a pensar. La gran mayoría de los Piscis son personas muy carismáticas con una gran determinación");
            } 
        } else if (mes == 4) {
            if(dia >= 0 && dia <=18){
                System.out.println("tu signo zodiacal es piscis");
                System.out.println("Los Piscis son idealistas y soñadores de nacimiento. Dados de lleno al mundo de la imaginación, sus deseos suelen ser totalmente imposibles y esto les puede llegar a causar una gran frustración con el mundo real. Pueden llegar a ser un tanto hedonistas y les gusta disfrutar de la vida al máximo sin pararse mucho a pensar. La gran mayoría de los Piscis son personas muy carismáticas con una gran determinación");
            } else if (dia>= 19 && dia <= 31){
                System.out.println("tu signo zodiacal es aries");
                System.out.println("Los Aries son, de todos los signos, los que más cómodos se sienten comenzando nuevos proyectos. Les gusta llevar la vara de mando y no tienen miedo de lanzarse hacia lo desconocido. Tienen un gran sentido de la aventura y les encantan los retos, sobretodo los que conllevan aprender cosas nuevas");
            }
        } else if (mes == 5) {
            if(dia>=0 && dia <= 13){
                System.out.println("tu signo zodiacal es aries");
                System.out.println("Los Aries son, de todos los signos, los que más cómodos se sienten comenzando nuevos proyectos. Les gusta llevar la vara de mando y no tienen miedo de lanzarse hacia lo desconocido. Tienen un gran sentido de la aventura y les encantan los retos, sobretodo los que conllevan aprender cosas nuevas");
            } else if (dia >= 14 && dia <=30){
                System.out.println("tu signo zodiacal es tauro");
                System.out.println("Los nacidos bajo este signo no se andan con chiquitas, lo suyo no son las aventuras y los romances breves: sólo se conformarán con su alma gemela. Eso sí, si traicionan la confianza de un Tauro difícilmente la volverán a recuperar y este se volverá receloso a la hora de conocer gente nueva");
            }
        } else if (mes == 6) {
            if(dia>=0 && dia <= 19){
                System.out.println("tu signo zodiacal es tauro");
                System.out.println("Los nacidos bajo este signo no se andan con chiquitas, lo suyo no son las aventuras y los romances breves: sólo se conformarán con su alma gemela. Eso sí, si traicionan la confianza de un Tauro difícilmente la volverán a recuperar y este se volverá receloso a la hora de conocer gente nueva");
            } else if (dia>=20 && dia <= 31){
                System.out.println("tu signo zodiacal es geminis");
                System.out.println("Las relaciones pueden llegar a ser muy complicadas para un Géminis. Curiosamente, siendo personas que experimentan cambios constantemente no se sienten muy cómodos cuando sus compañeros evolucionan y toman perspectivas diferentes ante la vida. Los nacidos bajo este signo también tienden a buscar una relación muy estable y duradera pero a menudo sienten la tentación de vivir algo más casual");
            }
        } else if (mes == 7) {
            if(dia>=0 && dia <= 20){
                System.out.println("tu signo zodiacal es geminis");
                System.out.println("Las relaciones pueden llegar a ser muy complicadas para un Géminis. Curiosamente, siendo personas que experimentan cambios constantemente no se sienten muy cómodos cuando sus compañeros evolucionan y toman perspectivas diferentes ante la vida. Los nacidos bajo este signo también tienden a buscar una relación muy estable y duradera pero a menudo sienten la tentación de vivir algo más casual");
            } else if(dia >= 21 && dia <= 31) {
                System.out.println("tu signo zodiacal es cancer");
                System.out.println("Los Cáncer tienen una gran tendencia a vivir en el pasado y esto se acentúa aún más cuando están solteros aunque, por el contrario, cuando están en una relación sana, se suelen concentrar más en el futuro próximo y se esfuerzan por cumplir todas sus metas.Los nacidos bajo este signo son amantes muy tiernos y personas muy sensibles a las que los golpes que da la vida pueden hacer mucho daño. Por este motivo, no es raro que un Cáncer esté siempre en guardia y a la defensiva, algo muy contraproducente que puede acabar alejándolo de sus seres más queridos.");
            }
        } else if (mes == 8) {
            if(dia>=0 && dia <= 9){
                System.out.println("tu signo zodiacal es cancer");
                System.out.println("Los Cáncer tienen una gran tendencia a vivir en el pasado y esto se acentúa aún más cuando están solteros aunque, por el contrario, cuando están en una relación sana, se suelen concentrar más en el futuro próximo y se esfuerzan por cumplir todas sus metas.Los nacidos bajo este signo son amantes muy tiernos y personas muy sensibles a las que los golpes que da la vida pueden hacer mucho daño. Por este motivo, no es raro que un Cáncer esté siempre en guardia y a la defensiva, algo muy contraproducente que puede acabar alejándolo de sus seres más queridos.");
            } else if (dia>=10 && dia <=31){
                System.out.println("tu signo zodiacal es leo");
                System.out.println("Se dice que los Leo son los más fáciles de reconocer a simple vista por tener un carácter muy marcado, y suele ser verdad. Cuando un Leo entra en la sala, todos los ojos se centran en él. Son líderes naturales y, la gran mayoría de ellos, disfrutan siendo el centro de atención. Quizás este sea el motivo por el que no aceptan críticas de cualquier tipo y se hacen los suecos cuando saben que han hecho algo mal");
            }
        } else if (mes == 9) {
            if(dia>=0 && dia <= 15){
                System.out.println("tu signo zodiacal es leo");
                System.out.println("Se dice que los Leo son los más fáciles de reconocer a simple vista por tener un carácter muy marcado, y suele ser verdad. Cuando un Leo entra en la sala, todos los ojos se centran en él. Son líderes naturales y, la gran mayoría de ellos, disfrutan siendo el centro de atención. Quizás este sea el motivo por el que no aceptan críticas de cualquier tipo y se hacen los suecos cuando saben que han hecho algo mal");
            } else if (dia >= 16 && dia<=31) {
                System.out.println("tu signo zodiacal es virgo");
                System.out.println("Una de las principales características de los nacidos bajo este signo es su forma lógica y estructurada de hacer las cosas. Son resolutivos y organizados por naturaleza y les encanta seguir una rutina diaria. No precisan de grandes parafernalias para ser felices, encuentran alegría en las pequeñas cosas y son personas más bien sencillas");
            }
        } else if (mes == 10) {
            if(dia>=0 && dia <= 30){
                System.out.println("tu signo zodiacal es virgo");
                System.out.println("Una de las principales características de los nacidos bajo este signo es su forma lógica y estructurada de hacer las cosas. Son resolutivos y organizados por naturaleza y les encanta seguir una rutina diaria. No precisan de grandes parafernalias para ser felices, encuentran alegría en las pequeñas cosas y son personas más bien sencillas");
            } else if (dia == 31){
                System.out.println("tu signo zodiacal es libra");
                System.out.println("La característica más inherente a los Libra es que son personas a las que les cuesta muchísimo tomar decisiones sea cual sea la magnitud de estas. Necesitan que todos los aspectos de su vida estén más o menos equilibrados para ser felices. Ellos mismos son su peor enemigo, ya que les gusta poner a prueba este balance provocando situaciones límite");
            }
        } else if (mes == 11) {
            if(dia>= 0 && dia <= 22){
                System.out.println("tu signo zodiacal es libra");
                System.out.println("La característica más inherente a los Libra es que son personas a las que les cuesta muchísimo tomar decisiones sea cual sea la magnitud de estas. Necesitan que todos los aspectos de su vida estén más o menos equilibrados para ser felices. Ellos mismos son su peor enemigo, ya que les gusta poner a prueba este balance provocando situaciones límite");
            } else if (dia>= 23 && dia<=30) {
                System.out.println("tu signo zodiacal es escorpio");
                System.out.println("No hay nada ni nadie más intenso y curioso que un Escorpio. Son personas muy introvertidas, reflexivas y, a menudo, existencialistas. Los Escorpio necesitan estar absolutamente seguros de algo antes de hacerlo. Raramente hacen caso a alguien más que a ellos mismos y les cuesta mucho centrarse en una sola cosa, por lo que suelen tener intereses muy variados. Su imaginación y gran sentido de la competitividad los hace imparables en el ámbito creativo");
            }
        } else if (mes == 12) {
            if(dia >= 0 && dia <= 31){
                System.out.println("tu signo zodiacal es sagitario");
                System.out.println("Los Sagitario tienen una gran confianza en sí mismos y a menudo son el alma de la fiesta. Casi siempre caen bien por la energía positiva que desprenden y su visión optimista del futuro es contagiosa. Los nacidos bajo este signo forjan amistades nuevas con mucha facilidad y son personas muy sociables en quienes, generalmente, se puede confiar");   
            } 
        } else  {
            System.out.println("el dia y/o el mes es invalido");
        }
    // limpiamos el buffer
    leer.close();
        
    }
}
