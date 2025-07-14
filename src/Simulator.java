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
    }
    public void decreaseSpeed() {
        this.speed -= 10;
    }

    // Direção
    public void turnRight() {
        System.out.println("Virando a direita --->");
    }
    public void turnLeft() {
        System.out.println("<--- Virando a esquerda");
    }

    // Marcha
    public void setGear(int gear) {

    }
}
