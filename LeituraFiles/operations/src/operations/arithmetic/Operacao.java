package operations.arithmetic;

public interface Operacao {
    /**
     *Retorna o resultado das operacação realizada em todos valores passados.
     *
     *@param values int valores que serão realizados a operação.
     *
     * @return Retorna o resultado da operacação realizada em todos os valores passados
     * retorna {@code 0} caso não seja passado nenhum valor.
     */
    public int calculate(int... values);
}
