import java.util.Scanner;

class Main {
    public static void armas(float saldo, int categoria, int produto) {
        System.out.println("ARMAS " + "         SALDO: " + saldo + " \n " +
                "1 > AK-47 - 1000" + " \n " +
                "2 > M4-A1 - 900" + " \n " +
                "3 > RPG   - 800" + " \n " +
                "4 > AWP   - 500" + " \n " +
                "5 > AUG   - 600" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria, produto);
            case 2:  saldo -= 900; menu(saldo, categoria, produto);
            case 3:  saldo -= 800; menu(saldo, categoria, produto);
            case 4:  saldo -= 500; menu(saldo, categoria, produto);
            case 5:  saldo -= 600; menu(saldo, categoria, produto);
        }

    }

    public static void drogas(float saldo, int categoria, int produto) {
        System.out.println("DROGAS " + "         SALDO: " + saldo + " \n " +
                "1 > PHP - 1000" + " \n " +
                "2 > JAVA -0" + " \n " +
                "3 > C++" + " \n " +
                "4 > DELPHI" + " \n " +
                "5 > JAVASCRIPT" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria, produto);
            case 2:  saldo -= 900; menu(saldo, categoria, produto);
            case 3:  saldo -= 800; menu(saldo, categoria, produto);
            case 4:  saldo -= 500; menu(saldo, categoria, produto);
            case 5:  saldo -= 600; menu(saldo, categoria, produto);
        }
    }


    public static void veiculos(float saldo, int categoria, int produto) {
        System.out.println("VEICULOS " + "         SALDO: " + saldo + " \n " +
                "1 > FERRARI" + " \n " +
                "2 > LAMBO" + " \n " +
                "3 > AUDI" + " \n " +
                "4 > FIAT" + " \n " +
                "5 > TOYOTA" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria, produto);
            case 2:  saldo -= 900; menu(saldo, categoria, produto);
            case 3:  saldo -= 800; menu(saldo, categoria, produto);
            case 4:  saldo -= 500; menu(saldo, categoria, produto);
            case 5:  saldo -= 600; menu(saldo, categoria, produto);
        }

    }

    public static void extras(float saldo, int categoria, int produto) {
        System.out.println("EXTRAS " + "         SALDO: " + saldo + " \n " +
                "1 > +VIDAS" + " \n " +
                "2 > MANA" + " \n " +
                "3 > VIDA" + " \n " +
                "4 > XP" + " \n " +
                "5 > ESTAMINA" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria, produto);
            case 2:  saldo -= 900; menu(saldo, categoria, produto);
            case 3:  saldo -= 800; menu(saldo, categoria, produto);
            case 4:  saldo -= 500; menu(saldo, categoria, produto);
            case 5:  saldo -= 600; menu(saldo, categoria, produto);
        }

    }

    public static void lixo(float saldo, int categoria, int produto) {
        System.out.println("LIXO " + "         SALDO: " + saldo + " \n " +
                "1 > LIXO" + " \n " +
                "2 > LIXO" + " \n " +
                "3 > LIXO" + " \n " +
                "4 > LIXO" + " \n " +
                "5 > LIXO" + " \n "
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma arma");
        categoria = 0;
        categoria = scanner.nextInt();
        switch(categoria){
            case 1:  saldo -= 1000; menu(saldo, categoria, produto);
            case 2:  saldo -= 900; menu(saldo, categoria, produto);
            case 3:  saldo -= 800; menu(saldo, categoria, produto);
            case 4:  saldo -= 500; menu(saldo, categoria, produto);
            case 5:  saldo -= 600; menu(saldo, categoria, produto);
        }

    }

    public static void menu(float saldo, int categoria, int produto){

        System.out.println("CATEGORIAS " + "         SALDO: " + saldo + " \n " +
                "1 > ARMAS" + " \n " +
                "2 > DROGAS" + " \n " +
                "3 > VEICULOS" + " \n " +
                "4 > EXTRAS" + " \n " +
                "5 > LIXO" + " \n " +
                "6 > SAIR" + " \n "

        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma Categoria");
        categoria = scanner.nextInt();
        switch(categoria){
            case 1: armas(saldo, categoria, produto);
            case 2: drogas(saldo, categoria, produto);
            case 3: veiculos(saldo, categoria, produto);
            case 4: extras(saldo, categoria, produto);
            case 5: lixo(saldo, categoria, produto);
            case 6: System.exit(0) ;


        }

    }

    public static void main(String[] args) {
        float saldo = 1500.00f;
        int categoria = 0;
        int produto = 0;

        menu(saldo, categoria, produto);
    }




}