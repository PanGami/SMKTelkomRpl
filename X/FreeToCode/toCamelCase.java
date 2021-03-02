
public class toCamelCase {
     public static String toCamelCase(final String init) {
    if (init == null)
        return null;

    final StringBuilder ret = new StringBuilder(init.length());

    for (final String word : init.split(" ")) {
        if (!word.isEmpty()) {
            ret.append(Character.toUpperCase(word.charAt(0)));
            ret.append(word.substring(1).toLowerCase());
        }
        if (!(ret.length() == init.length()))
            ret.append(" ");
    }

    return ret.toString();
}
    
    public static void main(String[]args){

        System.out.println(toCamelCase("Disini lho !!! bUat nGisi kaLimAtnYa! !")); //Ketikan Kalimat yang ingin dirubah ke Camel Case !
    }
}
