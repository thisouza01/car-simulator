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
        double decreaseSpeed = 0.00;

        int option = 0;

        while(option != 8) {
            System.out.println("------------------------------");
            System.out.println("Para ligar o carro     - ( 1 )");
            System.out.println("Para desligar o carro  - ( 2 )");
            System.out.println("Acelerar               - ( 3 )");
            System.out.println("Desacelerar            - ( 4 )");
            System.out.println("Virar Esquerda/Direita - ( 5 )");
            System.out.println("Verificar velocidade   - ( 6 )");
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

                    if (car1.getSpeed() == 0){
                        Simulator.setOn(false);
                        System.out.println("Carro desligou!");
                        break;
                    }

                    System.out.println("O carro precisa estar parado para desligar!");
                    break;

                case 3:
                    if (!car1.isOn()){
                        System.out.println("O carro precisa estar ligado!");
                        break;
                    }

                    car1.increaseSpeed();
                    System.out.println("Aumentando a velocidade...");

                    break;

                case 4:
                    if (!car1.isOn()) {
                        System.out.println("O carro precisa estar ligado!");
                        break;
                    }

                    // Se a velocidade for mais ou igual a 10
                    if (car1.getSpeed() >= 10){
                        car1.decreaseSpeed();
                        System.out.println("Diminuindo a velocidade...");
                    } else {
                        System.out.println("O carro está parado!");
                    }

                    break;

                case 5:
                    if (!car1.isOn()) {
                        System.out.println("O carro precisa estar ligado!");
                        break;
                    }

                    if (car1.getSpeed() >= 1 && car1.getSpeed() <= 40) {
                        System.out.println("Virar para qual direção?\n1 - Direita\n2 - Esquerda\n");
                        int direction = scanner.nextInt();

                        if (direction == 1){
                            car1.turnRight();
                        } else {
                            car1.turnLeft();
                        }
                        break;

                    } else {
                        System.out.println("O carro precisa estar a pelo menos entre 1 - 40 Km/h para poder fazer a curva!");
                        break;
                    }

                case 6:
                    System.out.printf("O carro está à %s Km/h.\n", car1.getSpeed());

            }

        }





    }
}
