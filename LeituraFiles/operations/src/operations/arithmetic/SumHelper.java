package operations.arithmetic;

public final class SumHelper implements Operacao {
    //Retorna a soma de todos valores que forem passado.
    @Override
    public int calculate(int... values) {
        int result = 0;
        try {
            for (int valor : values) {
                result += valor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
