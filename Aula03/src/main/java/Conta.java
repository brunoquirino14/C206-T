public class Conta {

    double saldo, limite;

    void sacar(double quantia){
        saldo -= quantia;
    }
    void deposito(double quantia){
        saldo += quantia;
    }
}
