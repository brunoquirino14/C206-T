public class Conta {
    private double saldo, limite;

    void sacar(double quantia){
        saldo -= quantia;
    }
    void depositar(double quantia){
        saldo += quantia;
    }

    public double devolveSaldo(){
        return saldo;
    }
}
