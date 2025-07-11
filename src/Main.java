import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        // instancio uma classe do simulador
        var car1 = new Simulator();

        if (!car1.isOn()){
            System.out.println("Carro está desligado!");
        }

        double increaseSpeed = 0.00;

        int option = 0;

        while(option != 8) {
            System.out.println("------------------------------");
            System.out.println("Para ligar o carro     - ( 1 )");
            System.out.println("Para desligar o carro  - ( 2 )");
            System.out.println("Acelerar               - ( 3 )");
            System.out.println("Desacelerar            - ( 4 )");
            System.out.println("Virar Esquerda/Direita - ( 5 )");
            System.out.println("Verificar velocidade   - ( 6 )");
            System.out.println("Trocar de marcha       - ( 7 )");
            System.out.println("------------------------------");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (car1.isOn()){
                        System.out.println("O carro já está ligado!");
                        break;
                    }

                    Simulator.setOn(true);
                    System.out.println("Carro ligou!");
                    break;

                case 2:
                    if (!car1.isOn()){
                      System.out.println("O carro já está desligado!");
                      break;
                    }

                    Simulator.setOn(false);
                    System.out.println("Carro desligou!");
                    break;

                case 3:
                    if (!car1.isOn()){
                        System.out.println("O carro precisa estar ligado!");
                        break;
                    }

                    double speed = increaseSpeed += 10;

                    car1.setSpeed(speed);
                    System.out.println("Aumentando a velocidade...");

            }

        }





    }
}
