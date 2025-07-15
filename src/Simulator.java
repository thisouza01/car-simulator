public class Simulator {

    private static boolean isRunning = false;
    private int gear = 0;
    private double speed = 0.00;

    // getters
    public boolean isOn() {
        return isRunning;
    }

    public int getGear() {
        return gear;
    }

    public double getSpeed() {
        return speed;
    }

    // setters
    public static void setOn(boolean on) {
        isRunning = on;
    }

    // Velocidade
    public void increaseSpeed() {
        this.speed += 10;
        updateGear(speed);
    }
    public void decreaseSpeed() {
        this.speed -= 10;
        updateGear(speed);
    }

    // Direção
    public void turnRight() {
        System.out.println("Virando a direita --->");
    }
    public void turnLeft() {
        System.out.println("<--- Virando a esquerda");
    }

    // Marcha
    public void updateGear(double carSpeed) {
        if(carSpeed == 0){
            gear = 0;
            System.out.println("Marcha: Neutro");
        } else if (carSpeed > 0 && carSpeed <= 20) {
            gear = 1;
            System.out.println("Marcha: Primeira");
        } else if (carSpeed > 20 && carSpeed <= 40) {
            gear = 2;
            System.out.println("Marcha: Segunda");
        } else if (carSpeed > 40 && carSpeed <= 60) {
            gear = 3;
            System.out.println("Marcha: Terceira");
        } else if (carSpeed > 60 && carSpeed <= 80) {
            gear = 4;
            System.out.println("Marcha: Quarta");
        } else if (carSpeed > 80 && carSpeed <= 100) {
            gear = 5;
            System.out.println("Marcha: Quinta");
        } else if (carSpeed > 100 && carSpeed <= 120) {
            gear = 6;
            System.out.println("Marcha: Sexta");
        }
    }
}
